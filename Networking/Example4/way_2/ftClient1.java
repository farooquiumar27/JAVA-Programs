import java.io.*;
import java.net.*;

class FTClient1
{
public static void main(String gg[ ])
{
String fileName=gg[0];
File file=new File(fileName);
if(file.exists( )==false)
{
System.out.println("File : "+fileName+" does not exists.");
}
if(file.isDirectory( )==true)
{
System.out.println("File : "+fileName+" is a directory.");
}
long lengthOfFile=file.length();
System.out.println("Length of file is : "+lengthOfFile);

byte header[ ]=new byte[1024];
String name=file.getName( );
System.out.println(name);

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
Socket socket=new Socket("localhost",5500);
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
}catch(Exception e)
{
System.out.println(e);
}
}
};
