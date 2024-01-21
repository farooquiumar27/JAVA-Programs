import java.io.*;
class City implements Serializable
{
public int code;
public String name;
};
class Student implements Serializable
{
public int rollNumber;
public String name;
public char gender;
public City city;
};
class Main
{
public static void main(String gg[ ])
{
try
{
City city=new City( );
city.code=1;
city.name="Ujjain";
Student student=new Student( );
student.rollNumber=113;
student.name="Umar Farooqui";
student.gender='M';
student.city=city;

ByteArrayOutputStream baos=new ByteArrayOutputStream( );
ObjectOutputStream oos=new ObjectOutputStream(baos);
oos.writeObject(student);
oos.flush( );
byte b[ ]=baos.toByteArray( );
System.out.println("Object serialized");

ByteArrayInputStream bais=new ByteArrayInputStream(b);
ObjectInputStream ois=new ObjectInputStream(bais);
Student student2=(Student)ois.readObject( );
System.out.println("Object deserialized");

System.out.println("Roll number: "+student2.rollNumber);
System.out.println("Name: "+student2.name);
System.out.println("Gender: "+student2.gender);
System.out.println("City detailes");
System.out.println("City-code: "+student2.city.code);
System.out.println("City-name: "+student2.city.name);
}
catch(Exception e)
{
System.out.println(e.getMessage( ));
}
}
};