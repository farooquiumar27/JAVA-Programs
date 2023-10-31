package com.thinking.machines.util;
import java.lang.reflect.*;
import java.io.*;

public class SetterGetterGenerator
{
public static void main(String gg[ ])
{
if(gg.length!=1 && gg.length!=2)
{
System.out.println("usage java classpath path_to_jar_file com.thinking.machines.util.SetterGetterGenerator class_name");
return ;
}
if(gg.length==2)
{
if(gg[1].equalsIgnoreCase("constructor=false")==false && gg[1].equalsIgnoreCase("constructor=true")==false)
{
System.out.println("usage java classpath path_to_jar_file com.thinking.machines.util.SetterGetterGenerator class_name");
return ;
}
}
try
{
Class c;
c=Class.forName(gg[0]);
Field fields[ ];
Field field;
String fieldName;
String setter;
String getter;
Class fieldType;
String temp;
String line;
String className;
String type;
UFArrayList<String> list=new UFArrayList<String>( );
fields=c.getDeclaredFields( );

className=gg[0];
if(gg.length==1 || (gg.length==2 && gg[1].equalsIgnoreCase("constructor=true")==true))
{
line="public "+c.getSimpleName( )+"( )";
list.add(line);
list.add("{");
for(int i=0;i<fields.length;i++)
{
field=fields[i];
line="this."+field.getName( )+"="+getDefaultValue(field.getType( ))+";";
list.add(line);
}
list.add("}");
}
//for setter and getter
for(int e=0;e<fields.length;e++)
{
field=fields[e];
fieldName=field.getName( );
fieldType=field.getType( );
if(fieldName.charAt(0)>=97 && fieldName.charAt(0)<=122)
{
temp=fieldName.substring(0,1).toUpperCase( )+fieldName.substring(1);
}
else
{
temp=fieldName;
}
setter="set"+temp;
getter="get"+temp;
//for setter
line="public void "+setter+"("+fieldType.getName( )+" "+fieldName+")";
list.add(line);
list.add("{");
line="this."+fieldName+"="+fieldName+";";
list.add(line);
list.add("}");
//for getter
line=fieldType.getName( )+" "+getter+"( )";
list.add(line);
list.add("{");
line="return this."+fieldName+";";
list.add(line);
list.add("}");
}
File file=new File("tmp.tmp");
if(file.exists( ))file.delete( );
RandomAccessFile randomAccessFile;
randomAccessFile=new RandomAccessFile(file,"rw");
UFIterator<String> ufi;
ufi=list.iterator( );
while(ufi.hasNext( ))
{
randomAccessFile.writeBytes(ufi.next( ));
randomAccessFile.writeBytes("\r\n");
}
}
catch(ClassNotFoundException cnfe)
{
System.out.println(cnfe.getMessage( ));
}
catch(IOException ioe)
{
System.out.println(ioe.getMessage( ));
}
}
private static String getDefaultValue(Class cl)
{
String type=cl.getName( );
if(type.equals("short") || type.equals("Short"))return "0";
if(type.equals("int") || type.equals("Integer"))return "0";
if(type.equals("long") || type.equals("Long"))return "0";
if(type.equals("byte") || type.equals("Byte"))return "0";
if(type.equals("double") || type.equals("Double"))return "0.0";
if(type.equals("float") || type.equals("Float"))return "0.0f";
if(type.equals("char") || type.equals("Character"))return "' '";
if(type.equals("boolean") || type.equals("Boolean"))return "false";
if(type.equals("String"))return "\"\"";
return "null";
}
};