import java.awt.*;
import java.awt.event.*;
class awt7 extends Frame implements ItemListener , WindowListener
{
private Checkbox cb1;
private Checkbox cb2;
private TextArea ta;
awt7( )
{
super("Event programming for checkbox");
cb1=new Checkbox("Reading");
cb2=new Checkbox("Writing");
ta=new TextArea( );
setLayout(new FlowLayout( ));
add(cb1);
add(cb2);
add(ta);
cb1.addItemListener(this);
cb2.addItemListener(this);
addWindowListener(this);
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
public void itemStateChanged(ItemEvent ev)
{
if(ev.getItemSelectable( )==cb1)
{
System.out.println("Reading status : "+cb1.getState( ));
}
if(ev.getItemSelectable( )==cb2)
{
System.out.println("Writing status : "+cb2.getState( ));
}
updateState( );
}
public void windowOpened(WindowEvent ev)
{
System.out.println("Window_Opened got called");
}
public void windowActivated(WindowEvent ev)
{
System.out.println("Window_Activated got called");
}
public void windowIconified(WindowEvent ev)
{
System.out.println("Window_Iconified got called");
}
public void windowDeiconified(WindowEvent ev)
{
System.out.println("Window_Deiconified got called");
}
public void windowClosed(WindowEvent ev)
{
System.out.println("Window_Closed got called");
}
public void windowClosing(WindowEvent ev)
{
System.out.println("Window_Closing got called");
System.exit(0);
}
public void windowDeactivated(WindowEvent ev)
{
System.out.println("Window_Deactivated got called");
}
};
class main
{
public static void main(String gg[ ])
{
awt7 a=new awt7( );
}
};