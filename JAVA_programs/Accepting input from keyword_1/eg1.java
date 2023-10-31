import java.io.*;
class main
{
public static void main(String gg[ ])
{
char m;
InputStreamReader isr;
isr=new InputStreamReader(System.in);
BufferedReader br;
br=new BufferedReader(isr);
System.out.print("Enter a character : ");
try
{
m=(char)br.read( );
System.out.println(m);
}catch(IOException ioe)
{
System.out.println(ioe.getMessage( ));
}
}
};