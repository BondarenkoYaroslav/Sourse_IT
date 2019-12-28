package com.database;

public class CountriesData {
	
	private int idCountry;
	private String nameCountry;
	
	public int getIdCountry() {
		return idCountry;
	}
	
	public void setIdCountry (int idCountry) {
		this.idCountry = idCountry;
	}
	
	public String getNameCountry() {
		return nameCountry;
	}
	
	public void setNameCountry(String nameCountry) {
		this.nameCountry = nameCountry;
	}
	
	@Override
	public String toString() {
		return "CountriesData = [ idCountry = " + idCountry + ", nameCountry = " + nameCountry + "]";
	}

}
