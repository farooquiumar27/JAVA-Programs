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
a1.setContent(60); //this is known as auto-boxing
int x=a1.getContent( ); //this is known as auto-unboxing
System.out.printf("Wattage is : %d\n",x);
}
};