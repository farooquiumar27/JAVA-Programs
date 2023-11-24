import java.awt.*;
import java.awt.event.*;
class awt6 extends Frame implements ActionListener
{
private Button b1,b2;
awt6( )
{
b1=new Button("One");
b2=new Button("Two");
setLayout(new FlowLayout( ));
add(b1);
add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
setLocation(300,50);
setSize(500,100);
setVisible(true);
}
public void actionPerformed(ActionEvent ev)
{
if(ev.getSource( )==b1)
{
System.out.println("ActionPerformed got called for button 1");
}
if(ev.getSource( )==b2)
{
System.out.println("ActionPerformed got called for button 2");
}

}
};
class main
{
public static void main(String gg[ ])
{
awt6 a=new awt6( );
}
};