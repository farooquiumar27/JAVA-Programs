//This is a example of non_static initializer block.
class aaa
{
{
System.out.println("Ujjain");
}
{
System.out.println("Indore");
}
public aaa( )
{
System.out.println("Default constructor got called.");
}
{
System.out.println("Goa");
}
};
class main
{
public static void main(String gg[ ])
{
aaa a;
a=new aaa( );
}
};