import java.awt.*;
class awt2 extends Frame
{
awt2( )
{
super("My second AWT example");
Button b1,b2,b3,b4,b5,b6;
b1=new Button("One");
b2=new Button("Two");
b3=new Button("Three");
b4=new Button("Four");
b5=new Button("Five");
b6=new Button("Siz");
GridLayout gl=new GridLayout(2,6);
setLayout(gl);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
setLocation(300,200);
setSize(400,300);
setVisible(true);
}
};
class main
{
public static void main(String gg[ ])
{
awt2 a=new awt2( );
}
};