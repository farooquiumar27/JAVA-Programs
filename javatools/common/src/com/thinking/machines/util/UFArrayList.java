package com.thinking.machines.util;

public class UFArrayList<T> implements UFList<T>
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
public void removeAll( )
{
this.size=0;
}
public T remove(int index)
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
public void add(int index,T data)
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
public void insert(int index,T data)
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
public void update(int index,T data)
{
if(index<0 || index>=this.size)throw new IndexOutOfBoundsException("Invalid index : "+index);
this.collection[index]=data;
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
public void copyTo(UFList<T> other)
{
other.clear( );
for(int e=0;e<this.size;e++)other.add((T)this.collection[e]);
}
public void copyFrom(UFList<T> other)
{
Object [ ]temp=new Object[other.size( )];
for(int e=0;e<other.size( );e++)temp[e]=other.get(e);
this.collection=temp;
}
public void appendTo(UFList<T> other)
{
for(int e=0;e<this.size( );e++)other.add((T)this.collection[e]);
}
public void appendFrom(UFList<T> other)
{
Object temp[ ]=new Object[this.size( )+other.size( )];
int e;
for(e=0;e<other.size( );e++)temp[e]=this.collection[e];
for(;e<this.size( );e++)temp[e]=other.get(e);
this.collection=temp;
}
public class UFArrayListIterator<T> implements UFIterator<T>
{
private int index;
public boolean hasNext( )
{
return this.index!=UFArrayList.this.size;
}
public T next( )
{
if(this.index==UFArrayList.this.size)throw new IndexOutOfBoundsException("List has no more elements");
T data=(T)UFArrayList.this.get(this.index);
this.index++;
return data;
}
};
public UFIterator<T> iterator( )
{
return new UFArrayListIterator<T>( );
}
public void forEach(UFListItemAcceptor<T> a)
{
if(a==null)return;
for(int e=0;e<this.size;e++)a.accept((T)this.collection[e]);
}
};
