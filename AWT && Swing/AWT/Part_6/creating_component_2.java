import java.awt.*;
import java.awt.event.*;
class MyDrawingPad extends Canvas
{
private int lastX;
private int lastY;
MyDrawingPad( )
{
lastX=0;
lastY=0;
setBackground(new Color(100,200,120));
setForeground(Color.red);
}
public boolean mouseDown(Event ev,int x,int y)
{
lastX=x;
lastY=y;
return true;
}
public boolean mouseDrag(Event ev,int x,int y)
{
Graphics g=getGraphics( );
g.drawLine(lastX,lastY,x,y);
lastX=x;
lastY=y;
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