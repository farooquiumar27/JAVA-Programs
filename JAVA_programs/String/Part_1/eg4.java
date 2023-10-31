abstract class Animal
{
public int getAge( )
{
return 10;
}
};
class Donkey extends Animal
{
public int getAge( )
{
return 20;
}
};
class Monkey extends Animal
{
public int getage( )
{
return 30;
}
};
class aaa
{
public int getAge( )
{
return 75;
}
};
class Lion
{
public void eat(Animal aa)
{
int x=aa.getAge( );
System.out.println(x);
}
};
class zoo
{
final public static Lion sherkhan=new Lion( );
};
class main
{
public static void main(String gg[ ])
{
Donkey d=new Donkey( );
Monkey m=new Monkey( );
aaa a=new aaa( );
zoo.sherkhan.eat(d);
zoo.sherkhan.eat(m);
//zoo.sherkhan.eat(a);  //This line won't compile.
}
};