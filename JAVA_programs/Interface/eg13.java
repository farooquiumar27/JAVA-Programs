interface aaaa
{
public void sam( );
default public void tom( )
{
System.out.println("Great");
}
private void sunny( )
{
System.out.println("Cool");
}
}
class bbb implements aaaa
{
public void fan( )
{
tom( );
sunny( ); this line won't compile
}
public void sam( )
{

}
};

/*
Because private methods of the interface cannot be accessed outside from that interface 
And we do not need to declare the private methods of interfaces as default
*/