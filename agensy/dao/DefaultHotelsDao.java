package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.database.HotelsData;
import dao.HotelDao;

public class DefaultHotelsDao implements HotelDao {
	
	private static final String GET_HOTELS_ID = "SELECT id_hotel FROM hotels";
	private static final String GET_HOTELS_NAME = "SELECT name FROM hotels";

	private static final String URL = "jdbc:mysql://localhost:3306/agencydb";
	private static final String MAGIC_SPELL = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=GMT%2B8&useSSL=false";
	private static final String USER = "root";
	private static final String PASSWORD = "1qwerty";
	
	@Override
	public List<HotelsData> getHotelsId(int idHotel) {
		List<HotelsData> idHotels = new ArrayList<HotelsData>();
		
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL + MAGIC_SPELL, USER, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Statement st = null;
		try {
			st = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ResultSet rs = null;
		try {
			rs = st.executeQuery(GET_HOTELS_ID);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int colums = 0;
		try {
			colums = rs.getMetaData().getColumnCount();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			while(rs.next()) {
				for (int i = 1; i <= colums; i++) {
					idHotels.add(rs.getInt(i), null);
				}		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return idHotels;
	}

	@Override
	public List<HotelsData> getHotelsName(String nameHotel) {
		
		List<HotelsData> nameHotels = new ArrayList<HotelsData>();
		
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL + MAGIC_SPELL, USER, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Statement st = null;
		try {
			st = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ResultSet rs = null;
		try {
			rs = st.executeQuery(GET_HOTELS_NAME);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int colums = 0;
		try {
			colums = rs.getMetaData().getColumnCount();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			while(rs.next()) {
				for (int i = 1; i <= colums; i++) {
//					nameHotels.add(rs.getString(i);
				}		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nameHotels;
	}
}
