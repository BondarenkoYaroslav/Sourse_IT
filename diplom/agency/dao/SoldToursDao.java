package agency.dao;

import java.util.List;

import agency.models.SoldToursData;

public interface SoldToursDao {
	
	SoldToursData soldToursDataByIdSold (int idSold);
	
	List<Integer> soldToursDataByIdClient (int idClient);
	
	List<Integer> soldToursDataByIdTour (int idTour);

}
