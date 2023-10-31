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
super.tom( );   //line--[1]
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
Whenever we want to access the method of base class through derived class and the same method
with same name and signature is present in derived class also then we can access it by using 
super. keyword inside the method of derived class.
*/