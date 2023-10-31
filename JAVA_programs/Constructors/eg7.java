//This code will not compile because super should at the first line of the constructor.
class aaa
{
public aaa(int x)
{
System.out.println("Base parameterised constructor got called.");
}
};
class bbb extends aaa
{
public bbb( )
{
System.out.println("Derived default consturctor got called.");
super(10);
}
public bbb(int x)
{
System.out.println("Derived parameterised constructor got called.");
super(10);
}
};
class main
{
public static void main(String gg[ ])
{
bbb  b=new bbb( );
bbb b2=new bbb(10);
}
};