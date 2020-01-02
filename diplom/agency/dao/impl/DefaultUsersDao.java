package agency.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import agency.models.UsersData;
import agency.dao.UsersDao;
import dbUtils.DbHelper;

public class DefaultUsersDao implements UsersDao {

	private static final String SELECT_USER_BY_ID = "SELECT * FROM users WHERE id_user=?";
	private static final String SELECT_USER_BY_MAIL = "SELECT * FROM users WHERE mail_user=?";
	private static final String SET_USER = "INSERT INTO `agencydb`.`users` (`name_user`, `surname_user`, `mail_user`, `phone_user`, `birthday_user`) VALUES ( ?, ?, ?, ?, ?);";
	private static final String UPDATE_USER = "UPDATE `agencydb`.`users` SET `name_user` = ?, `surname_user` = ?, `phone_user` = ?, `birthday_user` = ? WHERE (`id_user` = ?)";


	private static DefaultUsersDao instance;
	private DbHelper dbHelper;

	private DefaultUsersDao() {
		dbHelper = DbHelper.getInstance();
	}

	public synchronized static UsersDao getInstance() {
		if (instance == null) {
			instance = new DefaultUsersDao();
		}
		return instance;
	}

	@Override
	public UsersData getUserById(int idUser) {

		try {
			UsersData usersData = null;
			
			try (Connection conn = dbHelper.getConnection();
					PreparedStatement statment = conn.prepareStatement(SELECT_USER_BY_ID)) {
				statment.setInt(1, idUser);

				try (ResultSet rs = statment.executeQuery()) {
					if (rs.next()) {

						usersData = new UsersData();
						usersData.setIdUser(rs.getInt(1));
						usersData.setNameUser(rs.getString(2));
						usersData.setSurnameUser(rs.getString(3));
						usersData.setMailUser(rs.getString(4));
						usersData.setPhoneUser(rs.getString(5));
						usersData.setBirthdayUser(rs.getDate(6));
					}
				}
			}
			return usersData;

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public UsersData getUserByMail(String mail) {
		
		UsersData usersData = null;

		PreparedStatement pstm = null;
		
		ResultSet rs = null;

		try (Connection conn = dbHelper.getConnection()) {

			pstm = conn.prepareStatement(SELECT_USER_BY_MAIL);

			pstm.setString(1, mail);

			rs = pstm.executeQuery();

			while (rs.next()) {

				usersData = new UsersData();
				usersData.setIdUser(rs.getInt(1));
				usersData.setNameUser(rs.getString(2));
				usersData.setSurnameUser(rs.getString(3));
				usersData.setMailUser(rs.getString(4));
				usersData.setPhoneUser(rs.getString(5));
				usersData.setBirthdayUser(rs.getDate(6));

			}
			return usersData;

		} catch (SQLException e) {
			e.printStackTrace();
		}

			return usersData;
	}

	@Override
	public boolean setUser(String nameUser, String surnameUser, String mailUser, String phoneUser, Date birthdayUser) {

		try (Connection conn = dbHelper.getConnection()) {

			PreparedStatement pstm = conn.prepareStatement(SET_USER);

			pstm.setString(1, nameUser);
			pstm.setString(2, surnameUser);
			pstm.setString(3, mailUser);
			pstm.setString(4, phoneUser);
			pstm.setDate(5, birthdayUser);

			pstm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean updateUser(int id, String nameUser, String surnameUser, String phoneUser, Date birthdayUser) {
		
		try (Connection conn = dbHelper.getConnection()) {

			PreparedStatement pstm = conn.prepareStatement(UPDATE_USER); 

			pstm.setInt(5, id);
			pstm.setString(1, nameUser);
			pstm.setString(2, surnameUser);
			pstm.setString(3, phoneUser);
			pstm.setDate(4, birthdayUser);

			pstm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
