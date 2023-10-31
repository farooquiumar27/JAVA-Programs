//This code will not compile.
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
aaa a;
bbb b;
try(a=new aaa( ) ;b=new bbb( ))
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