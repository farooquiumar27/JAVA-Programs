// This example explains the generic class concept

class Bulb
{
private int w;
Bulb(int w)
{
this.w=w;
}
public void setWattage(int w)
{
this.w=w;
}
public int getWattage( )
{
return this.w;
}
};
class Toy
{
private int p;
Toy(int p)
{
this.p=p;
}
public void setPrice(int p)
{
this.p=p;
}
public int getPrice( )
{
return this.p;
}
};
class aaa<T>
{
private T x;
public void setContent(T x)
{
this.x=x;
}
public T getContent( )
{
return this.x;
}
};
class main
{
public static void main(String gg[ ])
{
aaa<Bulb> a1;
a1=new aaa<Bulb>( );
a1.setContent(new Bulb(60));
aaa<Toy> a2;
a2=new aaa<Toy>( );
a2.setContent(new Toy(1000));
Bulb b=a1.getContent( );
Toy t=a2.getContent( );
System.out.printf("Wattage is : %d\n",b.getWattage( ));
System.out.printf("Price is : %d\n",t.getPrice( ));
}
};