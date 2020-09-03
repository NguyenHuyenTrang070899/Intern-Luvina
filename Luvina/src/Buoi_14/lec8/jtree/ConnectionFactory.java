package Buoi_14.lec8.jtree;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author apple
 */
public class ConnectionFactory {
private static Connection con;

public static Connection CreateMySQLConnection(String database)throws Exception{
String url="com.mysql.jdbc.Driver";
Class.forName(url);

String dburl="jdbc:mysql://localhost/test"+"?user=root&password=root";
con=DriverManager.getConnection(dburl);
return con;
}
}
