class student
{
private int rollNumber;
private String name;
public String city;
public void setRollNumber(int rollNumber)
{
this.rollNumber=rollNumber;
}
public int getRollNumber( )
{
return this.rollNumber;
}
public void setName(String name)
{
this.name=name;
}
public String getName( )
{
return this.name;
}
public void setCity(String city)
{
this.city=city;
}
public String getCity( )
{
return this.city;
}
public void doSomething( )
{
System.out.println("Great");
}
};