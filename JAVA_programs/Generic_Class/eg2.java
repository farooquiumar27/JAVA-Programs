//This code will not compile.
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
a.doSomething(new Integer(54));
Integer i=a.getX( );
System.out.println(i.intValue( ));  // line-[[1]]
}
};

/*
This code will not compile because if we do not specify the data_type will creating an object
then by default the data_type is choosen as Object.
line-[[1]] this line will not compile because Object cannot be converted to Integer type.
We will see its solution in eg3.java
*/