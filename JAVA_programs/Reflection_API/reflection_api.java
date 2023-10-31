import java.lang.reflect.*;
class Analyzer
{
public static void main(String gg[ ])
{
if(gg.length!=1)
{
System.out.println("Usage : java Analizer class_name");
return;
}
try
{
String class_name=gg[0];
Class c=Class.forName(class_name);
System.out.println("Name[package name included] : " +c.getName( ));
System.out.println("Simple name :"+c.getSimpleName( ));
Method methods[ ];
methods=c.getDeclaredMethods( );
//getMethods( ) will include all the method including base class methods.

System.out.println("Number of methods are : "+methods.length);
Method m;
String methodName;
Class returnType;
Class parameters[ ];
for(int e=0;e<methods.length;e++)
{
m=methods[e];
methodName=m.getName( );
System.out.println("Method name : "+methodName);
returnType=m.getReturnType( );
System.out.println("Method return type : "+returnType.getName( ));
parameters=m.getParameterTypes( );
System.out.print("Method parameters are :");
for(int f=0;f<parameters.length;f++)System.out.print(" "+parameters[f].getName( ));
System.out.println( );
System.out.println("**************");
}
Field fields[ ];
fields=c.getDeclaredFields( );
System.out.println("Number of fields are : "+fields.length);
Field f;
String fieldName;
Class fieldType;
System.out.println("#############");
for(int e=0;e<fields.length;e++)
{
f=fields[e];
fieldName=f.getName( );
fieldType=f.getType( );
System.out.println("Field name : "+fieldName);
System.out.println("Field type : "+fieldType.getName( ));
System.out.println("##############");
}
}catch(ClassNotFoundException cnfe)
{
System.out.println(cnfe.getMessage( ));
}
}
};