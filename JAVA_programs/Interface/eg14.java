//This code  will not compile 

interface aaaa
{
public void sam( );
default public void tom( )
{
System.out.println("New feature X");
}
}
interface bbbb
{
default public void tom( )
{
System.out.println("New feature Y");
}
}
class ccc implements aaaa,bbbb
{
public void sam( )
{

}
}

/*
This code will not compile because the ambiguity arries with the tom( ) method with same
signature in both interfaces and this is not allowed in the java programming language.
*/