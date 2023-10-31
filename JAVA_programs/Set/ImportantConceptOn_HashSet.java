import java.util.*;
class Student
{
private int rollNumber;
private String name;
public Student( )
{
this.rollNumber=0;
this.name=null;
}
public void setRollNumber(int rollNumber)
{
this.rollNumber=rollNumber;
}
int getRollNumber( )
{
return this.rollNumber;
}
public void setName(java.lang.String name)
{
this.name=name;
}
java.lang.String getName( )
{
return this.name;
}
public int hashCode( )
{
System.out.println("hashCode got called");
return this.rollNumber;
}
public boolean equals(Object other)
{
if(!(other instanceof Student))return false;
Student ss=(Student)other;
return this.rollNumber==ss.rollNumber;
}
};
class main
{
public static void main(String gg[ ])
{
Set<Student> students=new HashSet<>( );
Student s1=new Student( );
s1.setRollNumber(101);
s1.setName("Babar");
Student s2=new Student( );
s2.setRollNumber(102);
s2.setName("Sohail");
Student s3=new Student( );
s3.setRollNumber(103);
s3.setName("Akbar");
Student s4=new Student( );
s4.setRollNumber(104);
s4.setName("James");
Student s5=new Student( );
s5.setRollNumber(105);
s5.setName("Ethan");
students.add(s1);
students.add(s2);
students.add(s3);
students.add(s4);
students.add(s5);
System.out.println(students.size( ));
Student s6=new Student( );
s6.setRollNumber(102);
s6.setName("Akbar");
Student s7=new Student( );
s7.setRollNumber(105);
s7.setName("Babar");
students.add(s6);
students.add(s7);
System.out.println(students.size( ));

students.forEach((s)->{System.out.printf("Student name-%s and number-%d\n",s.getName( ),s.getRollNumber( ));});
}
};