class Bulb
{
private int wattage;
public Bulb( )
{
this.wattage=0;
}
public void setWattage(int wattage)
{
this.wattage=wattage;
}
public int getWattage( )
{
return this.wattage;
}
};
class main
{
public static void main(String gg[ ])
{
Bulb b[ ];
b=new Bulb[3];
for(int i=0;i<b.length;i++)b[i]=new Bulb( );
b[0].setWattage(60);
b[1].setWattage(100);
b[2].setWattage(180);
System.out.println("Wattage set");
for(int i=0;i<b.length;i++)System.out.println(b[i].getWattage( ));
}
};