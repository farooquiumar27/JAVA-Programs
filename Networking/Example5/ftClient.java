import java.io.*;
import java.net.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

class FileModel extends AbstractTableModel
{
private ArrayList<File> files;
FileModel( )
{
this.files=new ArrayList<>();
}
public int getRowCount()
{
return this.files.size();
}
public int getColumnCount()
{
return 2;
}
public String getColumnName(int c)
{
if(c==0)return "S.No";
return "File";
}
public Class getColumnClass(int c)
{
if(c==0)return Integer.class;
return String.class;
}
public boolean isCellEditable(int r,int c)
{
return false;
}
public Object getValueAt(int r,int c)
{
if(c==0)return r+1;
return this.files.get(r).getAbsolutePath( );
}
public void add(File file)
{
this.files.add(file);
fireTableDataChanged( );
}
public ArrayList<File> getFiles( )
{
return files;
}
};

class FTClientFrame extends JFrame
{
private String host;
private int portNumber;
private FileSelectionPanel fileSelectionPanel;
private FileUploadViewPanel fileUploadViewPanel;
private Container container;
FTClientFrame(String host,int portNumber)
{
this.host=host;
this.portNumber=portNumber;
fileSelectionPanel=new FileSelectionPanel( );
fileUploadViewPanel=new FileUploadViewPanel();
container=getContentPane( );
container.setLayout(new GridLayout(1,2));
container.add(fileSelectionPanel);
container.add(fileUploadViewPanel);
setSize(1200,600);
setLocation(10,20);
setVisible(true);
}
public void setBytesUploaded(String id,long bytes)
{

}
public void fileUploaded(String id)
{

}
class FileSelectionPanel extends JPanel implements ActionListener
{
private JLabel titleLabel;
private FileModel model;
private JTable table;
private JScrollPane jsp;
private JButton addFileButton;
FileSelectionPanel( )
{
setLayout(new BorderLayout());
titleLabel=new JLabel("Selected Files");
model=new FileModel();
table=new JTable(model);
jsp=new JScrollPane(table,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
addFileButton=new JButton("Add file");
addFileButton.addActionListener(this);
add(titleLabel,BorderLayout.NORTH);
add(jsp,BorderLayout.CENTER);
add(addFileButton,BorderLayout.SOUTH);
}
public void actionPerformed(ActionEvent ev)
{
JFileChooser jfc=new JFileChooser();
jfc.setCurrentDirectory(new File("."));
int selectedOption=jfc.showOpenDialog(this);
if(selectedOption==jfc.APPROVE_OPTION)
{
File selectedFile=jfc.getSelectedFile();
model.add(selectedFile);
}
}
public ArrayList<File> getFiles( )
{
return model.getFiles( );
}
};
class FileUploadViewPanel extends JPanel implements ActionListener
{
private JButton uploadFilesButton;
private JPanel progressPanelsContainer;
private JScrollPane jsp;
private ArrayList<ProgressPanel> progressPanels;
ArrayList<File> files;
FileUploadViewPanel( )
{
uploadFilesButton=new JButton("Upload File");
setLayout(new BorderLayout( ));
add(uploadFilesButton,BorderLayout.NORTH);
uploadFilesButton.addActionListener(this);
}
public void actionPerformed(ActionEvent ev)
{
files=fileSelectionPanel.getFiles();
if(files.size( )==0)
{
JOptionPane.showMessageDialog(FTClientFrame.this,"No files selected to upload");
return;
}
progressPanelsContainer=new JPanel( );
progressPanelsContainer.setLayout(new GridLayout(files.size( ),1));
ProgressPanel progressPanel;
progressPanels=new ArrayList<>();
for(File file:files)
{
progressPanel=new ProgressPanel(file);
progressPanels.add(progressPanel);
progressPanelsContainer.add(progressPanel);
}
jsp=new JScrollPane(progressPanelsContainer,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
add(jsp,BorderLayout.CENTER);
this.revalidate();
this.repaint();
}
class ProgressPanel extends JPanel
{
private File file;
private JLabel fileNameLabel;
private JProgressBar progressBar;
private long fileLength;
public ProgressPanel(File file)
{
this.file=file;
this.fileLength=file.length();
this.fileNameLabel=new JLabel("Uploading : "+file.getAbsolutePath( ));
this.progressBar=new JProgressBar(1,100);
setLayout(new GridLayout(2,1));
add(fileNameLabel);
add(progressBar);
}
public void updateProgressBar(long bytesUploaded)
{
int percentage;
if(bytesUploaded==fileLength)percentage=100;
else percentage=(int)(bytesUploaded*100/fileLength);
progressBar.setValue(percentage);
if(percentage==100)fileNameLabel.setText("Uploaded : "+file.getAbsolutePath( ));
}
};
};
public static void main(String gg[ ])
{
FTClientFrame fcf=new FTClientFrame("localhost",5500);
}
};

class FileUploadThread extends Thread
{
private FTClientFrame fcf;
private String id;
private File file;
private String host;
private int portNumber;
FileUploadThread(FTClientFrame fcf,String id,File file,String host,int portNumber)
{
this.fcf=fcf;
this.id=id;
this.file=file;
this.host=host;
this.portNumber=portNumber;
}

public void run( )
{
long lengthOfFile=file.length();
System.out.println("Length of file is : "+lengthOfFile);

byte header[ ]=new byte[1024];
String name=file.getName( );
System.out.println(name);

long x=lengthOfFile;
int i=0;
while(x>0)
{
header[i]=(byte)(x%10);
x=x/10;
i++;
}
header[i]=(byte)(',');
i++;
int j=0;
while(j<name.length( ))
{
header[i]=(byte)(name.charAt(j));
i++;
j++;
}
while(i<1024)
{
header[i]=(byte)32;
i++;
}
try
{
Socket socket=new Socket("localhost",5500);
OutputStream os=socket.getOutputStream( );

os.write(header,0,1024);
os.flush( );

InputStream is=socket.getInputStream( );
byte ack[ ]=new byte[1];
int bytesReadCount=0;
while(true)
{
bytesReadCount=is.read(ack);
if(bytesReadCount==-1)continue;
break;
}

FileInputStream fis=new FileInputStream(file);
int chunkSize=4096;
byte bytes[ ]=new byte[chunkSize];
x=0;
while(x<lengthOfFile)
{
bytesReadCount=fis.read(bytes);
os.write(bytes,0,bytesReadCount);
os.flush( );
x=x+bytesReadCount;
long brc=bytesReadCount;
SwingUtilities.invokeLater(()->{
fcf.setBytesUploaded(id,brc);
});
}
fis.close( );
while(true)
{
bytesReadCount=is.read(ack);
if(bytesReadCount==-1)continue;
break;
}
socket.close( );
System.out.println("File send successfully");
SwingUtilities.invokeLater(()->{
fcf.fileUploaded(id);
});
}catch(Exception e)
{
System.out.println(e);
}
}
};
