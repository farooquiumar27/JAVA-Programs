package com.thinking.machines.util;
import java.lang.reflect.*;
import java.io.*;

public class SetterGetterGenerator_me
{
public static void main(String gg[ ])
{
if(gg.length!=1 && gg.length!=2)
{
System.out.println("usage java classpath path_to_jar_file com.thinking.machines.util.SetterGetterGenerator class_name");
return ;
}
boolean found=false;
if(gg.length==2)
{
if(gg[1].equalsIgnoreCase("constructor=false")==false)
{
System.out.println("usage java classpath path_to_jar_file com.thinking.machines.util.SetterGetterGenerator class_name");
return ;
}
else
{
found=true;
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

if(found==false)
{
className=c.getSimpleName( );
//for constructor
line=className+"( )";
list.add(line);
list.add("{");
for(int e=0;e<fields.length;e++)
{
field=fields[e];
fieldType=field.getType( );
type=fieldType.getName( );
if(type.equals("short"))
{
line="this."+field.getName( )+"=0;";
list.add(line);
continue;
}
if(type.equals("int"))
{
line="this."+field.getName( )+"=0;";
list.add(line);
continue;
}
if(type.equals("long"))
{
line="this."+field.getName( )+"=0;";
list.add(line);
continue;
}
if(type.equals("byte"))
{
line="this."+field.getName( )+"=0;";
list.add(line);
continue;
}
if(type.equals("double"))
{
line="this."+field.getName( )+"=0.0;";
list.add(line);
continue;
}
if(type.equals("float"))
{
line="this."+field.getName( )+"=0.0;";
list.add(line);
continue;
}
if(type.equals("char"))
{
line="this."+field.getName( )+"=;";
list.add(line);
continue;
}
if(type.equals("boolean"))
{
line="this."+field.getName( )+"=false;";
list.add(line);
continue;
}
line="this."+field.getName( )+"=null;";
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
};