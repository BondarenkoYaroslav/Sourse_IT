package agency.dao;

import java.sql.Date;

import agency.models.UsersData;

public interface UsersDao {

	UsersData getUserById(int idUser);

	UsersData getUserByMail(String mail);

	boolean setUser(String nameUser, String surnameUser, String mailUser, String phoneUser, Date birthdayUser);
	
	boolean updateUser(int id, String nameUser, String surnameUser, String phoneUser, Date birthdayUser);
}
