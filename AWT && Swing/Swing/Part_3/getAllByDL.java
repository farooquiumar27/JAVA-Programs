import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import com.thinking.machines.hr.dl.dto.*;
import com.thinking.machines.hr.dl.interfaces.dao.*;
import com.thinking.machines.hr.dl.interfaces.dto.*;
import com.thinking.machines.hr.dl.exception.*;
import com.thinking.machines.hr.dl.dao.*;

class StudentTableModel extends AbstractTableModel
{
private Object data[ ][ ];
private String title[ ];
StudentTableModel( )
{
populateDataStructure( );
}
public int getColumnCount( )
{
return title.length;
}
public int getRowCount( )
{
return data.length;
}
public String getTitle(int ColumnIndex)
{
return title[ColumnIndex];
}
public Object getValueAt(int rowIndex,int ColumnIndex)
{
return data[rowIndex][ColumnIndex];
}
public boolean isCellEditable(int rowIndex,int ColumnIndex)
{
return false;
}
public Class getColumnClass(int columnIndex)
{
Class c=null;
try
{
if(columnIndex==0 || columnIndex==1)c=Class.forName("java.lang.Integer");
if(columnIndex==2)c=Class.forName("java.lang.String");
}
catch(Exception e)
{
System.out.println(e.getMessage( ));
}
return c;
}

private void populateDataStructure( )
{
Set<DesignationDTOInterface> designations=null;
try
{
designations=new DesignationDAO( ).getAll( );
}
catch(DAOException daoException)
{
System.out.println(daoException.getMessage( ));
}
title=new String[3];
title[0]="S.No";
title[1]="Code";
title[2]="Title";
data=new Object[designations.size( )][3];
int i=0;
for(DesignationDTOInterface designation:designations)
{
data[i][0]=i+1;
data[i][1]=designation.getCode( );
data[i][2]=designation.getTitle( );
i++;
}

}
};
class swing3 extends JFrame
{
private JTable table;
private JScrollPane jsp;
private Container container;
private StudentTableModel studentTableModel;
swing3( )
{
studentTableModel=new StudentTableModel( );
table=new JTable(studentTableModel);
Font font=new Font("Times Now Roman",Font.PLAIN,24);
table.getTableHeader( ).setReorderingAllowed(false);
table.getTableHeader( ).setFont(font);
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
};
class main
{
public static void main(String gg[ ])
{
swing3 s=new swing3( );
}
};