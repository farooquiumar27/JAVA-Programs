enum GENDER{MALE,FEMALE};
class Employee
{
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
e.setGender(GENDER.FEMALE);
System.out.println(e.getGender( ));
}
}