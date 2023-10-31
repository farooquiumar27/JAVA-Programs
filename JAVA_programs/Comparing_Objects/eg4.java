
class aaa<T>
{
private T x;
public void setContent(T x)
{
this.x=x;
}
public T getContent( )
{
return this.x;
}
};
class main
{
public static void main(String gg[ ])
{
aaa<Integer> a1;
a1=new aaa<Integer>( );
int x=60;
Integer u=new Integer(x); //this is known as boxing 
a1.setContent(u);
Integer j=a1.getContent( );
x=j.intValue( ); //this is known as unboxing
System.out.printf("Wattage is : %d\n",x);
}
};