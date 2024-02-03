import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.io.*;

public class ClientModel extends AbstractTableModel
{
private String title[ ];
private java.util.LinkedList<String> list;
private java.util.LinkedList<String> pathList;
static ClientModel clientModel=null;
static ClientModel getClientModel( )
{
if(clientModel==null)clientModel=new ClientModel( );
return clientModel;
}
private ClientModel( )
{
this.list=new LinkedList<String>( );
this.pathList=new LinkedList<String>( );
title=new String[2];
title[0]="S.No";
title[1]="File-Name";
}

public int getRowCount( )
{
return list.size( );
}
public int getColumnCount( )
{
return title.length;
}
public String getColumnName(int columnIndex)
{
return title[columnIndex];
}
public Class getColumnClass(int columnIndex)
{
Class c=null;
try
{
if(columnIndex==0)c=Class.forName("java.lang.Integer");
if(columnIndex==1)c=Class.forName("java.lang.String");
}catch(Exception e)
{
System.out.println(e.getMessage( ));
}
return c;
}
public boolean isCellEditable(int rowIndex,int columnIndex)
{
return false;
}
public Object getValueAt(int rowIndex,int columnIndex)
{
if(columnIndex==0)return rowIndex+1;
return list.get(rowIndex);
}

public void refresh( )
{
for(int i=list.size()-1;i>=0;i--)
{
list.remove(i);
pathList.remove(i);
}
fireTableDataChanged( );
}

public void add(File file,String path)
{
String name=file.getName( );
this.list.add(name);
this.pathList.add(path);
fireTableDataChanged( );
}
public int fileCount( )
{
return this.list.size( );
}
public boolean fileExists(String path)
{
boolean check=false;
for(int i=0;i<pathList.size( );i++)
{
if(pathList.get(i).equals(path))
{
check=true;
break;
}
}
return check;
}
public void start(ClientUI ui,String server,String port) throws Exception
{
Client client;
for(int i=0;i<list.size( );i++)client=new Client(ui,server,port,pathList.get(i));
}
};