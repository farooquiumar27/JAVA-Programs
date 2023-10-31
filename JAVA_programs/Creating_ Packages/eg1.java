//We have to remember that we have to provide the classpath at the time of compilation.

import pqrs.abcd.*;
import pqrs.*;

class main
{
public static void main(String gg[ ])
{
Bulb b=new Bulb( );
Toy t=new Toy( );
TV tv=new TV( );
b.setWattage(60);
t.setPrice(100);
tv.setPrice(8999);
int wattage=b.getWattage( );
int toy_price=t.getPrice( );
int tv_price=tv.getPrice( );
System.out.println("Wattage : "+wattage);
System.out.println("Toy price : "+toy_price);
System.out.println("TV price : "+tv_price);
}
};