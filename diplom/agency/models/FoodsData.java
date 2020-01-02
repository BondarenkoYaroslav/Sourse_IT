package agency.models;

public class FoodsData {

	private int idFood;
	private String nameFood;

	public int getIdFood() {
		return idFood;
	}

	public void setIdFood(int idFood) {
		this.idFood = idFood;
	}

	public String getNameFood() {
		return nameFood;
	}

	public void setNameFood(String nameFood) {
		this.nameFood = nameFood;
	}

	@Override
	public String toString() {
		return "FoodsData [idFood" + idFood + ", nameFood = " + nameFood + "]";
	}
}
