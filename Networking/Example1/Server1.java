import java.io.*;
import java.net.*;

class Server1
{
private ServerSocket serverSocket;
private Socket socket;
Server1( )
{
try
{
serverSocket=new ServerSocket(5500);
startListening( );
}catch(Exception e)
{
System.out.println(e.getMessage( ));
}
}
private void startListening( )
{
try
{
InputStream is;
InputStreamReader isr;
OutputStream os;
OutputStreamWriter osw;
StringBuffer sb;
String request,response;
int x;
int c1,c2;
String p1,p2,p3;
int rollNumber;
String name,gender;
while(true)
{
System.out.println("Server is ready to accept the request.....");
socket=serverSocket.accept( ); //it will put our server in waiting mode.
is=socket.getInputStream( );
isr=new InputStreamReader(is);
sb=new StringBuffer( );
while(true)
{
x=isr.read( );
if(x==-1)break;
if(x=='#')break;
sb.append((char)x);
}
request=sb.toString( );
System.out.println("Request is : "+request);
c1=request.indexOf(",");
c2=request.indexOf(",",c1+1);
p1=request.substring(0,c1);
p2=request.substring(c1+1,c2);
p3=request.substring(c2+1);
rollNumber=Integer.parseInt(p1);
name=p2;
gender=p3;
System.out.printf("Roll-Number is %d , Name is %s , Gender is %s\n",rollNumber,name,gender);
response="Data saved#";
os=socket.getOutputStream( );
osw=new OutputStreamWriter(os);
osw.write(response);
osw.flush( ); //very very important
socket.close( ); 
}
}catch(Exception e)
{
System.out.println(e.getMessage( ));
}
}
public static void main(String gg[ ])
{
Server1 server=new Server1( );
}
};