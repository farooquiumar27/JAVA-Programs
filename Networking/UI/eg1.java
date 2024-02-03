import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class xyz extends JFrame
{
public Container container;
public JTextArea textArea;
public JButton button;
static public xyz someThing;
xyz( )
{
initComponents( );
addListeners( );
}
private void initComponents( )
{
textArea=new JTextArea( );
button=new JButton("Start");
setLayout(new BorderLayout( ));
textArea.setEditable(false);
textArea.setFont(new Font("Arial Black", Font.BOLD, 15));
textArea.setCaretColor(Color.WHITE);
container=getContentPane( );
container.add(textArea,BorderLayout.CENTER);
container.add(button,BorderLayout.SOUTH);
setLocation(100,100);
setSize(400,600);
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
}
private void addListeners( )
{
button.addActionListener(new ActionListener( ){
public void actionPerformed(ActionEvent av)
{
aaa a=new aaa(someThing);
}
});
}
public static void main(String gg[])
{
someThing=new xyz( );
}
};

class aaa extends Thread
{
private xyz some;
aaa(xyz some)
{
this.some=some;
start( );
}
public void run( )
{
for(int x=0;x<3;x++)
{
some.textArea.append("Its time to play the GAME\n");
}
/*
try
{
sleep(500);
}
catch(Exception e)
{
System.out.println(e.getMessage( ));
}
*/
some.textArea.append("\n\n");
}
};