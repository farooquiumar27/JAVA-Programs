//This code will not compile because of checked exception raised.
class aaa extends Exception
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
