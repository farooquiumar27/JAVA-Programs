class aaa
{
public void sam(long a)
{
System.out.println("Long method");
System.out.println(a);
}
public void sam(int b)
{
System.out.println("Int method");
System.out.println(b);
}
};
class main
{
public static void main(String gg[ ])
{
aaa a=new aaa( );
long x=10;
int y=20;
a.sam(x);
a.sam(y);
}
};