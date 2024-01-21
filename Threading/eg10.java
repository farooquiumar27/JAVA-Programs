class Main
{
public static void main(String gg[ ])
{
Thread t=new Thread( ( )->{
for(int i=501;i<=550;i++)
{
System.out.print(i+" ");
try
{
Thread.sleep(50);
}catch(InterruptedException ie)
{
System.out.println(ie);
}
}
});
t.start( );
for(int i=201;i<=250;i++)
{
System.out.print(i+" ");
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