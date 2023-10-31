class Car
{
public void manual( )
{
System.out.println("Car manual");
}
}
class Maruti800 extends Car
{
public void manual( )
{
System.out.println("Maruti800 car manual");
}
};
class HondaCity extends Car
{
public void manual( )
{
System.out.println("HondaCity car manual");
}
};
class Verna extends Car
{
public void manual( )
{
System.out.println("Verna car manual");
}
};
class main
{
public static void main(String gg[ ])
{
Car c=new HondaCity( );
c.manual( );
Car c2=new Maruti800( );
c2.manual( );
Car c3=new Verna( );
c3.manual( );
}
};