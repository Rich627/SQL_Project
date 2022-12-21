package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class test_login {
	
	private Connection conn;
	
	public void createConn() throws ClassNotFoundException, SQLException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

		String urlstr = "jdbc:sqlserver://140.136.158.112:1433;encrypt=true;trustServerCertificate=true;databaseName=Project;user=project_account;password=helloworld";
		conn = DriverManager.getConnection(urlstr);
	}
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		while (true){
			String user = "", pwd = "";
			Scanner s1 = new Scanner(System.in);
			System.out.println("Username : ");
			user = s1.next();	
			System.out.println("Password : ");
			pwd = s1.next();
			if(user.equals("teacher_account") &&  pwd.equals("password")) {
				test_login check = new test_login();
				check.createConn();
				check.closeConn();
				System.out.println("succ");
				break;
				}
			else {
				System.out.println("wrong");
			}
		}
	}
			
	
	
	public void closeConn() throws SQLException {
		if (conn != null) {
			conn.close();
		}
	}

}
