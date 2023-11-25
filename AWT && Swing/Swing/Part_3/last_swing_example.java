import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.*;
class swing4 extends JFrame
{
private Container container;
private JButton b1,b2,b3,b4,b5;
swing4( )
{
b1=new JButton(new ImageIcon("Indore_Map.png"));
b2=new JButton(new ImageIcon("Dewas_Map.png"));
b3=new JButton("3");
b4=new JButton("4");
b5=new JButton("5");
container=getContentPane( );
container.setLayout(new FlowLayout( ));
container.add(b1);
container.add(b2);
container.add(b3);
container.add(b4);
container.add(b5);
addListeners( );
int width=600;
int height=600;
setSize(width,height);
Dimension d=Toolkit.getDefaultToolkit( ).getScreenSize( );
int x=(d.width/2)-(width/2);
int y=(d.height/2)-(height/2);
setLocation(x,y);
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
}
private void addListeners( )
{
b1.addActionListener(new ActionListener( ){
public void actionPerformed(ActionEvent ev)
{
JOptionPane.showMessageDialog(swing4.this,"some message");
}
});

b2.addActionListener(new ActionListener( ){
public void actionPerformed(ActionEvent ev)
{
JOptionPane.showMessageDialog(swing4.this,"some message","Cool",JOptionPane.PLAIN_MESSAGE);
}
});

b3.addActionListener(new ActionListener( ){
public void actionPerformed(ActionEvent ev)
{
JPanel panel=new JPanel( );
panel.add(new JLabel("White Label"));
panel.add(new JLabel("Black Label"));
panel.setBorder(BorderFactory.createLineBorder(Color.red));
JOptionPane.showMessageDialog(swing4.this,panel);
}
});

b4.addActionListener(new ActionListener( ){
public void actionPerformed(ActionEvent ev)
{
int returnCode=JOptionPane.showConfirmDialog(swing4.this,"Great");
if(returnCode==JOptionPane.YES_OPTION)System.out.println("It is YES option");
else if(returnCode==JOptionPane.NO_OPTION)System.out.println("It is NO option");
System.out.println(returnCode);
}
});

b5.addActionListener(new ActionListener( ){
public void actionPerformed(ActionEvent ev)
{

}
});

}
};
class main
{
public static void main(String gg[ ])
{
swing4 s=new swing4( );
}
};