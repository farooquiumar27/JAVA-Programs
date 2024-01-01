import java.sql.*;
class jdbc4
{
public static void main(String gg[ ])
{
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hrdb","hr","hr");
Statement s=c.createStatement( );
ResultSet r;
r=s.executeQuery("select * from designation");
int code;
String title;
while(r.next( ))
{
code=r.getInt("code");
title=r.getString("title");
System.out.printf("Code -> %d and Title -> %s\n",code,title);
}
r.close( );
s.close( );
c.close( );
}
catch(SQLException e)
{
System.out.println(e.getMessage( ));
}
catch(ClassNotFoundException e)
{
System.out.println(e.getMessage( ));
}
}
};