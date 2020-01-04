package agency.dao;

public interface CountriesDao {

	String getCountryById(int idCountry);
	
	boolean setCountry(String nameCountry);
	
	boolean updateCountry(int idCountry, String nameCountry);
	
}
