import java.util.*;
class main
{
public static void main(String gg[ ])
{
LinkedList<Integer> list=new LinkedList( );
list.add(10);
list.add(20);
list.add(30);
list.add(40);
list.add(50);
list.forEach((m)->{System.out.println(m);});
ArrayList<String> list2=new ArrayList( );
list2.add("Ujjain");
list2.add("Goa");
list2.add("Bombay");
list2.add("Delhi");
list2.forEach((m)->{System.out.println("City is "+m);});
}
};