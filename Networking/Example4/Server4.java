import java.io.*;
import java.net.*;

class RequestProcessor extends Thread
{
private Socket socket;
RequestProcessor(Socket socket)
{
this.socket=socket;
start( );
}
public void run( )
{
try
{
InputStream is=socket.getInputStream( );
int bytesReadCount=0;
byte ack[ ]=new byte[1];
ack[0]=1;
byte tmp[]=new byte[1024];
byte header[]=new byte[1024];
int i=0;
int k=0;
int requestLength=1024;
int j=0;
while(j<requestLength)
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

OutputStream os=socket.getOutputStream( );
os.write(ack,0,1);
os.flush( );

i=1023;
String fileName="";
char c;
while(true)
{
c=(char)header[i];
i--;
if(c=='`')break;
fileName=fileName+c;
}

j=1;
int len=0;
while(i>0)
{
len=len+(header[i]*j);
i--;
j=j*10;
}

File file=new File(fileName);
FileOutputStream fileOutputStream=new FileOutputStream(file);

requestLength=len;
j=0;
while(j<requestLength)
{
bytesReadCount=is.read(tmp);
if(bytesReadCount==-1)continue;
fileOutputStream.write(tmp,0,bytesReadCount);
j=j+bytesReadCount;
}
fileOutputStream.close();

System.out.println("File received");

String responseString="File uploaded";
ByteArrayOutputStream baos=new ByteArrayOutputStream( );
ObjectOutputStream oos=new ObjectOutputStream(baos);
oos.writeObject(responseString);
oos.flush( );
byte response[ ]=baos.toByteArray( );
int responseLength=response.length;

int x;
i=responseLength;
x=1023;
header=new byte[1024];
while(i>0)
{
header[x]=(byte)(i%10);
i=i/10;
x--;
}
os.write(header,0,1024);
os.flush( );

bytesReadCount=0;
while(true)
{
bytesReadCount=is.read(ack);
if(bytesReadCount==-1)continue;
break;
}

int chunkSize=1024;
i=0;
x=0;
while(x<responseLength)
{
if(responseLength-x<chunkSize)chunkSize=responseLength-x;
os.write(response,x,chunkSize);
os.flush( );
x=x+chunkSize;
}
bytesReadCount=0;
while(true)
{
bytesReadCount=is.read(ack);
if(bytesReadCount==-1)continue;
break;
}
socket.close( );
}
catch(Exception e)
{
System.out.println(e);
}
}
};

class Server4
{
private ServerSocket serverSocket;
Server4( )
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
private void startListening( )
{
try
{
Socket socket;
RequestProcessor requestProcessor;
while(true)
{
System.out.println("Server is ready to accept on port 5500 ....");
socket=this.serverSocket.accept( );
requestProcessor=new RequestProcessor(socket);
}
}
catch(Exception e)
{
System.out.println(e.getMessage( ));
}
}
public static void main(String gg[ ])
{
Server4 server=new Server4( );
}
};
