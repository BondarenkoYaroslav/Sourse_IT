package HW6;

public class CandiesConstructor {

	String name;
	String type;
	int weight;
	int sugar;

	public CandiesConstructor(String name) {
		this.name = name;
	}

	public void sayType(String sayType) {
		type = sayType;
	}

	public void sayWeight(int sayWeight) {
		weight = sayWeight;
	}

	public void saySugar(int saySugar) {
		sugar = saySugar;
	}

	public void sayPrint() {
		System.out.println("Название сладости: " + name);
		System.out.println("Тип сладости: " + type);
		System.out.println("Вес сладости: " + weight + " грамм");
		System.out.println("Колличество сахара: " + sugar + " грамм");
		System.out.println("");
	}
}
