/*
We can define the public methods inside the interface
only if we declare them as default
*/

interface aaaa
{
public void sam( );
default public void tom( )
{
System.out.println("Great");
}
}