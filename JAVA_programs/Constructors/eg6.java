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
super(10);
System.out.println("Derived default consturctor got called.");
}
public bbb(int x)
{
super(10);
System.out.println("Derived parameterised constructor got called.");
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