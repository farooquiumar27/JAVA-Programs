class main
{
public static void main(String gg[ ])
{
int x=10;
int y=0;
try
{
int z=x/y;
System.out.println("Result : "+z);
}catch(ArithmeticException a)
{
a=new ArithmeticException("Cannot divide by zero");
}
System.out.println("The End");
}
};