//This is a example of non_static initializer block.
class aaa
{
public void main( )
{
{
System.out.println("Ujjain");
}
{
System.out.println("Indore");
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
a.main( );
}
};