class Bulb
{
private int wattage;
public void setWattage(int e)
{
wattage=e;
}
public int getWattage( )
{
return wattage;
}
};
class psp
{
public static void main(String gg[ ])
{
Bulb m;
m=new Bulb( );
m.setWattage(60);
System.out.println(m.getWattage( ));
}
};