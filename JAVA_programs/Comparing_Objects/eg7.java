interface aaaa<T>
{
public void doSomething(T x);
}
class bbb implements aaaa<String>
{
public void doSomething(String x)
{
System.out.println(x);
}
}
class main
{
public static void main(String gg[ ])
{
bbb b;
b=new bbb( );
b.doSomething("Great");
}
};