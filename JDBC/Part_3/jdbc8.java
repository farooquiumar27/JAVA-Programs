import java.sql.*;
class jdbc8
{
public static void main(String gg[ ])
{
String title=gg[0];
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hrdb","hr","hr");
String sql="insert into designation (title) values ('"+title+"');";
Statement s=c.createStatement( );
s.executeUpdate(sql,Statement.RETURN_GENERATED_KEYS);
ResultSet r=s.getGeneratedKeys( );
r.next( );
int code=r.getInt(1);
r.close( );
c.close( );
r.close( );
System.out.println("Designation inserted with code : "+code);
}
catch(Exception e)
{
System.out.println(e.getMessage( ));
}
}
};