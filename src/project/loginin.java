package project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//用來產生隨機車牌的套件
import java.util.Random;

public class loginin {
	private Connection conn;
	
	public void createConn() throws ClassNotFoundException, SQLException{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		String urlstr = "jdbc:sqlserver://140.136.158.12:1433;databaseName=Project;user=project_account;password=helloworld";
		conn = DriverManager.getConnection(urlstr);
		boolean status = !conn.isClosed();
		System.out.println("connection status" + status);
	}
	
	public void closeConn() throws SQLException {
		if (conn != null) {
			conn.close();
			System.out.println("connection closed");
		}
		
	}
	
	
}
