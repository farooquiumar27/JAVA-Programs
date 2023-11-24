import java.awt.*;
import javax.swing.*;
class swing2 extends JFrame
{
private JTable table;
private JScrollPane jsp;
private String title[ ];
private Object data[ ][ ];
private Container container;
swing2( )
{
populateDataStructure( );
table=new JTable(data,title);
Font font=new Font("Times Now Roman",Font.PLAIN,24);
table.setFont(font);
table.setRowHeight(30);
jsp=new JScrollPane(table,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
container=getContentPane( );
container.setLayout(new BorderLayout( ));
container.add(jsp);
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
private void populateDataStructure( )
{
title=new String[3];
title[0]="S.No";
title[1]="Roll.No";
title[2]="Name";
data=new Object[4][3];
data[0][0]=1;
data[0][1]=101;
data[0][2]="Sameer";
data[1][0]=2;
data[1][1]=102;
data[1][2]="Ishaan";
data[2][0]=3;
data[2][1]=103;
data[2][2]="John";
data[3][0]=4;
data[3][1]=104;
data[3][2]="Aakash";
}
};
class main
{
public static void main(String gg[ ])
{
swing2 s=new swing2( );
}
};