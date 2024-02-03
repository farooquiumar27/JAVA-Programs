import java.io.*;
import java.net.*;

class Client
{
Client(ClientUI ui,String name,String server,String port)throws Exception
{
start(ui,name,server,port);
}
private void start(ClientUI ui,String server,String port,String gg) throws Exception
{
if(server.equalsIgnoreCase("localhost")==false)
{
throw new Exception("Only localhost supported\n");
}
int portNumber=0;
try
{
portNumber=Integer.parseInt(port);
}
catch(Exception e)
{
throw new Exception("Invalid port-number\n");
}
String fileName=gg;
File file=new File(fileName);
if(file.exists( )==false)
{
System.out.println("File : "+fileName+" does not exists.");
ui.console_log("File : "+fileName+" does not exists."+"\n");
}
if(file.isDirectory( )==true)
{
System.out.println("File : "+fileName+" is a directory.");
ui.console_log("File : "+fileName+" is a directory.");
}
long lengthOfFile=file.length();
System.out.println("Length of file is : "+lengthOfFile);
ui.console_log("Length of file is : "+lengthOfFile);

byte header[ ]=new byte[1024];
String name=file.getName( );
System.out.println(name);
ui.console_log(name);

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
Socket socket=new Socket("localhost",portNumber);
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
ui.console_log("File send successfully\n");
}catch(Exception e)
{
System.out.println(e);
throw new Exception(e.getMessage( )+"\n");
}
}
};
