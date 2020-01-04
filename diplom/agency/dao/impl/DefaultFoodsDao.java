package agency.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import agency.dao.FoodsDao;
import dbUtils.DbHelper;

public class DefaultFoodsDao implements FoodsDao {

	private static final String SELECT_FOOD_BY_ID = "SELECT name_food FROM agencydb.foods WHERE id_food =?;";
	private static final String SET_FOOD = "INSERT INTO `agencydb`.`foods` (`name_food`) VALUES ('?');";
	private static final String UPDATE_FOOD = "UPDATE `agencydb`.`foods` SET `name_food` = ? WHERE (`id_food` = ?)";

	private static DefaultFoodsDao instance;
	private DbHelper dbHelper;

	private DefaultFoodsDao() {
		dbHelper = DbHelper.getInstance();
	}

	public synchronized static FoodsDao getInstance() {
		if (instance == null) {
			instance = new DefaultFoodsDao();
		}
		return instance;
	}

	@Override
	public String getFoodById(int idFood) {

		String nameFood = null;

		PreparedStatement pstm = null;

		ResultSet rs = null;

		try (Connection conn = dbHelper.getConnection()) {

			pstm = conn.prepareStatement(SELECT_FOOD_BY_ID);

			pstm.setInt(1, idFood);
			;

			rs = pstm.executeQuery();

			while (rs.next()) {

				nameFood = rs.getString(1);

			}
			return nameFood;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return nameFood;
	}

	@Override
	public boolean setFood(String nameFood) {

		try (Connection conn = dbHelper.getConnection()) {

			PreparedStatement pstm = conn.prepareStatement(SET_FOOD);

			pstm.setString(1, nameFood);

			pstm.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean updateFood(int idFood, String nameFood) {

		try (Connection conn = dbHelper.getConnection()) {

			PreparedStatement pstm = conn.prepareStatement(UPDATE_FOOD);

			pstm.setInt(2, idFood);
			pstm.setString(1, nameFood);

			pstm.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
