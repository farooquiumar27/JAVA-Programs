import com.thinking.machines.util.*;
class main
{
public static void main(String gg[ ])
{
UFList<String> list=new UFLinkedList<String>( );
list.add("Ujjain");
list.add("Indore");
list.add("Dewas");
list.add("Agar");
list.add("Raltam");
list.forEach((m)->{System.out.println(m);});
UFList<String> list2=new UFArrayList<String>( );
list2.add("Pune");
list2.add("Bombay");
list2.add("Sachi");
list2.add("Kolapur");
list2.add("Panvel");
list2.forEach((m)->{System.out.println(m);});
}
};