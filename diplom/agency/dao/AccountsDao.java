package agency.dao;

import agency.models.AccountsData;

public interface AccountsDao {

	AccountsData getAccountByMail(String mail);
	
	boolean isAnAccountRegistered(String mail);
	
	boolean createAccount(String mail, String password);
	
}
