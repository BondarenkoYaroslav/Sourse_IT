package com.database;

public class CustomersData {
	
	private int id;
	private String mail;
	private String phone;
	private String name;
	private String surname;
	private String birthday;
	
	public int getId() {
		return id;
	}
	
	public void setId (int id) {
		this.id = id;
	}
	
	public String getMail() {
		return mail;
	}
	
	public void setMail (String mail) {
		this.mail = mail;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getBirthday() {
		return birthday;
	}
	
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	@Override
	public String toString() {
		return "CustomersData [id = " + id + ", mail = " + mail + ", phone = " + phone + ", name = " + name + ", surname = " + surname + ", birthday = " + birthday + "]";
	}
	
}
