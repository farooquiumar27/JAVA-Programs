class aaa
{
public aaa( )
{
System.out.println("Base consturctor got called.");
}
};
class bbb extends aaa
{
public bbb( )
{
System.out.println("Derived consturctor got called.");
}
};
class main
{
public static void main(String gg[ ])
{
bbb  b=new bbb( );
}
};