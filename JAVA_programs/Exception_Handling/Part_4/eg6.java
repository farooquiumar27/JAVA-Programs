//This code will compile because of checked exception raised is being transfered to JVM.
//But the good programmer will never ever declare the entry point function with throws keyword.
class aaa extends Exception
{

};
class bbb
{
public void sam( )throws aaa
{
aaa a;
a=new aaa( );
throw a;
}
};
class ccc
{
public void tom( )throws aaa
{
bbb b=new bbb( );
b.sam( );
}
};
class main
{
public static void main(String gg[ ])throws aaa
{
ccc c=new ccc( );
c.tom( );
}
};
