import java.sql.*;
class jdbc10
{
public static void main(String gg[ ])
{
String code=gg[0];
String title=gg[1];
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hrdb","hr","hr");
PreparedStatement p;
p=c.prepareStatement("update designation set title=? where code=?;");
p.setString(1,title);
p.setString(2,code);
p.executeUpdate( );
p.close( );
c.close( );
System.out.println("Designation updated");
}
catch(Exception e)
{
System.out.println(e.getMessage( ));
}
}
};