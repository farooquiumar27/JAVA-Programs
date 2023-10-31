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
};
class main
{
public static void main(String gg[ ])
{
Student s1=new Student( );
s1.setRollNumber(101);
s1.setName("Sammer");
Student s2=new Student( );
s2.setRollNumber(102);
s2.setName("Sahil");
Student s3=new Student( );
s3.setRollNumber(103);
s3.setName("Ishan");

Map<Integer,Student> map;
map=new HashMap<>( );
map.put(s1.getRollNumber( ),s1);
map.put(s2.getRollNumber( ),s2);
map.put(s3.getRollNumber( ),s3);
System.out.println("Map has key 101 : "+map.containsKey(101));
System.out.println("Map has key 104 : "+map.containsKey(104));
System.out.println("Map has key 102 : "+map.containsKey(102));
//Iteration way 1
map.forEach(
(k,v)->{System.out.printf("Key is %d and the value is (%d--%s)\n",k,v.getRollNumber( ),v.getName( ));}
);
//Iteration way 2
Set<Map.Entry<Integer,Student>> sss;
sss=map.entrySet( );
Iterator<Map.Entry<Integer,Student>> i;
i=sss.iterator( );
Map.Entry<Integer,Student> entry;
while(i.hasNext( ))
{
entry=i.next( );
System.out.printf("Value-%d , Key-(%d-%s)\n",entry.getKey( ),entry.getValue( ).getRollNumber( ),entry.getValue( ).getName( ));
}
//Iteration way 3
for(Map.Entry<Integer,Student> ent:sss)
{
System.out.printf("Value=[%d= , Key=[%d-%s]\n",ent.getKey( ),ent.getValue( ).getRollNumber( ),ent.getValue( ).getName( ));
}

//Iteration way 4
//Get all keys
Set<Integer> ss;
ss=map.keySet( );
Student _s;
for(Integer x:ss)
{
System.out.println(x);
_s=map.get(x);
System.out.printf("Key is %d and Value is (%d-%s)\n",x,_s.getRollNumber( ),_s.getName( ));
}
Collection<Student> col;
col=map.values( );
for(Student su:col)
{
System.out.printf("Values -->{%d-%s}\n",su.getRollNumber( ),su.getName( ));
}
}
};