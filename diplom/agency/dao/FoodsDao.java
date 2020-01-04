package agency.dao;

public interface FoodsDao {

	String getFoodById(int idFood);

	boolean setFood(String nameFood);

	boolean updateFood(int idFood, String nameFood);

}
