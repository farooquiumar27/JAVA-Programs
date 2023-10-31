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
class main
{
public static void main(String gg[ ])
{
bbb b=new bbb( );
try
{
b.sam( );
}catch(aaa a)
{

}
}
};
