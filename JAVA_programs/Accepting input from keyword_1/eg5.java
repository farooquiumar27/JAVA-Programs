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
String g,f;
try
{
System.out.print("Enter a character : ");
m=(char)br.read( );
while(br.ready( ))br.read( );
System.out.println((int)m);
System.out.print("Enter another character : ");
k=(char)br.read( );
while(br.ready( ))br.read( );
System.out.println((int)k);
System.out.print("Enter a string : ");
f=br.readLine( );
System.out.print("Enter another string : ");
g=br.readLine( );
System.out.println(f);
System.out.println(g);
}
catch(IOException ioe)
{
System.out.println(ioe.getMessage( ));
}
}
};