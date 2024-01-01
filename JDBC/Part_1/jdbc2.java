import java.sql.*;
class jdbc2
{
public static void main(String gg[ ])
{
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hrdb","hr","hr");
Statement s=c.createStatement( );
s.executeUpdate("update designation set title='BodyGuard' where title='Bouncer';");
System.out.println("Done");
}
catch(Exception exception)
{
System.out.println(exception.getMessage( ));
}
}
};