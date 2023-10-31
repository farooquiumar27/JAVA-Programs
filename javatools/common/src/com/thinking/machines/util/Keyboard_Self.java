package com.thinking.machines.util;
import java.util.*;
import java.lang.*;
public class Keyboard_Self
{
private Scanner sc=new Scanner(System.in);
private short _short;
private int _int;
private long _long;
private byte _byte;
private double _double;
private float _float;
private char _char;
private boolean _boolean;
private String _string;

public short getShort( )
{
_short=sc.nextShort( );
sc.nextLine( );
return _short;
}
public short getShort(String moni)
{
System.out.print(moni);
_short=sc.nextShort( );
sc.nextLine( );
return _short;
}

public int getInt( )
{
_int=sc.nextInt( );
sc.nextLine( );
return _int;
}
public int getInt(String moni)
{
System.out.print(moni);
_int=sc.nextInt( );
sc.nextLine( );
return _int;
}

public long getLong( )
{
_long=sc.nextLong( );
sc.nextLine( );
return _long;
}
public long getLong(String moni)
{
System.out.print(moni);
_long=sc.nextLong( );
sc.nextLine( );
return _long;
}

public byte getByte( )
{
_byte=sc.nextByte( );
sc.nextLine( );
return _byte;
}
public byte getByte(String moni)
{
System.out.print(moni);
_byte=sc.nextByte( );
sc.nextLine( );
return _byte;
}

public double getDouble( )
{
_double=sc.nextDouble( );
sc.nextLine( );
return _double;
}
public double getDouble(String moni)
{
System.out.print(moni);
_double=sc.nextDouble( );
sc.nextLine( );
return _double;
}

public float getFloat( )
{
_float=sc.nextFloat( );
sc.nextLine( );
return _float;
}
public float getFloat(String moni)
{
System.out.print(moni);
_float=sc.nextFloat( );
sc.nextLine( );
return _float;
}

public char getChar( )
{
_char=sc.next( ).charAt(0);
sc.nextLine( );
return _char;
}

public char getChar(String moni)
{
System.out.print(moni);
_char=sc.next( ).charAt(0);
sc.nextLine( );
return _char;
}

public boolean getBoolean( )
{
_boolean=sc.nextBoolean( );
sc.nextLine( );
return _boolean;
}
public boolean getBoolean(String moni)
{
System.out.print(moni);
_boolean=sc.nextBoolean( );
sc.nextLine( );
return _boolean;
}

public String getString( )
{
_string=sc.nextLine( );
return _string;
}
public String getString(String moni)
{
System.out.print(moni);
_string=sc.nextLine( );
return _string;
}

};