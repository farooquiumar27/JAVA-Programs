class main
{
public static void main(String gg[ ])
{
int x=10;
int y=0;
int z=0;
try
{
z=x/y;
System.out.println(z);
}catch(ArithmeticException b)
{
System.out.println("Catch Block");
}
finally
{
System.out.println("Finally Block");
}
}
};