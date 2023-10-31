class Bulb
{
private int wattage;
public void setWattage(int wattage)
{
if(wattage>=0 && wattage<=240)
{
this.wattage=wattage;
}
}
public int getWattage( )
{
return this.wattage;
}
};
class psp
{
public static void main(String gg[ ])
{
Bulb g;
g=new Bulb( );
g.setWattage(100);
System.out.println(g.getWattage( ));
}
};