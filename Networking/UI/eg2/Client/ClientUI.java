import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.table.*;



class ClientUI extends JFrame
{
private JLabel serverLabel;
private JTextField serverTextField;
private JLabel portNumberLabel;
private JTextField portNumberTextField;
private JButton selectButton;
private JButton startButton;
private JButton removeButton;
private JPanel topPanel;
private JPanel clientPanel;
private Container container;
private JTable clientTable;
private JScrollPane tableScrollPane;
private JTableHeader header;
private ClientModel clientModel;
private boolean status;
private JLabel _statusLabel;
private JLabel statusLabel;
private JTextArea textArea;
private JScrollPane textAreaScrollPane;
private 
ClientUI( )
{
status=false;
initComponents( );
setApperance( );
addListeners( );
}

private void initComponents( )
{
clientModel=ClientModel.getClientModel( );
serverLabel=new JLabel("Server");
serverTextField=new JTextField( );
portNumberLabel=new JLabel("Port");
portNumberTextField=new JTextField( );
startButton=new JButton("Start");
removeButton=new JButton("Remove File");
selectButton=new JButton("Select File");
topPanel=new JPanel( );
clientPanel=new JPanel( );

clientTable=new JTable(clientModel);
tableScrollPane=new JScrollPane(clientTable,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
header=clientTable.getTableHeader( );
_statusLabel=new JLabel("Status :");
statusLabel=new JLabel("Not Connected");
textArea=new JTextArea( );
textAreaScrollPane=new JScrollPane(textArea,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
container=getContentPane( );
}

private void setApperance( )
{
Font titleFont=new Font("Verdana",Font.BOLD,20);
Font dataFont=new Font("Verdana",Font.PLAIN,18);
serverLabel.setFont(titleFont);
serverTextField.setFont(dataFont);
portNumberLabel.setFont(titleFont);
portNumberTextField.setFont(dataFont);
selectButton.setFont(new Font("Verdana",Font.BOLD,17));
startButton.setFont(new Font("Verdana",Font.BOLD,17));
removeButton.setFont(new Font("Verdana",Font.BOLD,17));
serverLabel.setForeground(Color.black);
portNumberLabel.setForeground(Color.black);
selectButton.setBackground(Color.black);
selectButton.setForeground(Color.white);
removeButton.setBackground(Color.black);
removeButton.setForeground(Color.white);
startButton.setBackground(new Color(51,0,0));
startButton.setForeground(Color.white);

header.setFont(titleFont);
header.setReorderingAllowed(false);
header.setResizingAllowed(false);
header.setBackground(Color.white);
header.setForeground(Color.black);
clientTable.setFont(dataFont);
clientTable.setRowHeight(25);
clientTable.getColumnModel( ).getColumn(0).setPreferredWidth(420);
clientTable.setRowSelectionAllowed(false);
clientTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
clientTable.getColumnModel().getColumn(0).setPreferredWidth(5);
clientTable.getColumnModel().getColumn(1).setPreferredWidth(150);
//clientTable.setBackground(Color.black);
//clientTable.setBackground(Color.white);
tableScrollPane.getViewport().setBackground(Color.WHITE);
container.setLayout(null);
container.setBackground(Color.white);
topPanel.setBackground(Color.white);
clientPanel.setBackground(Color.black);
topPanel.setBorder(BorderFactory.createLineBorder(new Color(165,165,165)));
clientPanel.setBorder(BorderFactory.createLineBorder(new Color(165,165,165)));
_statusLabel.setFont(titleFont);
_statusLabel.setForeground(Color.black);
statusLabel.setFont(titleFont);
statusLabel.setForeground(Color.red);
textArea.setBackground(Color.black);
textArea.setForeground(Color.white);
textArea.setFont(dataFont);
textArea.setEditable(false);

int lm=0;
int tm=0;

serverLabel.setBounds(lm+25,tm+50,200,40);
serverTextField.setBounds(lm+10+95,tm+53,125,30);
portNumberLabel.setBounds(lm+250+25,tm+50,150,40);
portNumberTextField.setBounds(lm+10+20+300,tm+53,125,30);
topPanel.setBounds(lm+20,tm+25,450,90);
selectButton.setBounds(lm+20,tm+150,150,40);
removeButton.setBounds(lm+20+150+150,tm+150,150,40);
tableScrollPane.setBounds(lm+22,tm+202,395+50,295);
clientPanel.setBounds(lm+20,tm+200,400+50,300);
startButton.setBounds(lm+380,tm+200+300+10,90,40);
_statusLabel.setBounds(lm+25,tm+600,100,30);
statusLabel.setBounds(lm+120,tm+600,200,30);
textAreaScrollPane.setBounds(lm+22+445+22,tm+50,395+50,495+85);

container.add(serverLabel);
container.add(serverTextField);
container.add(portNumberLabel);
container.add(portNumberTextField);
//container.add(topPanel);
container.add(selectButton);
container.add(removeButton);
container.add(tableScrollPane);
container.add(clientPanel);
container.add(startButton);
container.add(_statusLabel);
container.add(statusLabel);
container.add(textAreaScrollPane);

int w=970;
int h=700;
setSize(w,h);
Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
setLocation((d.width/2)-(w/2),(d.height/2)-(h/2));
setDefaultCloseOperation(EXIT_ON_CLOSE);
setResizable(false);
}

private void addListeners( )
{
this.selectButton.addActionListener(new ActionListener( ){
public void actionPerformed(ActionEvent ev)
{
UIManager.put("FileChooser.saveButtonText","Select");
JFileChooser jfc=new JFileChooser( );
jfc.setCurrentDirectory(new java.io.File("."));
int selectedOption=jfc.showSaveDialog(ClientUI.this);
try
{
java.io.File selectedFile=jfc.getSelectedFile( );
String filePath=selectedFile.getAbsolutePath( );
if(clientModel.fileExists(filePath))JOptionPane.showMessageDialog(ClientUI.this,"File already uploaded");
else
{
clientModel.add(selectedFile,filePath);
JOptionPane.showMessageDialog(ClientUI.this,"File added");
}
}
catch(Exception e)
{
System.out.println(e.getMessage( ));
}
}
});
this.startButton.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ev)
{
try
{
if(clientModel.fileCount( )>0)
{
clientModel.start(ClientUI.this,serverTextField.getText( ),portNumberTextField.getText( ));
statusLabel.setText("Successfull");
statusLabel.setForeground(new Color(0,153,0));
clientModel.refresh( );
}
else
{
JOptionPane.showMessageDialog(ClientUI.this,"No file selected");
}
}
catch(Exception e)
{
textArea.append(e.getMessage( )+"\n");
statusLabel.setText("Error");
statusLabel.setForeground(Color.red);
}
}
});
this.removeButton.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ev)
{
try
{
if(clientModel.fileCount( )>0)
{
}
else
{
JOptionPane.showMessageDialog(ClientUI.this,"No file selected");
}
}
catch(Exception e)
{
textArea.append(e.getMessage( )+"\n");
statusLabel.setText("Error");
statusLabel.setForeground(Color.red);
}
}
});

}

public void console_log(String gg)
{
textArea.append(gg+"\n");
System.out.println(gg);
}

public static void main(String gg[ ])
{
ClientUI clientUI=new ClientUI( );
clientUI.setVisible(true);
}
};