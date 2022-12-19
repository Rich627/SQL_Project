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
		boolean status = !conn.isClosed();
		System.out.println("connection status : " + status);
	}
	
	public boolean checkLogin(String user, String pwd)  throws SQLException {
		Statement state = conn.createStatement();
		String sqlstr = "select * from userid where username = '" + user + "' and password = '" + pwd + "'";
		System.out.println("sqlstr : " + sqlstr);
		
		ResultSet rs = state.executeQuery(sqlstr);
		boolean status = rs.next();
		rs.close();
		
		if(status) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//System.out.println("Please Input Your Username or Password : ");
		String user = "", pwd = "";
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Username : ");
		user = s1.next();
		
		System.out.println("Password : ");
		pwd = s1.next();
		
		System.out.println("user : " + user + " pwd : " + pwd);
		s1.close();
		
		System.out.println("user_len : " + user.length() + " dustypwd_len : " + pwd.length());
		
		if(user.length() != 0 && pwd.length() != 0) {
			test_login check = new test_login();
			check.createConn();
			
			boolean result = check.checkLogin(user, pwd);
			System.out.println("result : " + result);
			
			check.closeConn();
		}
	}
	
	public void action1(String[] args) throws SQLException, ClassNotFoundException {
		if(args.length == 2) {
			String user = args[0];
			String pwd = args[1];
			System.out.println("user : " + user + " pwd : " + pwd);
			
			test_login check = new test_login();
			check.createConn();
			
			boolean result = check.checkLogin(user, pwd);
			System.out.println("result : " + result);
			
			check.closeConn();
		}else {
			System.out.println("Please input correct username or password.");
		}

	}
	
	public void closeConn() throws SQLException {
		if (conn != null) {
			conn.close();
			System.out.println("connection closed");
		}
	}

}
