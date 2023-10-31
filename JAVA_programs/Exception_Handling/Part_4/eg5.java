//This code will compile because of checked exception raised is now being transfered.
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
public static void main(String gg[ ])
{
ccc c=new ccc( );
try
{
c.tom( );
}catch(aaa a)
{

}
}
};
