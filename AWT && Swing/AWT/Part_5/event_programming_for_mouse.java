import java.awt.*;
import java.awt.event.*;
class awt9 extends Frame implements MouseListener
{
private Button b;
private TextArea ta;
awt9( )
{
super("Event programming for mouse");
b=new Button("Whatever");
ta=new TextArea( );
setLayout(new FlowLayout( ));
add(b);
add(ta);
addMouseListener(this);
addWindowListener(new WindowAdapter( ){
public void windowClosing(WindowEvent ev)
{
System.out.println("Closing window got called");
System.exit(0);
}
});
setLocation(300,200);
setSize(600,500);
setVisible(true);
}
public void mouseClicked(MouseEvent me)
{
ta.append("Mouse clicked : "+me.getClickCount( )+" times\n");
ta.append("Mouse on X : "+me.getXOnScreen( )+"\n");
ta.append("Mouse on Y : "+me.getYOnScreen( )+"\n");
ta.append("Mouse X : "+me.getX( )+"\n");
ta.append("Mouse Y : "+me.getY( )+"\n");
if(me.getButton( )==me.BUTTON1)System.out.println("Button 1 got clicked");
if(me.getButton( )==me.BUTTON2)System.out.println("Button 2 got clicked");
if(me.getButton( )==me.BUTTON3)System.out.println("Button 3 got clicked");
System.out.println("Mouse clicked got called");
}
public void mousePressed(MouseEvent me)
{
System.out.println("Mouse pressed got called");
}
public void mouseReleased(MouseEvent me)
{
System.out.println("Mouse released got called");
}
public void mouseEntered(MouseEvent me)
{
System.out.println("Mouse entered got called");
}
public void mouseExited(MouseEvent me)
{
System.out.println("Mouse exited got called");
}
};
class main
{
public static void main(String gg[ ])
{
awt9 a=new awt9( );
}
};