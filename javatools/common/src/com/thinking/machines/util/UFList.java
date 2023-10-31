package com.thinking.machines.util;

public interface UFList<T>
{
public void add(T data);
public void add(int index,T data);
public void insert(int index,T data);
public void update(int index,T data);
public T remove(int index);
public void removeAll( );
public void clear( );
public T get(int index);
public int size( );
public void copyTo(UFList<T> other);
public void copyFrom(UFList<T> other);
public void appendTo(UFList<T> other);
public void appendFrom(UFList<T> other);
public UFIterator<T> iterator( );
public void forEach(UFListItemAcceptor<T> a);
}