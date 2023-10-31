//In JAVA also one copy of static property is shared by all the objects.
class Bulb
{
private int wattage;
private static int price;
public void setWattage(int wattage)
{
this.wattage=wattage;
}
public void setPrice(int p)
{
this.price=p;
}
public int getWattage( )
{
return this.wattage;
}
public int getPrice( )
{
return this.price;
}
};
class main
{
public static void main(String gg[ ])
{
Bulb b1=new Bulb( );
b1.setWattage(100);
b1.setPrice(150);
System.out.println("Wattage of b1 is "+b1.getWattage( ));
System.out.println("Price of b1 is "+b1.getPrice( ));
Bulb b2=new Bulb( );
b2.setWattage(60);
b2.setPrice(100);
System.out.println("Wattage of b2 is "+b2.getWattage( ));
System.out.println("Price of b2 is "+b2.getPrice( ));
System.out.println("Wattage of b1 is "+b1.getWattage( ));
System.out.println("Price of b1 is "+b1.getPrice( ));
}
};