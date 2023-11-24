import java.awt.*;
import java.awt.event.*;
class awt8 extends Frame
{
private Checkbox cb1;
private Checkbox cb2;
private TextArea ta;
awt8( )
{
super("Event programming for checkbox");
cb1=new Checkbox("Reading");
cb2=new Checkbox("Writing");
ta=new TextArea( );
setLayout(new FlowLayout( ));
add(cb1);
add(cb2);
add(ta);
cb1.addItemListener(new ItemListener( ){
public void itemStateChanged(ItemEvent ev)
{
System.out.println("State of Reading : "+cb1.getState( ));
updateState( );
}
});
cb2.addItemListener(new ItemListener( ){
public void itemStateChanged(ItemEvent ev)
{
System.out.println("State of writing : "+cb2.getState( ));
updateState( );
}
});
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
updateState( );
}
private void updateState( )
{
ta.setText("");
if(cb1.getState( ))ta.append("Reading status : checked\n");
else ta.append("Reading status : not checked\n");
if(cb2.getState( ))ta.append("Writing status : checked\n");
else ta.append("Writing status : not checked\n");
}
};
class main
{
public static void main(String gg[ ])
{
awt8 a=new awt8( );
}
};