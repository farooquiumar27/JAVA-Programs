import java.io.*;
class main
{
public static void main(String gg[ ])
{
char m,k;
InputStreamReader isr;
isr=new InputStreamReader(System.in);
BufferedReader br;
br=new BufferedReader(isr);
try
{
System.out.print("Enter a character : ");
m=(char)br.read( );
br.read( );  //To read the '\r'
br.read( );  //To read the '\n'
System.out.println((int)m);
System.out.print("Enter another character : ");
k=(char)br.read( );
System.out.println((int)k);
}
catch(IOException ioe)
{
System.out.println(ioe.getMessage( ));
}
}
};