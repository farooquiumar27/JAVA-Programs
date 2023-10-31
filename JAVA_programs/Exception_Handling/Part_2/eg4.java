class main
{
public static void main(String gg[ ])
{
int x,y,z;
int m[ ]=new int[10];
String g="BOMBAY";
int r;
x=100;
y=50;
z=0;
try
{
z=x/y;
System.out.println(z);
m[z]=4030;
System.out.println(m[z]);
r=z+Integer.parseInt(g);
System.out.println(r);
}catch(ArithmeticException ae)
{
System.out.println("Cannot divide by zero");
}
catch(ArrayIndexOutOfBoundsException aio)
{
System.out.println("Invalid index : "+z);
}
catch(Throwable t)
{
System.out.println("Some exception");
}
}
};