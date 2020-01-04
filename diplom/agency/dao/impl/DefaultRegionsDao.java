package agency.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import agency.dao.RegionsDao;
import dbUtils.DbHelper;

public class DefaultRegionsDao implements RegionsDao{
	
	private static final String SELECT_REGION_BY_ID = "SELECT name_region FROM regions WHERE id_region = ?;";
	private static final String SET_REGION = "INSERT INTO `agencydb`.`regions` (`name_region`) VALUES ('?');";
	private static final String UPDATE_REGION = "UPDATE `agencydb`.`regions` SET `name_region` = ? WHERE (`id_region` = ?)";

	private static DefaultRegionsDao instance;
	private DbHelper dbHelper;

	private DefaultRegionsDao() {
		dbHelper = DbHelper.getInstance();
	}

	public synchronized static RegionsDao getInstance() {
		if (instance == null) {
			instance = new DefaultRegionsDao();
		}
		return instance;
	}

	@Override
	public String getRegionById(int idRegion) {
		
		String nameRegion = null;

		PreparedStatement pstm = null;

		ResultSet rs = null;

		try (Connection conn = dbHelper.getConnection()) {

			pstm = conn.prepareStatement(SELECT_REGION_BY_ID);

			pstm.setInt(1, idRegion);;

			rs = pstm.executeQuery();

			while (rs.next()) {

				nameRegion = rs.getString(1);

			}
			return nameRegion;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return nameRegion;
	}

	@Override
	public boolean setRegion(String nameRegion) {
		
		try (Connection conn = dbHelper.getConnection()) {

			PreparedStatement pstm = conn.prepareStatement(SET_REGION);

			pstm.setString(1, nameRegion);

			pstm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean updateRegion(int idRegion, String nameRegion) {
		
		try (Connection conn = dbHelper.getConnection()) {

			PreparedStatement pstm = conn.prepareStatement(UPDATE_REGION); 

			pstm.setInt(2, idRegion);
			pstm.setString(1, nameRegion);

			pstm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
