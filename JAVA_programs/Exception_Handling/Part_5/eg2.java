class aaa implements AutoCloseable
{
public void close( )
{
System.out.println("Close got called");
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

try(aaa a=new aaa( ))
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