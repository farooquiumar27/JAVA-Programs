import java.lang.*;
import java.io.*;
class main
{
public static void main(String gg[ ])
{
File f=new File("pqr.txt");
System.out.println(f.exists( ));
System.out.println(f.getName( ));
System.out.println(f.isDirectory( ));
System.out.println(f.getAbsolutePath( ));
f.delete( );
}
};