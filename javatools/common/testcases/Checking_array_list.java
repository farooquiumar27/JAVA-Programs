import com.thinking.machines.util.*;
class main
{
public static void main(String gg[ ])
{
UFArrayList list;
list=new UFArrayList( );
list.add(120);
list.add(130);
list.add(300);
list.add(500);
list.add(3030);
list.add(234);
System.out.println("Size of list is : "+list.size( ));
for(int e=0;e<list.size( );e++)System.out.println(list.get(e));
UFArrayList list2;
list2=new UFArrayList( );
list.copyTo(list2);
System.out.println("After copying contents of list1 to list2");
for(int e=0;e<list2.size( );e++)System.out.println(list2.get(e));
list2.add(786);
list.removeAll( );
list2.copyTo(list);
System.out.println("After clearing the contents of list1 and copying the list2 to list1");
for(int e=0;e<list.size( );e++)System.out.println(list.get(e));
list.add(95);
list.add(369);
list.add(475);
list2.appendTo(list);
System.out.println("Appending in list1");
for(int e=0;e<list.size( );e++)System.out.println(list.get(e));
list.appendTo(list2);
System.out.println("Appending in list2");
for(int e=0;e<list2.size( );e++)System.out.println(list2.get(e));
System.out.println("GAME OVER");
}
};