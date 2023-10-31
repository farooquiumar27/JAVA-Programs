class aaa
{
public void sam( )
{
System.out.println("Great");
}
};
class main
{
public static void main(String gg[ ])
{
aaa a;
a=new aaa( ){
public void sam( )
{
System.out.println("Cool");
}
};
a.sam( );
}
};