import com.thinking.machines.util.*;
import java.lang.*;

class Keyboard_SelfTestCase
{
public static void main(String gg[ ])
{
Keyboard_Self k=new Keyboard_Self( );
long _long;
int _int;
short _short;
byte _byte;
double _double;
float _float;
char _char;
boolean _boolean;
String _string;

System.out.print("Check  Long : ");
_long=k.getLong( );
System.out.print("Check Int : ");
_int=k.getInt( );
System.out.print("Check short : ");
_short=k.getShort( );
System.out.print("Check byte : ");
_byte=k.getByte( );
System.out.print("Check double : ");
_double=k.getDouble( );
System.out.print("Check float : ");
_float=k.getFloat( );
System.out.print("Check char : ");
_char=k.getChar( );
System.out.print("Check boolean : ");
_boolean=k.getBoolean( );
System.out.print("Check String : ");
_string=k.getString( );

System.out.println(_long);
System.out.println(_int);
System.out.println(_short);
System.out.println(_byte);
System.out.println(_double);
System.out.println(_float);
System.out.println(_char);
System.out.println(_boolean);
System.out.println(_string);

_short=k.getShort("Check short : ");
_int=k.getInt("Check int : ");
_long=k.getLong("Check long : ");
_byte=k.getByte("Check byte : ");
_double=k.getDouble("Check double : ");
_float=k.getFloat("Check float : ");
_char=k.getChar("Check char : ");
_boolean=k.getBoolean("Check boolean : ");
_string=k.getString("Check string : ");

System.out.println(_long);
System.out.println(_int);
System.out.println(_short);
System.out.println(_byte);
System.out.println(_double);
System.out.println(_float);
System.out.println(_char);
System.out.println(_boolean);
System.out.println(_string);
}
};