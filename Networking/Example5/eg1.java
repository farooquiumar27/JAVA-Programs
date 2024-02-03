import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class aaa extends Thread
{
private SomeFrame sf;
aaa(SomeFrame sf)
{
this.sf=sf;
}
public void run( )
{
for(int i=1;i<=500;i++)
{
sf.updateNum(i);
}
}
};
class SomeFrame extends JFrame implements ActionListener
{
private JTextArea jta;
private JButton jb;
private JProgressBar jpb;
SomeFrame( )
{
Container container=getContentPane( );
jta=new JTextArea( );
jb=new JButton("Start");
jb.addActionListener(this);
jpb=new JProgressBar(1,500);
container.add(jpb,BorderLayout.NORTH);
container.add(jta,BorderLayout.CENTER);
container.add(jb,BorderLayout.SOUTH);
setLocation(100,100);
setSize(400,400);
setVisible(true);
}
public void updateNum(int i)
{
jta.append(i+" ");
if(i%10==0)jta.append("\n");
jpb.setValue(i);
}
public void actionPerformed(ActionEvent ev)
{
SwingUtilities.invokeLater(new aaa(this));
}
public static void main(String gg[ ])
{
SomeFrame sf=new SomeFrame( );
}
};