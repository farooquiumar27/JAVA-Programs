import java.sql.*;
class jdbc5
{
public static void main(String gg[ ])
{
String title=gg[0];
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hrdb","hr","hr");
Statement s=c.createStatement( );
String sql="insert into designation (title) values('"+title+"');";
s.executeUpdate(sql);
System.out.println(sql);
}
catch(Exception e)
{
System.out.println(e);
}
}
};