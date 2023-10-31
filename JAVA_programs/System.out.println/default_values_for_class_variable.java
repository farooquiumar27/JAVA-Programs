class bbb
{

};
class aaa
{
static private long a;
static private int b;
static private short c;
static private byte d;
static private double e;
static private float f;
static private char g;
static private boolean h;
static private bbb i;
static public void sam( )
{
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(e);
System.out.println(f);
System.out.println(g);
System.out.println(h);
System.out.println(i);
}
};
class main
{
public static void main(String gg[ ])
{
aaa a=new aaa( );
a.sam( );
}
};