import java.awt.*;
class awt3 extends Frame
{
awt3( )
{
super("My third AWT example");
Button b1,b2,b3,b4,b5;
b1=new Button("One");
b2=new Button("Two");
b3=new Button("Three");
b4=new Button("Four");
b5=new Button("Five");
BorderLayout bl=new BorderLayout( );
setLayout(bl);
add(b1,BorderLayout.CENTER);
add(b2,BorderLayout.NORTH);
add(b3,BorderLayout.SOUTH);
add(b4,BorderLayout.EAST);
add(b5,BorderLayout.WEST);
setLocation(300,200);
setSize(400,300);
setVisible(true);
}
};
class main
{
public static void main(String gg[ ])
{
awt3 a=new awt3( );
}
};