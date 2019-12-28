package com.database;

public class TourData {
	
	private int idTour;
	private String nameTour;
	private int price;
	private String departureDay;
	private String departureCity;
	private int idCountry;
	private int idHotel;
	
	public int getIdTour() {
		return idTour;
	}
	
	public void setIdTour(int idTour) {
		this.idTour = idTour;
	}
	
	public String getNameTour() {
		return nameTour;
	}
	
	public void setNameTour(String nameTour) {
		this.nameTour = nameTour;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getDepartureDay() {
		return departureDay;
	}
	
	public void setDepartureDay(String departureDay) {
		this.departureDay = departureDay;
	}
	
	public String getDepartureCity() {
		return departureCity;
	}
	
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	
	public int getIdCountry() {
		return idCountry;
	}
	
	public void setIdCountry (int idCountry) {
		this.idCountry = idCountry;
	}
	
	public int getIdHotel() {
		return idHotel;
	}
	
	public void setIdHotel (int idHotel) {
		this.idHotel = idHotel;
	}
	
	@Override
	public String toString() {
		return "TourData[idTour = " + idTour + ", nameTour = " + nameTour + ", price = " + price + ", departureDay = " + departureDay + ", departureCity = " + departureCity + ", idCountry = " + idCountry + ", idHotel = " + idHotel +"]";
	}
}
