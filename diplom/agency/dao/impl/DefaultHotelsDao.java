package agency.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import agency.dao.HotelsDao;
import agency.models.HotelsData;
import dbUtils.DbHelper;

public class DefaultHotelsDao implements HotelsDao {

	private static String SELECT_HOTELS_BY_ID = "SELECT * FROM hotels WHERE id_hotel = ?";
	private static String SET_HOTEL = "INSERT INTO `agencydb`.`hotels` (`foods_id_food`, `name_hotel`, `stars_hotel`) VALUES (?, ?, ?);";
	private static String UPDATE_HOTEL = "UPDATE `agencydb`.`hotels` SET `foods_id_food` = ?, `name_hotel` = ?, `stars_hotel` = ? WHERE (`id_hotel` = ?);";

	private static DefaultHotelsDao instance;
	private DbHelper dbHelper;

	private DefaultHotelsDao() {
		dbHelper = DbHelper.getInstance();
	}

	public synchronized static HotelsDao getInstance() {
		if (instance == null) {
			instance = new DefaultHotelsDao();
		}
		return instance;
	}

	@Override
	public HotelsData getHotelById(int idHotel) {

		try {
			HotelsData hotelsData = null;

			try (Connection conn = dbHelper.getConnection();
					PreparedStatement statment = conn.prepareStatement(SELECT_HOTELS_BY_ID)) {
				statment.setInt(1, idHotel);

				try (ResultSet rs = statment.executeQuery()) {
					if (rs.next()) {

						hotelsData = new HotelsData();

						hotelsData.setIdHotel(rs.getInt(1));
						hotelsData.setIdFood(rs.getInt(2));
						hotelsData.setNameHotel(rs.getString(3));
						hotelsData.setStarsHotel(rs.getInt(4));
					}
				}
			}
			return hotelsData;

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public boolean setHotel(int idFood, String nameHotel, int starsHotel) {

		try (Connection conn = dbHelper.getConnection()) {

			PreparedStatement pstm = conn.prepareStatement(SET_HOTEL);

			pstm.setInt(1, idFood);
			pstm.setString(2, nameHotel);
			pstm.setInt(3, starsHotel);

			pstm.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean updateHotel(int idHotel, int idFood, String nameHotel, int starsHotel) {
	
		try (Connection conn = dbHelper.getConnection()) {

			PreparedStatement pstm = conn.prepareStatement(UPDATE_HOTEL); 

			pstm.setInt(4, idHotel);
			pstm.setInt(1, idFood);
			pstm.setString(2, nameHotel);
			pstm.setInt(3, starsHotel);

			pstm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
