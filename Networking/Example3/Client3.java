import java.io.*;
import java.net.*;

class City implements Serializable
{
public int code;
public String name;
};
class Student implements Serializable
{
public int rollNumber;
public String name;
public String gender;
public City city;
};
class Client3
{
public static void main(String gg[ ])
{
try
{
int rollNumber=Integer.parseInt(gg[0]);
String name=gg[1];
String gender=gg[2];
int cityCode=Integer.parseInt(gg[3]);
String cityName=gg[4];
City c=new City( );
c.code=cityCode;
c.name=cityName;
Student student=new Student( );
student.rollNumber=rollNumber;
student.name=name;
student.gender=gender;
student.city=c;

ByteArrayOutputStream baos=new ByteArrayOutputStream( );
ObjectOutputStream oos=new ObjectOutputStream(baos);
oos.writeObject(student);
oos.flush( );
byte request[ ]=baos.toByteArray( );
int requestLength=request.length;

byte header[ ]=new byte[1024];
int i,x;
i=requestLength;
x=1023;
while(i>0)
{
header[x]=(byte)(i%10);
i=i/10;
x--;
}

Socket socket=new Socket("localhost",5500);
OutputStream os=socket.getOutputStream( );
os.write(header,0,1024);
os.flush( );

InputStream is=socket.getInputStream( );
int bytesReadCount=0;
byte ack[ ]=new byte[1];
while(true)
{
bytesReadCount=is.read(ack);
if(bytesReadCount==-1)continue;
break;
}

int chunkSize=1024;
i=0;
x=0;
while(x<requestLength)
{
if(requestLength-x<chunkSize)chunkSize=requestLength-x;
os.write(request,x,chunkSize);
os.flush( );
x=x+chunkSize;
}

byte tmp[]=new byte[1024];
i=0;
int k=0;
int responseLength=1024;
int j=0;
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

os.write(ack,0,1);
os.flush( );

i=1023;
j=1;
int len=0;
while(i>0)
{
len=len+(header[i]*j);
i--;
j=j*10;
}

byte response[ ]=new byte[len];
i=0;
responseLength=len;
j=0;
while(j<responseLength)
{
bytesReadCount=is.read(tmp);
if(bytesReadCount==-1)continue;
for(k=0;k<bytesReadCount;k++)
{
response[i]=tmp[k];
i++;
}
j=j+bytesReadCount;
}

os.write(ack,0,1);
os.flush( );

ByteArrayInputStream bais=new ByteArrayInputStream(response);
ObjectInputStream ois=new ObjectInputStream(bais);
String string=(String)ois.readObject();

System.out.println("Response : "+string);
socket.close( );
}
catch(Exception e)
{
System.out.println(e);
}
}
};