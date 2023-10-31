/*
This code will not compile because in java there are some strict rules redarding the generic class
that we cannot give the primitive data type as the type
We will see its solution in the eg3.java
*/

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
aaa<int> a1;
a1=new aaa<int>( );
int x=60;
a1.setContent(x);
System.out.printf("Wattage is : %d\n",a1.getWattage( ));
}
};