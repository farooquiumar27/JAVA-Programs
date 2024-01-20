class aaa implements Runnable
{
aaa( )
{
Thread t=new Thread(this);
t.start( );
}
public void run( )
{
for(int j=3001;j<=3500;j++)System.out.print(j+" ");
}
};
class Main
{
public static void main(String gg[ ])
{
aaa a=new aaa( );
for(int x=201;x<=500;x++)System.out.print(x+" ");
}
};