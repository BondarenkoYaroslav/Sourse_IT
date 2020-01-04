package agency.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import agency.dao.CountriesDao;
import dbUtils.DbHelper;

public class DefaultCountriesDao implements CountriesDao {

	private static final String SELECT_COUNTRY_BY_ID = "SELECT name_country FROM countries WHERE id_country = ?;";
	private static final String SET_COUNTRY = "INSERT INTO `agencydb`.`countries` (`name_country`) VALUES ('?');";
	private static final String UPDATE_COUNTRY = "UPDATE `agencydb`.`countries` SET `name_country` = ? WHERE (`id_country` = ?)";

	private static DefaultCountriesDao instance;
	private DbHelper dbHelper;

	private DefaultCountriesDao() {
		dbHelper = DbHelper.getInstance();
	}

	public synchronized static CountriesDao getInstance() {
		if (instance == null) {
			instance = new DefaultCountriesDao();
		}
		return instance;
	}

	@Override
	public String getCountryById(int idCountry) {
		
		String nameCountry = null;

		PreparedStatement pstm = null;

		ResultSet rs = null;

		try (Connection conn = dbHelper.getConnection()) {

			pstm = conn.prepareStatement(SELECT_COUNTRY_BY_ID);

			pstm.setInt(1, idCountry);;

			rs = pstm.executeQuery();

			while (rs.next()) {

				nameCountry = rs.getString(1);

			}
			return nameCountry;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return nameCountry;
	}

	@Override
	public boolean setCountry(String nameCountry) {
		
		try (Connection conn = dbHelper.getConnection()) {

			PreparedStatement pstm = conn.prepareStatement(SET_COUNTRY);

			pstm.setString(1, nameCountry);

			pstm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean updateCountry(int idCountry, String nameCountry) {
		
		try (Connection conn = dbHelper.getConnection()) {

			PreparedStatement pstm = conn.prepareStatement(UPDATE_COUNTRY); 

			pstm.setInt(2, idCountry);
			pstm.setString(1, nameCountry);

			pstm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
