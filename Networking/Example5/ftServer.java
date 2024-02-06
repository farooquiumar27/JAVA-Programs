import java.io.*;
import java.net.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class RequestProcessor extends Thread
{
private Socket socket;
private FTServerFrame fsf;
RequestProcessor(Socket socket,FTServerFrame fsf)
{
this.socket=socket;
this.fsf=fsf;
start( );
}
public void run( )
{
try
{
OutputStream os=socket.getOutputStream( );
InputStream is=socket.getInputStream( );
byte header[ ]=new byte[1024];
byte tmp[ ]=new byte[1024];
int i=0;
int j=0;
int k=0;
int responseLength=1024;
int bytesReadCount=0;
while(j<responseLength)
{
bytesReadCount=is.read(tmp);
if(bytesReadCount==-1)continue;
for(k=0;k<bytesReadCount;k++)
{
header[i]=tmp[k];
i++;
}
j=j+bytesReadCount;
}
byte ack[ ]=new byte[1];
ack[0]=1;
os.write(ack,0,1);
os.flush( );
long lengthOfFile=0;
j=1;
i=0;
while((char)(header[i]) != ',')
{
lengthOfFile=lengthOfFile+(header[i]*j);
i++;
j=j*10;
}
i++;
StringBuffer sb=new StringBuffer( );
while(i<1024)
{
sb.append((char)header[i]);
i++;
}
String fileName=sb.toString().trim();
System.out.println("Length of file is : "+lengthOfFile);
System.out.println("Name of file : "+fileName);
fsf.updateLog("Length of file is : "+lengthOfFile);
fsf.updateLog("Name of file : "+fileName);

File file=new File("uploads"+File.separator+fileName);
if(file.exists( ))file.delete( );

FileOutputStream fos=new FileOutputStream(file,false);
long y=0;
byte bytes[ ]=new byte[4096];
while(y<lengthOfFile)
{
bytesReadCount=is.read(bytes);
if(bytesReadCount==-1)continue;
fos.write(bytes,0,bytesReadCount);
fos.flush( );
y=y+bytesReadCount;
}
fos.close( );
ack[0]=1;
os.write(ack,0,1);
os.flush( );
System.out.println("File recived");
fsf.updateLog("File recived");
socket.close( );
}catch(Exception e)
{
System.out.println(e);
fsf.updateLog(e.getMessage( ));
}
}
};

class FTServer extends Thread
{
private ServerSocket serverSocket;
private FTServerFrame fsf;
FTServer(FTServerFrame fsf)
{
this.fsf=fsf;
}
public void run( )
{
try
{
this.serverSocket=new ServerSocket(5500);
startListening( );
}
catch(Exception e)
{
System.out.println(e.getMessage( ));
}
}
public void shutDown( )
{
try
{
serverSocket.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
private void startListening( )
{
try
{
Socket socket;
RequestProcessor requestProcessor;
while(true)
{
System.out.println("Server started");
SwingUtilities.invokeLater(new Thread( ){
public void run( )
{
fsf.updateLog("Server is ready to accept on port 5500 ....");
}
});
socket=this.serverSocket.accept( );
requestProcessor=new RequestProcessor(socket,fsf);
}
}
catch(Exception e)
{
System.out.println("Server stoped Listening");
System.out.println(e.getMessage( ));
}
}
};

class FTServerFrame extends JFrame implements ActionListener
{
private FTServer server;
private JButton button;
private Container container;
private JTextArea textArea;
private JScrollPane scrollPane;
private boolean serverStatus=false;
FTServerFrame( )
{
container=getContentPane( );
container.setLayout(new BorderLayout( ));
button=new JButton("Start");
button.addActionListener(this);
textArea=new JTextArea( );
scrollPane=new JScrollPane(textArea,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
container.add(scrollPane,BorderLayout.CENTER);
container.add(button,BorderLayout.SOUTH);
setLocation(100,100);
setSize(400,400);
setVisible(true);
}
public void updateLog(String msg)
{
textArea.append(msg+"\n");
}
public void actionPerformed(ActionEvent ev)
{
if(serverStatus==false)
{
server=new FTServer(this);
server.start( );
serverStatus=true;
button.setText("Stop");
}
else
{
server.shutDown( );
serverStatus=false;
button.setText("Start");
textArea.append("Server stoped");
}
}
public static void main(String gg[ ])
{
FTServerFrame fsf=new FTServerFrame( );
}
};