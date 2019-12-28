package dao;

import java.util.List;

import com.database.HotelsData;

public interface HotelDao {
	
	List<HotelsData> getHotelsId (int idHotel);
	List<HotelsData> getHotelsName (String nameHotel);
	
}
