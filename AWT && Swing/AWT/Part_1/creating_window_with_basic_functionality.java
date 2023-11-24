import java.awt.*;
class awt1 extends Frame
{
awt1( )
{
Label l1,l2,l3,l4,l5;
TextField t1,t2;
Choice ch;
List lst;
Button b1,b2;
Checkbox c1,c2,c3;
CheckboxGroup cg1;
FlowLayout f;
l1=new Label("Mobile-number");
l2=new Label("Email-Id");
l3=new Label("City");
l4=new Label("Food");
l5=new Label("Type");
t1=new TextField(10);
t2=new TextField(50);
ch=new Choice( );
ch.add("Ujjain");
ch.add("Indore");
ch.add("Dewas");
ch.add("Mumbai");
b1=new Button("Save");
b2=new Button("Cancel");
lst=new List(4,true);
lst.add("Masala Dosa");
lst.add("Chicken tikka");
lst.add("Chicken Pizza");
lst.add("Tawa tilli");
lst.add("Fry Kaleji_Gurde");
lst.add("Shahi Faluda");
lst.add("Badam Kulfi");
c1=new Checkbox("Indian");
cg1=new CheckboxGroup( );
c2=new Checkbox("Veg",cg1,true);
c3=new Checkbox("Non-Veg",cg1,false);
f=new FlowLayout( );
setLayout(f);
add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(ch);
add(l4);
add(lst);
add(c1);
add(l5);
add(c2);
add(c3);
add(b1);
add(b2);
setLocation(300,50);
setSize(300,500);
setVisible(true);
}
};
class main
{
public static void main(String gg[ ])
{
awt1 a=new awt1( );
}
};