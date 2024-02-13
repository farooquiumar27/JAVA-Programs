import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface ThinkingMachines
{

}

@ThinkingMachines
class abcd
{

};

class pqrs
{

};
class Main
{
public static void main(String gg[])
{
Class a=abcd.class;
Class p=pqrs.class;
Annotation aa=a.getAnnotation(ThinkingMachines.class);
System.out.println(aa);
aa=p.getAnnotation(ThinkingMachines.class);
System.out.println(aa);
}
};