//This code wont compile.
class aaa
{
aaa(int e)
{
System.out.println("Parameterised constructor got called.");
}
};
class main
{
public static void main(String gg[ ])
{
aaa a=new aaa( );
}
};