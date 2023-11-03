class Employee
{
public enum GENDER{MALE,FEMALE};
private char gender;
public Employee( )
{
this.gender=' ';
}
public void setGender(GENDER gender)
{
if(gender==GENDER.MALE)this.gender='M';
else this.gender='F';
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
e.setGender(Employee.GENDER.MALE);
System.out.println(e.getGender( ));
}
}