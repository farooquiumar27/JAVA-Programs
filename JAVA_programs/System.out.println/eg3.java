class aaa
{
public void sam(int x)
{
System.out.println(x);
}
public void sam(char x)
{
System.out.println(x);
}
};
class bbb
{
static public aaa a=new aaa( );
};
class main
{
public static void main(String gg[ ])
{
bbb.a.sam(10);
bbb.a.sam('A');
}
};