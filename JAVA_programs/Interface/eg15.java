
interface aaaa
{
static public void tom( )
{
System.out.println("New feature X");
}
}
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