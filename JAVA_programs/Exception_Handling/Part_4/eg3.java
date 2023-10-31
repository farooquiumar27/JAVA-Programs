//This code will compile because the checked exception is been handled in this.
class aaa extends Exception
{

};
class bbb
{
public void sam( )
{
aaa a;
a=new aaa( );
try
{
throw a;
}catch(aaa d)
{

}
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
