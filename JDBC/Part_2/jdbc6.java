import java.sql.*;
class jdbc6
{
public static void main(String gg[ ])
{
String code=gg[0];
String title=gg[1];
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hrdb","hr","hr");
Statement s=c.createStatement( );
String sql="update designation set title='"+title+"' where code="+code+";";
s.executeUpdate(sql);
System.out.println(sql);
}
catch(Exception e)
{
System.out.println(e);
}
}
};