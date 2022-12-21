package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

		String urlstr = "jdbc:sqlserver://140.136.158.112:1433;encrypt=true;trustServerCertificate=true;databaseName=Project;user=project_account;password=helloworld";
		Connection conn = DriverManager.getConnection(urlstr);

		while (true) {
			String user = "", pwd = "";
			Scanner s1 = new Scanner(System.in);
			System.out.println("Username(Hint:teacher_account) : ");
			user = s1.next();
			System.out.println("Password(Hint:password) : ");
			pwd = s1.next();
			if (user.equals("teacher_account") && pwd.equals("password")) {
				test_login check = new test_login();
				check.createConn();
				check.closeConn();
				System.out.println("登入成功!");
				break;
			} else {
				System.out.println("登入失敗!");
			}
		}
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("輸入車牌(Hint:HUU6299) : ");
			String a = sc.next();
			Statement state = conn.createStatement();
			String sqlstr = "select * from data where '" + a + "'=carid";
			ResultSet rs = state.executeQuery(sqlstr);

			if (!rs.next()) {
				System.out.println("車牌不存在，請重新輸入");
				continue;
			}

			int pay;
			
			System.out.println(rs.getString(1) + "您所停的分鐘為: " + rs.getInt(2));
			int b = rs.getInt(2);
			
			for (int i=1;i<=100;i++) {
				if (b/30 == i) {
					pay = i * 20;
					System.out.println("您需要付的錢為: " + pay + "元");
					break;
			}
			
			}
			rs.close();
			state.close();
			break;
		}
		if (conn != null) {
			conn.close();}
	}

	
	}

