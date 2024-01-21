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
InputStream is;
InputStreamReader isr;
StringBuffer sb;
OutputStream os;
OutputStreamWriter osw;
String pc1,pc2,pc3;
int x;
int c1,c2;
int rollNumber;
String name,gender;
String request,response;

is=this.socket.getInputStream( );
isr=new InputStreamReader(is);
sb=new StringBuffer( );

while(true)
{
x=isr.read( );
if(x == -1)break;
if(x == '#')break;
sb.append((char)x);
}
request=sb.toString( );
System.out.println(request);
os=this.socket.getOutputStream( );
osw=new OutputStreamWriter(os);
response="Data saved#";
osw.write(response);
osw.flush( );
this.socket.close( );
}
catch(Exception e)
{
System.out.println(e.getMessage( ));
}
}
};

class Server2
{
private ServerSocket serverSocket;
Server2( )
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
Server2 server=new Server2( );
}
};