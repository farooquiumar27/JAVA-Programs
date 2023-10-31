class aaa
{
public aaa( )
{
this(10);  //'this' should be at the first line.
System.out.println("Default constructor got called.");
}
public aaa(int cx)
{
System.out.println("Parameterised consturctor got called.");
}
};
class main
{
public static void main(String gg[ ])
{
aaa a=new aaa( );
aaa a2=new aaa(10);
}
};