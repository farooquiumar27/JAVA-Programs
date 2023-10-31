//This code will compile.
class aaa<Cartoon>
{
private Cartoon x;
public void doSomething(Cartoon x)
{
this.x=x;
}
public Cartoon getX( )
{
return this.x;
}
};

class main
{
public static void main(String gg[ ])
{
aaa a;
a=new aaa( );
a.doSomething(54);
Integer i=(Integer)a.getX( );
System.out.println(i.intValue( ));
}
};
