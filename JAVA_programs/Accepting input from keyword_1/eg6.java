import java.io.*;
class main
{
public static void main(String gg[ ])
{
int x,y,z;
x=0;
y=0;
z=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
try
{
System.out.print("Enter the first number: ");
try
{
x=Integer.parseInt(br.readLine( ));
}catch(NumberFormatException nfe)
{
System.out.println("Invalid input");
}
System.out.print("Enter second number : ");
try
{
y=Integer.parseInt(br.readLine( ));
}catch(NumberFormatException nfe)
{
System.out.println("Invalid input");
}
z=x+y;
System.out.printf("%d\n",z);
}catch(IOException ioe)
{
System.out.println(ioe.getMessage( ));
}
}
};