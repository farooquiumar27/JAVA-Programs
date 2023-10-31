//Making arrayList for the Generic.
class UFArrayList<T>
{
private int size;
private Object [ ]collection;
public UFArrayList( )
{
this.collection=new Object[10];
this.size=0;
}
public void clear( )
{
this.size=0;
}
public T removeAt(int index)
{
if(index<0 || index>=this.size)throw new IndexOutOfBoundsException("Index invalid : "+index);
T data=(T)this.collection[index];
int ep=this.size-2;
for(int e=index;e<=ep;e++)this.collection[e]=this.collection[e+1];
this.size--;
return data;
}
public void add(T data)
{
if(this.size==this.collection.length)
{
Object [ ]temp=new Object[this.size+10];
for(int e=0;e<this.size;e++)temp[e]=this.collection[e];
this.collection=temp;
}
this.collection[size]=data;
this.size++;
}
public void insertAt(T data,int index)
{
if(index<0 || index>this.size)throw new IndexOutOfBoundsException("Invalid index : "+index);
if(this.size==this.collection.length)
{
Object [ ]temp=new Object[this.size+10];
for(int e=0;e<this.size;e++)temp[e]=this.collection[e];
this.collection=temp;
}
for(int e=this.size;e>index;e--)this.collection[e]=this.collection[e-1];
this.collection[index]=data;
this.size++;
}
public T get(int index)
{
if(index<0 || index>=this.size)throw new IndexOutOfBoundsException("Invalid index : "+index);
return (T)this.collection[index];
}
public int size( )
{
return this.size;
}
};

class main
{
public static void main(String gg[ ])
{
UFArrayList<Integer> list;
list=new UFArrayList<>( );
for(int e=1;e<=500;e++)list.add(e+1000);
System.out.println("Size of list is : "+list.size( ));
System.out.println("Extracting contents of the list");
for(int e=0;e<list.size( );e++)System.out.println(list.get(e));
list.insertAt(40040,4);
System.out.println("After insertions");
for(int e=0;e<list.size( );e++)System.out.println(list.get(e));
list.clear( );
list.add(120);
list.add(130);
list.add(300);
list.add(500);
list.add(3030);
list.add(234);
System.out.println("After clearing and adding new data");
for(int e=0;e<list.size( );e++)System.out.println(list.get(e));
list.removeAt(2);
System.out.println("After removing data at index 2");
for(int e=0;e<list.size( );e++)System.out.println(list.get(e));
System.out.println("*********");
UFArrayList<String> list2;
list2=new UFArrayList<>( );
list2.add("Ujjain");
list2.add("Indore");
list2.add("Dewas");
list2.add("Ratlam");
list2.add("Bombay");
System.out.println("Size of list2 is : "+list2.size( ));
System.out.println("Extracting contents of the list2");
for(int e=0;e<list2.size( );e++)System.out.println(list2.get(e));
list2.insertAt("Heydrabad",1);
System.out.println("After insertions");
for(int e=0;e<list2.size( );e++)System.out.println(list2.get(e));
list2.clear( );
list2.add("John Cena");
list2.add("Seth Rollins");
list2.add("Rock");
list2.add("Stone cold");
list2.add("Triphle H");
list2.add("Brock");
System.out.println("After clearing and adding new data");
for(int e=0;e<list2.size( );e++)System.out.println(list2.get(e));
list2.removeAt(1);
System.out.println("After removing data at index 2");
for(int e=0;e<list2.size( );e++)System.out.println(list2.get(e));
System.out.println("GAME OVER");
}
};