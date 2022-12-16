package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class test_conn {
	
	 public static void main(String[] args) throws ClassNotFoundException, SQLException {
		  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

		  String urlstr = "jdbc:sqlserver://140.136.158.112:1433;encrypt=true;trustServerCertificate=true;databaseName=Project;user=project_account;password=helloworld";
		  Connection conn = DriverManager.getConnection(urlstr);

		
		  boolean status = !conn.isClosed();
		  System.out.println("connect status:" + status);
		  
		  conn.close();
		 }
}
