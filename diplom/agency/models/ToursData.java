package agency.models;

import java.sql.Date;

public class ToursData {

	private int idTour;
	private int idCountry;
	private int idRegion;
	private int idHotel;
	private Date departureData;
	private Date returnData;
	private int priceTour;

	public int getIdTour() {
		return idTour;
	}

	public void setIdTour(int idTour) {
		this.idTour = idTour;
	}

	public int getIdCountry() {
		return idCountry;
	}

	public void setIdCountry(int idCountry) {
		this.idCountry = idCountry;
	}

	public int getIdRegion() {
		return idRegion;
	}

	public void setIdRegion(int idRegion) {
		this.idRegion = idRegion;
	}

	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public Date getDepartureData() {
		return departureData;
	}

	public void setDepartureData(Date departureData) {
		this.departureData = departureData;
	}

	public Date getReturnData() {
		return returnData;
	}

	public void setReturnData(Date returnData) {
		this.returnData = returnData;
	}

	public int getPriceTour() {
		return priceTour;
	}

	public void setPriceTour(int priceTour) {
		this.priceTour = priceTour;
	}

	@Override
	public String toString() {
		return "ToursData [idTour =" + idTour + ", idCountry = " + idCountry + ", idRegion = " + idRegion
				+ ", idHotel = " + idHotel + ", departureData = " + departureData + ", returnData = " + returnData
				+ ", priceTour = " + priceTour + "]";
	}
}
