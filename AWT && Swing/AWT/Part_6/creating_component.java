import java.awt.*;
import java.awt.event.*;
class MyDrawingPad extends Canvas
{
private int counter=0;
public boolean mouseDown(Event ev,int x,int y)
{
counter++;
System.out.println("Counter on mouse down is : "+counter);
return true;
}
public boolean mouseDrag(Event ev,int x,int y)
{
counter++;
System.out.println("Counter on mouse drag is : "+counter);
return true;
}
};
class awt10 extends Frame
{
private MyDrawingPad mpd;
awt10( )
{
super("My drawing pad");
mpd=new MyDrawingPad( );
setLayout(new BorderLayout( ));
add(mpd,BorderLayout.CENTER);
setLocation(100,100);
setSize(600,600);
setVisible(true);
}
};
class main
{
public static void main(String gg[ ])
{
awt10 a=new awt10( );
}
};