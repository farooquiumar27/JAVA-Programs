import java.util.*;
class Patient
{
private String name;
public void setName(String name)
{
this.name=name;
}
public String getName( )
{
return this.name;
}
};
class Token
{
private Integer number;
private String date;
public Token( )
{
this.number=null;
this.date=null;
}
public void setNumber(java.lang.Integer number)
{
this.number=number;
}
java.lang.Integer getNumber( )
{
return this.number;
}
public void setDate(java.lang.String date)
{
this.date=date;
}
java.lang.String getDate( )
{
return this.date;
}
public int hashCode( )
{
return Objects.hash(this.number,this.date);
}
public boolean equals(Object other)
{
if(!(other instanceof Token))return false;
Token t=(Token)other;
return t.number==this.number && t.date.equals(this.date);
}

};

class main
{
public static void main(String gg[ ])
{
Map<Token,Patient> patients=new HashMap<>( );
Token token;
Patient patient;
for(int i=1;i<=5;i++)
{
token=new Token( );
token.setNumber(i);
token.setDate("01/04/2020");
patient=new Patient( );
patient.setName("Patient : "+i);
patients.put(token,patient);
}

for(int i=1;i<=10;i++)
{
token=new Token( );
token.setNumber(i+i);
token.setDate("02/04/2020");
patient=new Patient( );
patient.setName("Patient : "+i);
patients.put(token,patient);
}
token=new Token( );
token.setNumber(3);
token.setDate("01/04/2020");
if(patients.containsKey(token))
{
patient=patients.get(token);
System.out.println("Patient name is : "+patient.getName( ));
}
else
{
System.out.println("Invalid data/token number combination");
}
}
};