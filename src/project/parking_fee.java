package project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class parking_fee {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

		String urlstr = "jdbc:sqlserver://140.136.158.112:1433;;encrypt=true;trustServerCertificate=true;databaseName=Project;user=project_account;password=helloworld";
		Connection conn = DriverManager.getConnection(urlstr);
		
		Scanner sc = new Scanner(System.in);

		while (true) {
		  System.out.println("輸入車牌");
		  String a = sc.next();
		  Statement state = conn.createStatement();
		  String sqlstr = "select * from data where '" + a + "'=carid";
		  ResultSet rs = state.executeQuery(sqlstr);
		  if (!rs.next()) {
		    System.out.println("車牌不存在，請重新輸入");
		    continue;
		  }
		  int pay;
		  int i = 1;
		  System.out.println(rs.getString(1) + " 有此車牌" + "您所停的分鐘為: " + rs.getInt(2));
		  int b = rs.getInt(2);
		  while (b / 30 == i) {
		    pay = i * 20;
		    System.out.println("您需要付的錢為: " + pay);
		    i++;
		    break;
		  }
		  rs.close();
		  state.close();
		  break;
		}

		conn.close();
	}
		
}
