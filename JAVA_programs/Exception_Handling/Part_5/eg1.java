class aaa implements AutoCloseable
{
public void close( )
{
System.out.println("Close got called");
}
};
class main
{
public static void main(String gg[ ])
{
try(aaa a=new aaa( ))
{
System.out.println("Some code");
}
}
};