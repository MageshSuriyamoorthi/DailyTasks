package industry;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

public class MyDatab {
public static void main(String[] args) throws Exception   {


DriverManager.registerDriver(new mysql.jdbc.Driver());
System.out.println("Driver loaded");
String connectionUrl = "jdbc:sqlserver://ATMECSINLT-084;database=JDBCconn;integratedSecurity=true";
Connection con=DriverManager.getConnection(connectionUrl);
System.out.println("connection established");
Statement stmt = con.createStatement();
ResultSet res=stmt.executeQuery("select * from jdbc"); 
System.out.println("query executed successfully");
while(res.next()) {
int id = res.getInt(1);
String name = res.getString(2);
System.out.println(id + " " + name);
}
con.close();
res.close();
}
}
