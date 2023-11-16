import java.awt.*;
class awt4 extends Frame
{
awt4( )
{
Label heading,l1,l2,l3,l4,l5,l6;
TextField t1,t2;
Choice ch;
List lst;
Button b1,b2;
Checkbox cb;
CheckboxGroup cbg;
Checkbox r1,r2;

heading=new Label("Student(Add Module)");
Panel p1=new Panel( );
p1.setLayout(new GridLayout(1,3));
p1.add(new Label("              "));
p1.add(heading);
p1.add(new Label("              "));

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
cbg=new CheckboxGroup( );
r1=new Checkbox("Male",cbg,true);
r2=new Checkbox("Female",cbg,false);
Panel p2=new Panel( );
p2.setLayout(new GridLayout(1,5));
p2.add(new Label("              "));
p2.add(r1);
p2.add(new Label("              "));
p2.add(r2);
p2.add(new Label("              "));

b1=new Button("Save");
b2=new Button("Cancel");
Panel p3=new Panel( );
p3.setLayout(new GridLayout(2,5));
p3.add(new Label("              "));
p3.add(b1);
p3.add(new Label("              "));
p3.add(b2);
p3.add(new Label("              "));
p3.add(new Label("              "));
p3.add(new Label("              "));
p3.add(new Label("              "));
p3.add(new Label("              "));
p3.add(new Label("              "));

Panel p4=new Panel( );
p4.setLayout(new GridLayout(6,2));
p4.add(l1);
p4.add(t1);
p4.add(l2);
p4.add(t2);
p4.add(l3);
p4.add(ch);
p4.add(l4);
p4.add(lst);
p4.add(l5);
p4.add(cb);
p4.add(l6);
p4.add(p2);

BorderLayout bl=new BorderLayout( );
setLayout(bl);
add(new Label("            "),BorderLayout.WEST);
add(p1,BorderLayout.NORTH);
add(p4,BorderLayout.CENTER);
add(p3,BorderLayout.SOUTH);
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
awt4 a=new awt4( );
}
};