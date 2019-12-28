package com.database;

public class AccountsData {

	private int idAcc;
	private String loginAcc;
	private String passwordAcc;

	public int getIdAcc() {
		return idAcc;
	}

	public void setIdAcc(int idAcc) {
		this.idAcc = idAcc;
	}

	public String getloginAcc() {
		return loginAcc;
	}

	public void setLoginAcc(String loginAcc) {
		this.loginAcc = loginAcc;
	}

	public String getPasswordAcc() {
		return passwordAcc;
	}

	public void setPasswordAcc(String passwordAcc) {
		this.passwordAcc = passwordAcc;
	}

	@Override
	public String toString() {
		return "AccountsData [idAcc = " + idAcc + ", loginAcc = " + loginAcc + ", passwordAcc = " + passwordAcc + "]";
	}

}
