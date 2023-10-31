
interface aaaa
{
public void sam( );
static public void tom( )
{
System.out.println("New feature X");
}
}
interface bbbb
{
static public void tom( )
{
System.out.println("New feature Y");
}
}
class ccc implements aaaa,bbbb
{
public void sam( )
{

}
public void hhh( )
{
//tom( );  //this will not compile
aaaa.tom( );
bbbb.tom( );
}
};
class main
{
static public void main(String gg[ ])
{
aaaa.tom( );
}
};

/*
This code will compile because we can access the static methods of the interface directly.
We do not we to use the default keyword with the static methods.
*/