class aaa
{
public aaa( )
{
System.out.println("Base default consturctor got called.");
}
public aaa(int x)
{
System.out.println("Base parameterised constructor got called.");
}
};
class bbb extends aaa
{
public bbb( )
{
this(10);
System.out.println("Derived default consturctor got called.");
}
public bbb(int x)
{
System.out.println("Derived parameterised constructor got called.");
}
};
class main
{
public static void main(String gg[ ])
{
bbb  b=new bbb( );
}
};