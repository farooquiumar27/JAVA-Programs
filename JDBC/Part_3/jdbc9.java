import java.sql.*;
class jdbc9
{
public static void main(String gg[ ])
{
String title=gg[0];
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hrdb","hr","hr");
PreparedStatement p;
p=c.prepareStatement("insert into designation (title) values (?);",Statement.RETURN_GENERATED_KEYS);
p.setString(1,title);
p.executeUpdate( );
ResultSet r=p.getGeneratedKeys( );
r.next( );
int code=r.getInt(1);
r.close( );
p.close( );
c.close( );
System.out.println("Designation inserted with code as : "+code);
}
catch(Exception e)
{
System.out.println(e.getMessage( ));
}
}
};