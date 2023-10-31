//This is the example of static initializer block.
class aaa
{
static
{
System.out.println("Staitc initializer block 1.");
}
public aaa( )
{
System.out.println("Default constructor got called.");
}
{
System.out.println("Non-static initializer block 1.");
}
static
{
System.out.println("Staitc initializer block 2.");
}
};
class main
{
public static void main(String gg[ ])
{
aaa a;
a=new aaa( );
aaa as;
as=new aaa( ); 
}
};