//In HashSet the order is not preseved but searching is very fast.

import java.util.*;
class main
{
public static void main(String gg[ ])
{
Set<String> s;
s=new HashSet<>( );
s.add("Ujjain");
s.add("Dewas");
s.add("Agara");
s.add("Bombay");
s.add("Delhi");
System.out.println(s.contains("Ujjain"));
System.out.println(s.contains("Ratlam"));
System.out.println(s.size( ));
s.add("Ujjain");
System.out.println(s.size( ));
s.add("ujjain");
System.out.println(s.size( ));
s.forEach((e)->{System.out.println(e);});
}
};