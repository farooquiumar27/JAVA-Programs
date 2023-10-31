interface aaa
{
public void sam( );
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