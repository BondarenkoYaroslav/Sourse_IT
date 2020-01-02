package agency.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import agency.dao.AccountsDao;
import agency.models.AccountsData;
import dbUtils.DbHelper;

public class DefaultAccountsDao implements AccountsDao {

	private static final String SELECT_ACCOUNT_BY_MAIL = "SELECT * FROM accounts WHERE login_mail_user = ?";
	private static final String CREATE_ACCOUNT = "INSERT INTO `agencydb`.`accounts` (`login_mail_user`, `password_acc`, `access`) VALUES ( ?, ?, 'user');";

	private static DefaultAccountsDao instance;

	private DbHelper dbHelper;

	private DefaultAccountsDao() {
		dbHelper = DbHelper.getInstance();
	}

	public synchronized static DefaultAccountsDao getInstance() {
		if (instance == null) {
			instance = new DefaultAccountsDao();
		}
		return instance;
	}

	@Override
	public AccountsData getAccountByMail(String mail) {

		AccountsData accountsData = null;

		PreparedStatement pstm = null;
		ResultSet rs = null;

		try (Connection conn = dbHelper.getConnection()) {

			pstm = conn.prepareStatement(SELECT_ACCOUNT_BY_MAIL);

			pstm.setString(1, mail);

			rs = pstm.executeQuery();

			while (rs.next()) {

				accountsData = new AccountsData();
				accountsData.setIdAccount(rs.getInt(1));
				accountsData.setLoginMailAccount(rs.getString(2));
				accountsData.setPasswordAccount(rs.getString(3));
				accountsData.setAccess(rs.getString(4));

			}
			return accountsData;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return accountsData;
	}

	@Override
	public boolean createAccount(String mail, String password) {
		
		try (Connection conn = dbHelper.getConnection()) {

			PreparedStatement pstm = conn.prepareStatement(CREATE_ACCOUNT);

			pstm.setString(1, mail);
			pstm.setString(2, password);

			pstm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean isAnAccountRegistered(String mail) {
		
		PreparedStatement pstm = null;
		ResultSet rs = null;

		try (Connection conn = dbHelper.getConnection()) {

			pstm = conn.prepareStatement("SELECT id_acc FROM accounts WHERE login_mail_user = ?");

			pstm.setString(1, mail);

			rs = pstm.executeQuery();

			if (rs.next()) {
				return true;	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
