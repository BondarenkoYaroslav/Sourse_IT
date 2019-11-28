package HW6;

public class Sweetmeats {

	public Sweetmeats() {

		String lollipop = "Леденцовая карамель";

		CandiesConstructor sweet1 = new CandiesConstructor("Петушок");
		sweet1.sayType(lollipop);
		sweet1.sayWeight(3);
		sweet1.saySugar(2);
		sweet1.sayPrint();

		CandiesConstructor sweet2 = new CandiesConstructor("Дракон");
		sweet2.sayType(lollipop);
		sweet2.sayWeight(6);
		sweet2.saySugar(4);
		sweet2.sayPrint();

		CandiesConstructor sweet3 = new CandiesConstructor("Волчок");
		sweet3.sayType(lollipop);
		sweet3.sayWeight(9);
		sweet3.saySugar(6);
		sweet3.sayPrint();
	}

	public static Object sayWeight(int i) {
		return 3+6+9;
	}
}