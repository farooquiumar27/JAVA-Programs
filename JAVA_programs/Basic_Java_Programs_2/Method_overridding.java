class Dog
{
public void printName( )
{
System.out.println("Bruno");
}
public void bark( )
{
System.out.println("Bhow bhow bhow");
};
};
class GermanSheperad extends Dog
{
public void printName( )
{
System.out.println("Tommy");
}
public void jump( )
{
System.out.println("Jump jump jump");
}
};
class psp
{
public static void main(String gg[ ])
{
GermanSheperad m;
m=new GermanSheperad( );
m.printName( );
m.bark( );
m.jump( );
}
};