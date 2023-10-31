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
a1=new aaa<>( );  //this is also corret and this is not diamond operator.
a1.setContent(60);
int x=a1.getContent( );
System.out.println(x);
}
};