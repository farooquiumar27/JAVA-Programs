import java.lang.reflect.*;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.FIELD})
@interface Sam
{

}
class abcd
{
@Sam
private String data1;
private int data2;
@Sam
private int data3;
public int data4;
protected int data5;
@Sam
int data6;
};

class Main
{
public static void main(String gg[ ])
{
Class a=abcd.class;
Field fields[ ]=a.getDeclaredFields( );
for(int i=0;i<fields.length;i++)
{
Annotation aa=fields[i].getAnnotation(Sam.class);
if(aa!=null)System.out.println(fields[i].getName()+" is followed by : "+aa+" at index -> "+i);
}
}
};