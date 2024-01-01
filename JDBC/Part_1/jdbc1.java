import java.sql.*;
class jdbc1
{
public static void main(String gg[ ])
{
try
{
//Load the driver
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c;
//Establish the connection
c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hrdb","hr","hr");
Statement s;
s=c.createStatement( );
s.executeUpdate("insert into designation (title) values ('Plumber')");
System.out.println("Done");
}
catch(Exception exception)
{
System.out.println(exception.getMessage( ));
}
}
};