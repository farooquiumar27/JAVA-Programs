import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface ThinkingMachines
{
int value() default 10;
String city() default "Bombay";
}

@ThinkingMachines(value=13,city="Ujjain")
class abcd
{

};

class Main
{
public static void main(String gg[])
{
Class a=abcd.class;
Annotation aa=a.getAnnotation(ThinkingMachines.class);
if(aa!=null)
{
ThinkingMachines tm=(ThinkingMachines)aa;
System.out.println("ThinkingMachines annotation found with value : "+tm.value()+" in city : "+tm.city());
}
}
};