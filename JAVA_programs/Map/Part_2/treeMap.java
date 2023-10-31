//In TreeMap the search in slightly slower than the LinkedHashMap but the data is stored in sorted format.

import java.util.*;
class Employee
{
private String code;
private String name;
public Employee( )
{
this.code=null;
this.name=null;
}
public void setCode(java.lang.String code)
{
this.code=code;
}
java.lang.String getCode( )
{
return this.code;
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
Map<String,Employee> employees=new TreeMap<>( );
Employee employee;
for(int e=10001;e<=10050;e++)
{
employee=new Employee( );
employee.setCode("A"+e);
employee.setName("Some name"+e);
employees.put(employee.getCode( ),employee);
}
employees.forEach(
(code,employe)->{System.out.printf("Employee details -[Code-%s and Name=%s]\n",employe.getCode( ),employe.getName( ));});
}
};