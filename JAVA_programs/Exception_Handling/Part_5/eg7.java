//This code will compile.
class aaa implements AutoCloseable
{
public void close( )
{
System.out.println("Close got called aaa");
}
};
class bbb implements AutoCloseable
{
public void close( )
{
System.out.println("Close got called for bbb");
}
};
class main
{
public static void main(String gg[ ])
{
int x,y,z;
x=20;
y=0;
z=0;
final aaa a=new aaa( );
final bbb b=new bbb( );
try(a;b)
{
System.out.println("Some code");
z=x/y;
System.out.println(z);
}
catch(ArithmeticException ae)
{
System.out.println("Cannot divide by zero");
}
}
};