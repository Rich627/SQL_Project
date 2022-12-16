package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class test_query {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

		  String urlstr = "jdbc:sqlserver://140.136.158.112:1433;;encrypt=true;trustServerCertificate=true;databaseName=Project;user=project_account;password=helloworld";
		  Connection conn = DriverManager.getConnection(urlstr);

		  
		  boolean status = !conn.isClosed();
		  System.out.println("connect status:" + status);

		  //Query action  
		  Statement state = conn.createStatement();
		  String sqlstr = "select * from carid ";
		  ResultSet rs = state.executeQuery(sqlstr);
		  
		  
		  while(rs.next()) {
			  System.out.println(rs.getString(1) + "  " +rs.getInt(2));
		   }  
		  rs.close();
		  state.close();
		  conn.close();
		 }

}
