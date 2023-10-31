class aaa
{
public void sam( )
{
System.out.println("Great");
}
public static void tom( )
{
System.out.println("Cool");
}
};
class main
{
public static void main(String gg[ ])
{
//aaa.sam( );  //This is wrong because sam is a non-static method.
aaa.tom( );
aaa a=new aaa( );
a.tom( );
a.sam( );
}
};