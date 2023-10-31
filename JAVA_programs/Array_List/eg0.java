//This is an assignment for creating create the array list.

class UFArrayList<T>
{
private Object collection[ ];
private int _size;
UFArrayList( )
{
this.collection=new Object[10];
this._size=0;
}
public void add(T data)
{
if(this._size<this.collection.length)
{
this.collection[_size]=data;
this._size++;
}
else
{
Object[ ] temp=new Object[_size*2];
for(int i=0;i<this._size;i++)temp[i]=this.collection[i];
this.collection=temp;
temp=new Object[1];
this.collection[_size]=data;
_size++;
}
}
public int size( )
{
return this._size;
}
public T get(int i)
{
return (T)this.collection[i];
}
};

class main
{
public static void main(String gg[ ])
{
UFArrayList<Integer> list;
list=new UFArrayList<Integer>();
for(int i=1000;i>0;i--)list.add(i);
for(int i=0;i<list.size( );i++)System.out.println(list.get(i));
}
};