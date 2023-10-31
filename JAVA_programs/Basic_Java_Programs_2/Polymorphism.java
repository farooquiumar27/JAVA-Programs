class Calculator
{
public void add(int e,int f)
{
System.out.println((e+f));
}
public void add(int e,int f,int g)
{
System.out.println((e+f+g));
}
};
class psp
{
public static void main(String gg[ ])
{
Calculator cal=new Calculator( );
cal.add(10,20);
cal.add(10,20,30);
}
};