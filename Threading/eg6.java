class aaa extends Thread
{
aaa( )
{
start( );
}
public void run( )
{
for(int x=1001;x<=1500;x++)
{
System.out.print(x+" ");
try
{
Thread.sleep(50);
}catch(InterruptedException ie)
{
System.out.println(ie);
}
}
}
};

class Main
{
public static void main(String gg[ ])
{
aaa a=new aaa( );
for(int x=201;x<=250;x++)
{
System.out.print(x+" ");
try
{
Thread.sleep(50);
}catch(InterruptedException ie)
{
System.out.println(ie);
}
}

for(int x=501;x<=550;x++)
{
System.out.print(x+" ");
try
{
Thread.sleep(50);
}catch(InterruptedException ie)
{
System.out.println(ie);
}
}
}
};