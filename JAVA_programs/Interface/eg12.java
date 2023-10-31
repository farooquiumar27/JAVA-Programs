interface aaaa
{
public void sam( );
default public void tom( )
{
System.out.println("Great");
}
}
class bbb implements aaaa
{
public void sam( )
{
System.out.println("Cool");
}
public void john( )
{
System.out.println("Happy");
}
};
class main
{
public static void main(String gg[ ])
{
aaaa a;
a=new bbb( );
a.sam( );
a.tom( );
//a.joy( ); this line won't compile
}
};

/*
So the story is that the interface pointer store the address created from the class which directly or
indirectly implements that interface.

But that interface pointer can only be able to access those motheds which are in that interface or
that interface which this interface extends and that also public. 
*/
