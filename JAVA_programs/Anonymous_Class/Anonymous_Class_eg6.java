interface aaa
{
public void sam( );
};
class bbb
{
public void tiger(aaa a)
{
a.sam( );
}
};
class main
{
public static void main(String gg[ ])
{
bbb b=new bbb( );
b.tiger(new aaa( ){
public void sam( )
{
System.out.println("Cool");
}
});
}
};