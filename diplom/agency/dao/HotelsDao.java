package agency.dao;

import agency.models.HotelsData;

public interface HotelsDao {
	
	HotelsData getHotelById(int idHotel);
	
	boolean setHotel (int idFood, String nameHotel, int starsHotel);
	
	boolean updateHotel (int idHotel, int idFood, String nameHotel, int starsHotel);

}
