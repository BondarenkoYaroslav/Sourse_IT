package agency.dao;

public interface RegionsDao {

	String getRegionById(int idRegion);

	boolean setRegion(String nameRegion);

	boolean updateRegion(int idRegion, String nameRegion);
}
