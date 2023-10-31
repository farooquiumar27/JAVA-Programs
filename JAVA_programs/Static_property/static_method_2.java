/*
We can access static and non-static methods from inside the non-static methods but we can only
static from the static method.
*/
class aaa
{
public void sam( )
{
System.out.println("Great");
tom( );
}
public static void joy( )
{
System.out.println("Nice");
}
static public void tom( )
{
System.out.println("Cool");
joy( );
}
};
class main
{
public static void main(String gg[ ])
{
aaa.tom( );
aaa a=new aaa( );
a.sam( );
}
};