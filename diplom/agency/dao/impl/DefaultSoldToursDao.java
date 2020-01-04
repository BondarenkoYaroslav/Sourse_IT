package agency.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import agency.dao.SoldToursDao;
import agency.models.SoldToursData;
import dbUtils.DbHelper;

public class DefaultSoldToursDao implements SoldToursDao {

	private static String SELECT_SOLD_TOUR_BY_ID = "SELECT * FROM agencydb.users_tours WHERE id_ut = ?;";
	private static String SELECT_ALL_TOURS_FOR_USER = "SELECT tours_id_tour FROM agencydb.users_tours WHERE users_id_user = ?;";
	private static String SELECT_ALL_USERS_FOR_TOUR = "SELECT users_id_user FROM agencydb.users_tours WHERE tours_id_tour = ?;";

	private static DefaultSoldToursDao instance;
	private DbHelper dbHelper;

	private DefaultSoldToursDao() {
		dbHelper = DbHelper.getInstance();
	}

	public synchronized static SoldToursDao getInstance() {
		if (instance == null) {
			instance = new DefaultSoldToursDao();
		}
		return instance;
	}

	@Override
	public SoldToursData soldToursDataByIdSold(int idSold) {

		try {
			SoldToursData soldToursData = null;

			try (Connection conn = dbHelper.getConnection();
					PreparedStatement statment = conn.prepareStatement(SELECT_SOLD_TOUR_BY_ID)) {

				statment.setInt(1, idSold);

				try (ResultSet rs = statment.executeQuery()) {
					if (rs.next()) {

						soldToursData = new SoldToursData();

						soldToursData.setIdTour(rs.getInt(1));
						soldToursData.setIdClient(rs.getInt(2));
						soldToursData.setIdTour(rs.getInt(3));
					}
				}
			}
			return soldToursData;

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

//	(rs.getInt(1)
	@Override
	public List<Integer> soldToursDataByIdClient(int idClient) {

		List<Integer> userTours = new ArrayList<>();

		PreparedStatement ps = null;
		ResultSet rs = null;
		try (Connection conn = dbHelper.getConnection()) {
			ps = conn.prepareStatement(SELECT_ALL_TOURS_FOR_USER);
			ps.setInt(1, idClient);
			rs = ps.executeQuery();
			while (rs.next()) {

				userTours.add(rs.getInt(1));

			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		return userTours;
	}

	@Override
	public List<Integer> soldToursDataByIdTour(int idTour) {

		List<Integer> tourUsers = new ArrayList<>();

		PreparedStatement ps = null;
		ResultSet rs = null;
		try (Connection conn = dbHelper.getConnection()) {
			ps = conn.prepareStatement(SELECT_ALL_USERS_FOR_TOUR);
			ps.setInt(1, idTour);
			rs = ps.executeQuery();
			while (rs.next()) {

				tourUsers.add(rs.getInt(1));

			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		return tourUsers;
	}

}
