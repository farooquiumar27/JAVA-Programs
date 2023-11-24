import java.awt.*;
import javax.swing.*;
import java.util.*;
class swing1 extends JFrame
{
private JLabel rollNo;
private JTextField rollNoText;

private JLabel name;
private JTextField nameText;

private JLabel city;
private JComboBox cityChoice;

private JLabel hobbies;
private JList hobbiesList;

private JLabel gender;
private JRadioButton male;
private JRadioButton female;
private ButtonGroup group;

private JLabel isIndian;
private JCheckBox isIndianCheckBox;

private JButton button1;
private JButton button2;

private Container container;
swing1( )
{
rollNo=new JLabel("Roll Nunmber");
rollNoText=new JTextField(20);

name=new JLabel("Name");
nameText=new JTextField(20);

city=new JLabel("City");
cityChoice=new JComboBox( );
cityChoice.addItem("Ujjain");
cityChoice.addItem("Indore");
cityChoice.addItem("Dewas");
cityChoice.addItem("Bombay");

hobbies=new JLabel("Hobbies");
Vector list=new Vector( );
list.addElement("Reading");
list.addElement("Writing");
list.addElement("Swimming");
list.addElement("Ridding");
list.addElement("Codding");
list.addElement("Cooking");
list.addElement("Acting");
hobbiesList=new JList(list);

gender=new JLabel("Gender");
male=new JRadioButton("Male");
female=new JRadioButton("female");
group=new ButtonGroup( );
group.add(male);
group.add(female);

isIndian=new JLabel("Indian");
isIndianCheckBox=new JCheckBox( );

button1=new JButton("Save");
button2=new JButton("Cancel");

container=getContentPane( );
container.setLayout(new FlowLayout( ));

container.add(rollNo);
container.add(rollNoText);

container.add(name);
container.add(nameText);

container.add(city);
container.add(cityChoice);

container.add(hobbies);
container.add(hobbiesList);

container.add(gender);
container.add(male);
container.add(female);

container.add(button1);
container.add(button2);

setLocation(100,100);
setSize(600,600);
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
}
};
class main
{
public static void main(String gg[ ])
{
swing1 s=new swing1( );
}
};