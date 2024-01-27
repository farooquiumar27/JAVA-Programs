import java.io.*;
import java.net.*;
class Client4
{
public static void main(String gg[ ])
{
try
{
String fileName=gg[0];
File file=new File(fileName);
if(file.exists()==false || file.isDirectory()==true)
{
System.out.println("Invalid filename : "+fileName);
return;
}
long fileLength=file.length( );
System.out.println("Length of file is : "+fileLength);

byte header[ ]=new byte[1024];
int x=1023;
for(int r=0;r<fileName.length( );r++)
{
header[x]=(byte)fileName.charAt(r);
x--;
}
header[x]=(byte)('`');
x--;
long i=fileLength;
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

FileInputStream fileInputStream=new FileInputStream(file);
byte request[ ]=new byte[1024];
int chunkSize=1024;
i=0;
x=0;
while(i<fileLength)
{
if(fileLength-i<chunkSize)chunkSize=(int)(fileLength-i);
fileInputStream.read(request,x,chunkSize);
os.write(request,0,chunkSize);
os.flush( );
i=i+chunkSize;
}

byte tmp[]=new byte[1024];
x=0;
int k=0;
int responseLength=1024;
int j=0;
while(j<responseLength)
{
bytesReadCount=is.read(tmp);
if(bytesReadCount==-1)continue;
for(k=0;k<bytesReadCount;k++)
{
header[x]=tmp[k];
x++;
}
j=j+bytesReadCount;
}

os.write(ack,0,1);
os.flush( );

x=1023;
j=1;
int len=0;
while(x>0)
{
len=len+(header[x]*j);
x--;
j=j*10;
}

byte response[ ]=new byte[len];
x=0;
responseLength=len;
j=0;
while(j<responseLength)
{
bytesReadCount=is.read(tmp);
if(bytesReadCount==-1)continue;
for(k=0;k<bytesReadCount;k++)
{
response[x]=tmp[k];
x++;
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