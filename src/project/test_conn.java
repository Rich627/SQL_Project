package project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class test_conn {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String urlstr = "jdbc:sqlserver://140.136.158.122MA402-PC25:1433;databaseName=project;user=project_account;password=helloworld";
			
		Connection conn = DriverManager.getConnection(urlstr);
		boolean status = !conn.isClosed();
		System.out.println("connection status" + status);
	}
}

