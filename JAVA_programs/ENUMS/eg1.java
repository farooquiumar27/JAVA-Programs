class Employee
{
private char gender;
public Employee( )
{
this.gender=' ';
}
public void setGender(char gender)
{
this.gender=gender;
}
char getGender( )
{
return this.gender;
}
};
class main
{
public static void main(String gg[ ])
{
Employee e=new Employee( );
e.setGender('Z');
System.out.println(e.getGender( ));
}
}