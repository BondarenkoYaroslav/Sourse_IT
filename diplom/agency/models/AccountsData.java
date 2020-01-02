package agency.models;

public class AccountsData {

	private int idAccount;
	private String loginMailAccount;
	private String passwordAccount;
	private String access;

	public int getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(int idAccount) {
		this.idAccount = idAccount;
	}

	public String getLoginMailAccount() {
		return loginMailAccount;
	}

	public void setLoginMailAccount(String loginMailAccount) {
	
		if (loginMailAccount.contains("@")) {
			this.loginMailAccount = loginMailAccount;
		} else {
			this.loginMailAccount = null;
		}
	}

	public String getPasswordAccount() {
		return passwordAccount;
	}

	public void setPasswordAccount(String passwordAccount) {
		this.passwordAccount = passwordAccount;
	}

	public String getAccess() {
		return access;
	}

	public void setAccess(String access) {
		this.access = access;
	}

	@Override
	public String toString() {
		return "AccountData [idAccount = " + idAccount + ", loginMailAccount = " + loginMailAccount
				+ ", passwordAccount = " + passwordAccount + ", access = " + access + "]";
	}

}
