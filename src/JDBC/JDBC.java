package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	private static final String URL = "jdbc:mysql://localhost:3306/agencydb";
	private static final String MAGIC_SPELL = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=GMT%2B8&useSSL=false";
	private static final String USER = "root";
	private static final String PASSWORD = "1qwerty";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection(URL + MAGIC_SPELL, USER, PASSWORD);

		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery("SELECT * FROM customers");
		
		int colums = rs.getMetaData().getColumnCount();
		
		while(rs.next()) {
			for (int i = 1; i <= colums; i++) {
				System.out.print(rs.getString(i) + "\t");
			}
			System.out.println();
		}
		System.out.println();
		if (rs != null)
			rs.close();
		if (st != null) 
			st.close();
		if (conn != null)
			conn.close();
	}

}
