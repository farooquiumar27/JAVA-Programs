class Rectangle
{
private int length;
private int breath;
public void setLength(int length)
{
this.length=length;
}
public void setBreath(int breath)
{
this.breath=breath;
}
public int getLength( )
{
return this.length;
}
public int getBreath( )
{
return this.breath;
}
};
class Box extends Rectangle
{
private int height;
public void setHeight(int height)
{
this.height=height;
}
public int getHeight( )
{
return this.height;
}
};
class psp
{
public static void main(String gg[ ])
{
Box b=new Box( );
b.setLength(10);
b.setBreath(20);
b.setHeight(30);
System.out.println(b.getLength( ));
System.out.println(b.getBreath( ));
System.out.println(b.getHeight( ));
}
};