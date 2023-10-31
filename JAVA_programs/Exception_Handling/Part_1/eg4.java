class aaa
{
public int sam(int x,int y)
{
return x/y;
}
};
class main
{
public static void main(String gg[ ])
{
int x,y,z;
x=10;
y=0;
aaa a;
a=new aaa( );
try
{
z=a.sam(x,y);
}catch(ArithmeticException aa)
{
System.out.println("Cannot divide by zero");
}
}
};