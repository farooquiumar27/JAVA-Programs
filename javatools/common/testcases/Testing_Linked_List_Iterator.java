import com.thinking.machines.util.*;

class main
{
public static void main(String gg[ ])
{
UFLinkedList list=new UFLinkedList( );
list.add(50);
list.add(40);
list.add(30);
list.add(20);
list.add(10);
list.getAll( );
UFIterator i;
i=list.iterator( );
int data;
while(i.hasNext( ))
{
data=(Integer)i.next( );
System.out.println(data);
}
}
};