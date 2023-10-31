class aaa<Cartoon>
{
private Cartoon x;
public void doSomething(Cartoon x)
{
this.x=x;
}
public Cartoon whatever( )
{
return this.x;
}
};

class main
{
public static void main(String gg[ ])
{
aaa<Integer> a;
a=new aaa<Integer>( );
a.doSomething(new Integer(54));
System.out.println((a.whatever( )).intValue( ));
}
};
