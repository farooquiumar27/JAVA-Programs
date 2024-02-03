import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.event.*;



class ServerUI extends JFrame
{
private JLabel portNumberLabel;
private JTextField portNumberTextField;
private JButton modeButton;
private JPanel topPanel;
private Container container;
private JTextArea textArea;
private JScrollPane scrollPane;
private boolean active;
ServerUI( )
{
active=false;
initComponents( );
setApperance( );
addListeners( );
}

private void initComponents( )
{
portNumberLabel=new JLabel("Port-number");
portNumberTextField=new JTextField( );
modeButton=new JButton("Start");
topPanel=new JPanel( );

textArea=new JTextArea( );
scrollPane=new JScrollPane(textArea,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
container=getContentPane( );
}

private void setApperance( )
{
Font titleFont=new Font("Verdana",Font.BOLD,20);
Font dataFont=new Font("Verdana",Font.PLAIN,18);
portNumberLabel.setFont(titleFont);
portNumberTextField.setFont(dataFont);
modeButton.setFont(new Font("Verdana",Font.BOLD,15));
portNumberLabel.setForeground(Color.black);
modeButton.setBackground(Color.black);
modeButton.setForeground(Color.white);

textArea.setFont(dataFont);
textArea.setBackground(Color.black);
textArea.setForeground(Color.white);
textArea.setEditable(false);
container.setLayout(null);
container.setBackground(Color.white);
topPanel.setBorder(BorderFactory.createLineBorder(new Color(165,165,165)));
int lm=0;
int tm=0;

portNumberLabel.setBounds(lm+25,tm+50,200,40);
portNumberTextField.setBounds(lm+10+165,tm+53,100,30);
modeButton.setBounds(lm+10+500,tm+53,100,40);
topPanel.setBounds(lm+20,tm+25,600,90);
scrollPane.setBounds(lm+26,tm+155,589,489);
container.add(portNumberLabel);
container.add(portNumberTextField);
container.add(modeButton);
container.add(topPanel);
container.add(scrollPane);
int w=655;
int h=720;
setSize(w,h);
Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
setLocation((d.width/2)-(w/2),(d.height/2)-(h/2));
setDefaultCloseOperation(EXIT_ON_CLOSE);
setResizable(false);
}

private void addListeners( )
{
modeButton.addActionListener(new ActionListener( ){
public void actionPerformed(ActionEvent ev)
{
try
{
String portString=portNumberTextField.getText( ).trim( );
int portNumber=Integer.parseInt(portString);
if(active==false)
{
active=true;
modeButton.setText("Stop");
Server server=new Server(portNumber,ServerUI.this);
server.start( );
}
else
{

}
}
catch(Exception e)
{
textArea.append(e.getMessage( )+"\n");
}
}
});
}
public void updateLog(String msg)
{
textArea.append(msg+"\n");
}
public static void main(String gg[ ])
{
ServerUI serverUI=new ServerUI( );
serverUI.setVisible(true);
}
};