//In TreeSet the data is stored in sorted format but searching is slightly 
// slower than the LinkedHashSet and slower than the HashSet.

import java.util.*;
class main
{
public static void main(String gg[ ])
{
Set<String> s;
s=new TreeSet<>( );
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