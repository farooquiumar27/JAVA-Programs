import java.lang.*;
import java.io.*;

class main
{
public static void main(String gg[ ])
{
File folder=new File("xyz");
if(!folder.exists( ))folder.mkdir( );
File aa=new File("abcd"+File.separator+"pqr"+File.separator+"lmn");
if(!aa.exists( ))aa.mkdirs( );
}
}
