//This is a example of non_static initializer block.
class aaa
{
public aaa( )
{
System.out.println("Default constructor got called.");
}
{
System.out.println("Ujjain");
}
public aaa(int x)
{
System.out.println("Parameterized constructor got called.");
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
a=new aaa(100);
}
};