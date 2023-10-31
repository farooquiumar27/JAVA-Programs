//Now this code will not compile.
class aaa
{
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