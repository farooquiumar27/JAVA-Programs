import java.io.*;
import java.lang.*;

class main
{
public static void main(String gg[ ])
{
File f=new File("cool.txt");
System.out.println(f.length( ));
f.renameTo(new File("great.txt"));
}
};