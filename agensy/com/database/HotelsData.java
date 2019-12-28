package com.database;

public class HotelsData {
	
	private int idHotel;
	private String nameHotel;
	
	public int getIdHotel() {
		return idHotel;
	}
	
	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}
	
	public String getNameHotel() {
		return nameHotel;
	}
	
	public void setNameHotel(String nameHotel) {
		this.nameHotel = nameHotel;
	}
	
	@Override
	public String toString() {
		return "HotelsData [idHotel = " + idHotel + ", nameHotel = " + nameHotel + "]";
	}

}
