class aaa extends RuntimeException
{

};
class bbb
{
public void sam( )
{
aaa a;
a=new aaa( );
throw a;
}
};
class main
{
public static void main(String gg[ ])
{
bbb b=new bbb( );
b.sam( );
}
};
