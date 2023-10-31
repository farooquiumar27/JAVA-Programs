//This code will not compile.

interface aaaa
{
static public void sam( )
{
System.out.println("Great");
}
}
interface bbbb
{
static public void sam( )
{
System.out.println("Cool");
}
}
class ccc implements aaaa,bbbb
{

};
class main
{
public static void main(String gg[ ])
{
ccc c;
c=new ccc( );
c.sam( );
}
};