package com.thinking.machines.util;
public class UFLinkedList<T> implements UFList<T>
{
private class UFNode<T>
{
public T data;
public UFNode<T> next;
UFNode( )
{
this.data=null;
this.next=null;
}
};
private int size;
private UFNode<T> start;
private UFNode<T> end;

public UFLinkedList( )
{
this.size=0;
this.start=null;
this.end=null;
}

public void add(T data)
{
UFNode<T> t;
t=new UFNode<T>( );
t.data=data;
if(this.size==0)
{
this.start=t;
this.end=t;
}
else
{
this.end.next=t;
this.end=t;
}
this.size++;
}
public void getAll( )
{
int f=0;
for(UFNode e=start;f<this.size;e=e.next,f++)
{
System.out.println(e.data);
}
}
public void add(int index,T data)
{
if(index<0)throw new IndexOutOfBoundsException("Invalid index : "+index);
if(index>=this.size)
{
add(data);
return;
}
UFNode<T> t=new UFNode<T>( );
t.data=data;
if(index==0)
{
t.next=this.start;
this.start=t;
}
else
{
UFNode<T> j,k;
int i;
i=0;
j=this.start;
k=j;
while(i<index)
{
k=j;
i++;
j=j.next;
}
k.next=t;
t.next=j;
}
this.size++;
}
public void insert(int index,T data)
{
if(index<0)throw new IndexOutOfBoundsException("Invalid index : "+index);
if(index>=this.size)
{
add(data);
return;
}
UFNode<T> t=new UFNode<T>( );
t.data=data;
if(index==0)
{
t.next=this.start;
this.start=t;
}
else
{
UFNode<T> j,k;
int i;
i=0;
j=this.start;
k=j;
while(i<index)
{
k=j;
i++;
j=j.next;
}
k.next=t;
t.next=j;
}
this.size++;
}
public T remove(int index)
{
if(index<0 || index>=size)throw new IndexOutOfBoundsException("Invalid index : "+index);
T data;
UFNode<T> e;
if(this.start==this.end)
{
data=this.start.data;
this.start=null;
this.end=null;
this.size--;
return data;
}
if(index==0)
{
data=this.start.data;
this.start=this.start.next;
this.size--;
return data;
}
UFNode<T> j,k;
int f=0;
j=this.start;
k=j;
while(f<index)
{
k=j;
f++;
j=j.next;
}
if(j==this.end)this.end=k;
k.next=j.next;
data=j.data;
this.size--;
return data;
}
public void removeAll( )
{
this.size=0;
}
public void clear( )
{
this.size=0;
}
public void update(int index,T data)
{
if(index<0 || index>=this.size)throw new IndexOutOfBoundsException("Invalid index : "+index);
UFNode<T> e=start;
int f;
for(f=0;f!=index;f++,e=e.next);
e.data=data;
}
public T get(int index)
{
if(index<0 || index>=this.size)throw new IndexOutOfBoundsException("Invalid index : "+index);
UFNode<T> e=start;
for(int f=0;f<this.size;e=e.next,f++)
{
if(f==index)break;
}
return e.data;
}
public int size( )
{
return this.size;
}

public void copyTo(UFList<T> other)
{
other.clear( );
for(int e=0;e<this.size;e++)other.add(this.get(e));
}
public void copyFrom(UFList<T> other)
{
this.size=0;
for(int e=0;e<other.size( );e++)this.add(other.get(e));
}
public void appendTo(UFList<T> other)
{
for(int e=0;e<this.size;e++)other.add(this.get(e));
}
public void appendFrom(UFList<T> other)
{
for(int e=0;e<other.size( );e++)this.add(other.get(e));
}
class UFLinkedListIterator<T> implements UFIterator<T>
{
private UFNode<T> ptr;
public UFLinkedListIterator(UFNode<T> ptr)
{
this.ptr=ptr;
}
public boolean hasNext( )
{
return this.ptr!=null;
}
public T next( )
{
if(this.ptr==null)throw new IndexOutOfBoundsException("List has no more elements");
T data=this.ptr.data;
this.ptr=this.ptr.next;
return data;
}
};
public UFIterator<T> iterator( )
{
return new UFLinkedListIterator<T>(this.start);
}
public void forEach(UFListItemAcceptor<T> a)
{
if(a==null)return;
for(UFNode<T> t=start;t!=null;t=t.next)a.accept(t.data);
}
};