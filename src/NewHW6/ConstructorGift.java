package NewHW6;

public class ConstructorGift {

	private String name, type;
	private int weight, amountOfSugar;
	
	public ConstructorGift(String name, String type, int weight, int amountOfSugar) {

		this.name = name;
		this.type = type;
		this.weight = weight;
		this.amountOfSugar = amountOfSugar;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public int getWeight() {
		return weight;
	}

	public int getAmountOfSugar() {
		return amountOfSugar;
	}

	@Override 
	public String toString() {
		return ("Наименование сладости: " + name + ". " + 
				"Тип сладости: " + type + ". " + 
				"Вес сладости: " + weight + " грамм. " + 
				"Содержание сахара: " + amountOfSugar + " грамм.");
	}
}
