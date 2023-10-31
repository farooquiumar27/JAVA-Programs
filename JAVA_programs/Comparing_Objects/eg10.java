//This code will not compile but this is wrong

class Employee
{
private int id;
private String name;
public void setId(int id)
{
this.id=id;
}
public int getId( )
{
return this.id;
}
public void setName(String name)
{
this.name=name;
}
public String getName( )
{
return this.name;
}
public boolean equals(Object other)
{
return this.id==other.id;
}
};

class ModuleA
{
public Employee getEmployee( )
{
Employee e=new Employee( );
e.setId(101);
e.setName("Sammer");
return e;
}
};
class ModuleB
{
public Employee getEmployee( )
{
Employee e=new Employee( );
e.setId(101);
e.setName("Sammer");
return e;
}
};
class main
{
public static void main(String gg[ ])
{
ModuleA a=new ModuleA( );
ModuleB b=new ModuleB( );
Employee e1=a.getEmployee( );
Employee e2=b.getEmployee( );
if(e1==e2)
{
System.out.println("Same");
}
else
{
System.out.println("Not Same");
}
}
};
