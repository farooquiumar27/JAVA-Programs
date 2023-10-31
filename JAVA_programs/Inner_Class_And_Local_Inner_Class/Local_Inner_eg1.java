class aaa
{
private int x;
aaa( )
{
x=10;
}
public void sam( )
{
System.out.println("Value of is "+x);
}
public void tiger( )
{
class bbb
{
public void tom( )
{
System.out.println(aaa.this.x);
aaa.this.sam( );
}
};
bbb b=new bbb( );
b.tom( );
}
};
class main
{
public static void main(String gg[ ])
{
aaa a=new aaa( );
a.tiger( );
}
};