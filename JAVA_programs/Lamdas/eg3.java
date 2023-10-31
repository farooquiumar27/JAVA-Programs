interface abcd
{
public int sam(int e);
};
class main
{
public static void main(String gg[ ])
{
abcd a;
a=new abcd( ){
public int sam(int e)
{
return e*e;
}
};
System.out.println(a.sam(10));
//100 lines of code
a=new abcd( ){
public int sam(int e)
{
return e+e;
}
};
System.out.println(a.sam(30));
}
};