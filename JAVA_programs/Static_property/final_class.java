//This code will not compile.
final class aaa
{
public void sam( )
{
System.out.println("Cool");
}
public void tom( )
{
System.out.println("Great");
}
};
class bbb extends aaa
{
public void joy( )
{
System.out.println("Whatever");
}
public void tom( )
{
super.tom( );
System.out.println("Nice");
}
};
class main
{
public static void main(String gg[ ])
{
bbb b=new bbb( );
b.tom( );
}
};

/*
Because if the class is declared as final then it cannot be further extended.
*/