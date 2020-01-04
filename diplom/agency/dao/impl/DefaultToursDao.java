package agency.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import agency.dao.ToursDao;
import agency.models.ToursData;
import dbUtils.DbHelper;

public class DefaultToursDao implements ToursDao {

	private static String SELECT_TOUR_BY_ID = "SELECT * FROM agencydb.tours WHERE id_tour = ?";
	private static String SET_TOUR = "INSERT INTO `agencydb`.`tours` (`countries_id_country`, `regions_id_region`, `hotels_id_hotel`, `departure_data`, `return_data`, `price_tour`) VALUES (?, ?, ?, ?, ?, ?);";
	private static String UPDATE_USER = "UPDATE `agencydb`.`tours` SET `countries_id_country` = ?, `regions_id_region` = ?, `hotels_id_hotel` = ?, `departure_data` = ?, `return_data` = ?, `price_tour` = ? WHERE (`id_tour` = ?);";
	private static String EXIST_ID = "SELECT id_tour FROM agencydb.tours WHERE id_tour = ?;";

	private static DefaultToursDao instance;
	private DbHelper dbHelper;

	private DefaultToursDao() {
		dbHelper = DbHelper.getInstance();
	}

	public synchronized static ToursDao getInstance() {
		if (instance == null) {
			instance = new DefaultToursDao();
		}
		return instance;
	}

	@Override
	public ToursData getTourById(int idTour) {

		try {
			ToursData toursData = null;

			try (Connection conn = dbHelper.getConnection();
					PreparedStatement statment = conn.prepareStatement(SELECT_TOUR_BY_ID)) {
				statment.setInt(1, idTour);

				try (ResultSet rs = statment.executeQuery()) {
					if (rs.next()) {

						toursData = new ToursData();

						toursData.setIdTour(rs.getInt(1));
						toursData.setIdCountry(rs.getInt(2));
						toursData.setIdRegion(rs.getInt(3));
						toursData.setIdHotel(rs.getInt(4));
						toursData.setDepartureData(rs.getDate(5));
						toursData.setReturnData(rs.getDate(6));
						toursData.setPriceTour(rs.getInt(7));

					}
				}
			}
			return toursData;

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public boolean setTour(int idCountry, int idRegion, int idHotel, Date departureData, Date returnData,
			int priceTour) {

		try (Connection conn = dbHelper.getConnection()) {

			PreparedStatement pstm = conn.prepareStatement(SET_TOUR);

			pstm.setInt(1, idCountry);
			pstm.setInt(2, idRegion);
			pstm.setInt(3, idHotel);
			pstm.setDate(4, departureData);
			pstm.setDate(5, returnData);
			pstm.setInt(6, priceTour);

			pstm.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean updateTour(int idTour, int idCountry, int idRegion, int idHotel, Date departureData, Date returnData,
			int priceTour) {

		try (Connection conn = dbHelper.getConnection()) {

			PreparedStatement pstm = conn.prepareStatement(UPDATE_USER);

			pstm.setInt(7, idTour);
			pstm.setInt(1, idCountry);
			pstm.setInt(2, idRegion);
			pstm.setInt(3, idHotel);
			pstm.setDate(4, departureData);
			pstm.setDate(5, returnData);
			pstm.setInt(6, priceTour);

			pstm.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean existId(int idTour) {

		try {

			try (Connection conn = dbHelper.getConnection();
					PreparedStatement statment = conn.prepareStatement(EXIST_ID)) {
				statment.setInt(1, idTour);

				try (ResultSet rs = statment.executeQuery()) {
					if (rs.next()) {

						Integer exist = rs.getInt(1);
						if (exist != null) {
							return true;
						}

					}
				}
			}
			return false;

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
