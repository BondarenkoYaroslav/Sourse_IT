package dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
	
	private static final String URL = "jdbc:mysql://localhost:3306/agencydb";
	private static final String MAGIC_SPELL = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=GMT%2B8&useSSL=false";
	private static final String USER = "root";
	private static final String PASSWORD = "1qwerty";
	
	private static DbHelper instance;
	
	private DbHelper() {
		
	}
	
	public synchronized static DbHelper getInstance() {
		if (instance == null) {
			instance = new DbHelper();
		}
		return instance;
	}
	
	public Connection getConnection() {
		try {
			Class.forName(URL);
			return DriverManager.getConnection(URL + MAGIC_SPELL, USER, PASSWORD); 
		} catch (ClassNotFoundException | SQLException e) {
			throw new RuntimeException(e);
		}
	}
}