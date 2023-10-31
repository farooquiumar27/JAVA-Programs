//This is a example of non_static initializer block.
class aaa
{
public void sam( )
{
{
System.out.println("Ujjain");
}
{
int x;
x=10;
}
System.out.println("Cool");
{
char x;
x='A';
}
}
public aaa( )
{
System.out.println("Default constructor got called.");
}
};
class main
{
public static void main(String gg[ ])
{
aaa a;
a=new aaa( );
a.sam( );
}
};