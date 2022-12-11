package project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class test_conn {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String urlstr = "jdbc:sqlserver://140.136.158.12:1433;databaseName=Project;user=project_account;password=helloworld";

			
		Connection conn = DriverManager.getConnection(urlstr);
		boolean status = !conn.isClosed();
		System.out.println("connection status" + status);
	}
	
	public void closeConn() throws SQLException {
		if (conn != null) {
			conn.close();
		}
	}
	
	public void insertDb() throws SQLException{
		Statement state = conn.createStatement();
		String sqlstr = "insert into xxx";
		in count = stae.executeUpdate(sqlstr);
	}
	
}
