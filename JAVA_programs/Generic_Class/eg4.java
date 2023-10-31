//Another version.
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
aaa<Integer> a;
a=new aaa<>( );
a.doSomething(54);
Integer i=(Integer)a.getX( );
System.out.println(i.intValue( ));
}
};

//One very important thing that '<>' this is not diamond operator.