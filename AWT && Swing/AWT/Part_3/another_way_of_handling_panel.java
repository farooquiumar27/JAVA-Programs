import java.awt.*;
class HeadingPanel extends Panel
{
private Label l1;
public HeadingPanel( )
{
l1=new Label("Student(Add Module)");
setLayout(new GridLayout(1,3));
add(new Label("              "));
add(l1);
add(new Label("              "));
}
};
class ButtonPanel extends Panel
{
private Button b1,b2;
ButtonPanel( )
{
b1=new Button("Save");
b2=new Button("Cancel");
setLayout(new GridLayout(2,5));
add(new Label("              "));
add(b1);
add(new Label("              "));
add(b2);
add(new Label("              "));
add(new Label("              "));
add(new Label("              "));
add(new Label("              "));
add(new Label("              "));
add(new Label("              "));
}
}
class GenderPanel extends Panel
{
private CheckboxGroup cbg;
private Checkbox r1,r2;
GenderPanel( )
{
cbg=new CheckboxGroup( );
r1=new Checkbox("Male",cbg,true);
r2=new Checkbox("Female",cbg,false);
setLayout(new GridLayout(1,2));
add(r1);
add(r2);
}
};
class InputPanel extends Panel
{
InputPanel( )
{
Label l1,l2,l3,l4,l5,l6;
TextField t1,t2;
Choice ch;
List lst;
Checkbox cb;
GenderPanel gp;

l1=new Label("Roll number");
t1=new TextField(10);

l2=new Label("Name");
t2=new TextField(50);

l3=new Label("City");
ch=new Choice( );
ch.add("Ujjain");
ch.add("Indore");
ch.add("Dewas");
ch.add("Mumbai");

l4=new Label("Hobbies");
lst=new List(4,true);
lst.add("Reading");
lst.add("Writing");
lst.add("Typeing");
lst.add("Running");
lst.add("Swimming");
lst.add("Programming");
lst.add("Boxing");

l5=new Label("Indian");
cb=new Checkbox( );

l6=new Label("Gender");
gp=new GenderPanel( );

setLayout(new GridLayout(6,2));
add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(ch);
add(l4);
add(lst);
add(l5);
add(cb);
add(l6);
add(gp);
}
};
class awt5 extends Frame
{
awt5( )
{
HeadingPanel hp=new HeadingPanel( );
InputPanel ip=new InputPanel( );
ButtonPanel bp=new ButtonPanel( );
BorderLayout bl=new BorderLayout( );
setLayout(bl);
add(new Label("            "),BorderLayout.WEST);
add(hp,BorderLayout.NORTH);
add(ip,BorderLayout.CENTER);
add(bp,BorderLayout.SOUTH);
add(new Label("            "),BorderLayout.EAST);
setLocation(400,500);
setSize(400,300);
setVisible(true);
}
};
class main
{
public static void main(String gg[ ])
{
awt5 a=new awt5( );
}
};