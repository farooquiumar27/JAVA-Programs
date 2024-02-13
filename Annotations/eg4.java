import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface ThinkingMachines
{
int code() default 13;
String city() default "Ujjain";
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Institute
{

}

@ThinkingMachines(code=9,city="Indore")
@Institute
class abcd
{

};

class Main
{
public static void main(String gg[])
{
Class a=abcd.class;
Annotation aa[ ]=a.getAnnotations( );
for(int i=0;i<aa.length;i++)
{
if(aa[i] instanceof ThinkingMachines)
{
ThinkingMachines tm=(ThinkingMachines)aa[i];
System.out.println("ThinkingMachines found with code : "+tm.code()+" and in city : "+tm.city()+" at index -> "+i);
}
if(aa[i] instanceof Institute)System.out.println(aa[i]+" is found at index -> "+i);
}
}
};