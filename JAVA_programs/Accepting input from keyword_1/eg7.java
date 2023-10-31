//In this example we will take input Through Scanner
import java.util.*;
class main
{
public static void main(String gg[ ])
{
String name;
int age;
double salary;
try
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter age : ");
age=sc.nextInt( );
sc.nextLine( );   //to clear the buffer
System.out.print("Enter name : ");
name=sc.nextLine( );
System.out.print("Enter salary : ");
salary=sc.nextDouble( );
System.out.println("Name : "+name);
System.out.println("Age : "+age);
System.out.println("Salary : "+salary);
}catch(InputMismatchException ime)
{
System.out.println(ime.getMessage( ));
}
}
};