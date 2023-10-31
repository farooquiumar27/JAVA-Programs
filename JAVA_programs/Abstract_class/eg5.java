abstract class aaa
{
abstract public void sam( );
public void tom( )
{
System.out.println("Great");
}
};
class main
{
public static void main(String gg[ ])
{
aaa a;
a=new aaa( );
}
};

/*
This code will not compile because we can create pointers from an abstract class but we cannot 
create the object from an abstract class.
*/