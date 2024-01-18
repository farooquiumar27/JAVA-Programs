import java.io.*;
import java.net.*;

class Client1
{
public static void main(String gg[ ])
{
String rollNumber=gg[0];
String name=gg[1];
String gender=gg[2];
String request,response;
request=rollNumber+","+name+","+gender+"#";
try
{
Socket socket=new Socket("localhost",5500);
OutputStream os=socket.getOutputStream( );
OutputStreamWriter osw=new OutputStreamWriter(os);
osw.write(request);
osw.flush( ); //very very important

InputStream is=socket.getInputStream( );
InputStreamReader isr=new InputStreamReader(is);
StringBuffer sb=new StringBuffer( );
int x;
while(true)
{
x=isr.read( );
if(x==-1)break;
if(x=='#')break;
sb.append((char)x);
}
response=sb.toString( );
System.out.println("Response : "+response);
socket.close( );
}catch(Exception e)
{
System.out.println(e.getMessage( ));
}
}
};