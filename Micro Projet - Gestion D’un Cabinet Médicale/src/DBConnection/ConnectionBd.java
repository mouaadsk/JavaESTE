package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionBd {
	public static Connection GetConnecttion() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_cm", "root", "");
			System.out.println("Database Connected Succefully !");
			return conn;
		} catch (Exception error) {
			error.printStackTrace();
		}
		return null;
	}

}
