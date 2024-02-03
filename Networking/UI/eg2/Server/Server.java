import java.io.*;
import java.net.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;


class RequestProcessor extends Thread
{
private Socket socket;
private ServerUI ui;
RequestProcessor(Socket socket,ServerUI ui)
{
this.socket=socket;
this.ui=ui;
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
long lof=lengthOfFile;
SwingUtilities.invokeLater(( )->{
ui.updateLog("Length of file is : "+lof);
ui.updateLog("Name of file : "+fileName);
});

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
SwingUtilities.invokeLater(( )->{
ui.updateLog("File saved to : "+file.getAbsolutePath( ));
ui.updateLog("Connection closed");
});
socket.close( );
}catch(Exception e)
{
System.out.println(e);
SwingUtilities.invokeLater(( )->{
ui.updateLog(e.getMessage( )+"\n");
});
}
}
};

class Server extends Thread
{
private ServerSocket serverSocket;
private ServerUI ui;
private int port;
Server(int port,ServerUI ui)
{
this.ui=ui;
this.port=port;
}
public void run( )
{
try
{
this.serverSocket=new ServerSocket(port);
startListening( );
}
catch(Exception e)
{
System.out.println(e.getMessage( ));
SwingUtilities.invokeLater(( )->{
ui.updateLog(e.getMessage( )+"\n");
});
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
System.out.println("Server is ready to accept on port "+port+" ....");
SwingUtilities.invokeLater(( )->{
ui.updateLog("Server is ready to accept on port "+port+" ....");
});
socket=this.serverSocket.accept( );
requestProcessor=new RequestProcessor(socket,ui);
}
}
catch(Exception e)
{
System.out.println(e.getMessage( ));
SwingUtilities.invokeLater(( )->{
ui.updateLog(e.getMessage( )+"\n");
});
}
}
};