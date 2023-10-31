//In this we want to call the method of base class from the instance of the derived class.
class aaa
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
tom( );   //line--[1]
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
This code will compile but the applilcation will crash because of "line--[1]" , it will be responsible
of the infinte recursion.
*/