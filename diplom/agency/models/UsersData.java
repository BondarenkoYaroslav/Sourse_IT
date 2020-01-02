package agency.models;

import java.sql.Date;

public class UsersData {

	private int idUser;
	private String nameUser;
	private String surnameUser;
	private String mailUser;
	private String phoneUser;
	private Date birthdayUser;

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

	public String getSurnameUser() {
		return surnameUser;
	}

	public void setSurnameUser(String surnameUser) {
		this.surnameUser = surnameUser;
	}

	public String getMailUser() {
		return mailUser;
	}

	public void setMailUser(String mailUser) {
		
		if (mailUser.contains("@"))
		{	
		this.mailUser = mailUser;
		} else {
			this.mailUser = null;
		}
	}

	public String getPhoneUser() {
		return phoneUser;
	}

	public void setPhoneUser(String phoneUser) {
		this.phoneUser = phoneUser;
	}

	public Date getBirthdayUser() {
		return birthdayUser;
	}

	public void setBirthdayUser(Date birthdayUser) {
		this.birthdayUser = birthdayUser;
	}

	@Override
	public String toString() {
		return "UsersData [idUser = " + ", nameUser = " + nameUser + ", surnameUser = " + surnameUser + ", mailUser = "
				+ mailUser + ", phoneUser" + phoneUser + ", birthdayUser = " + birthdayUser + "]";
	}

}
