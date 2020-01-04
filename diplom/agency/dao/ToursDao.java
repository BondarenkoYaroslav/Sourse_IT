package agency.dao;

import java.sql.Date;

import agency.models.ToursData;

public interface ToursDao {
	
	ToursData getTourById(int idTour);

	boolean setTour(int idCountry, int idRegion, int idHotel, Date departureData, Date returnData, int priceTour);
	
	boolean updateTour(int idTour, int idCountry, int idRegion, int idHotel, Date departureData, Date returnData, int priceTour);
	
	boolean existId (int idTour);
}
