interface aaaa
{
public void sam( );
}
class bbb implements aaaa
{
public void sam( )
{
System.out.println("Great");
}
};
class ccc extends bbb
{

};
class ddd
{
public void sam( )
{
System.out.println("Cool");
}
}
class main
{
public static void main(String gg[ ])
{
aaaa a;
a=new bbb( );   //"1"
a=new ccc( );    //"2"
//a=new ddd( );   //"3"     //this won't compile
}
};

/*
"1" ->This is correct because interface pointer can store the address of the object created from 
that class which directly implements that interface.
"2" ->This is also correct because the interface pointer can also store the address of the object 
created from that class which indirectly implements that interface.
"3" -> This is not correct because in the class ddd class in not implementing the interface not directly 
neither indirectly.
*/