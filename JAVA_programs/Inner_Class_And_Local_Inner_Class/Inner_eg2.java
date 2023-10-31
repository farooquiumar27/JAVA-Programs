//same code used with this
class aaa
{
private int x;
aaa( )
{
this.x=10;
}
public void sam( )
{
System.out.println("Value of is "+this.x);
}
public void tiger( )
{
bbb b=new bbb( );
b.tom( );
}
class bbb
{
public void tom( )
{
System.out.println(aaa.this.x);
aaa.this.sam( );
}
};
};
class main
{
public static void main(String gg[ ])
{
aaa a=new aaa( );
a.tiger( );
}
};