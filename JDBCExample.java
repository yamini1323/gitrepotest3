import java.sql.*;
public class JDBCExample {
public static void main(String[] args) {
Connection conn = null;
Statement stmt = null;
try{
Class.forName("JDBC_DRIVER");
System.out.println("Connecting to database...");
conn =DriverManager.getConnection("jdbc:oracle:thin:@192.168.2.100:1521:ORCLDB","scott","tiger");
System.out.println("Creating database...");
stmt = conn.createStatement();
String sql = "create table student456(sno number,sname varchar(20),saddress varchar(20))";
stmt.executeUpdate(sql);
System.out.println("Database created successfully...");
}catch(SQLException se){
se.printStackTrace();
}catch(Exception e){
e.printStackTrace();
}finally
{
try{
if(stmt!=null)
stmt.close();
}catch(SQLException se2){
}
try{
if(conn!=null)
conn.close();
}catch(SQLException se){
se.printStackTrace();
}
}
System.out.println("Goodbye!");
}
}