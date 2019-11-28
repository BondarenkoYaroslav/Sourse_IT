package HW6;

public class Chocolate {

	public Chocolate() {

		String chocoType = "Шоколадные конфеты";

		CandiesConstructor choco1 = new CandiesConstructor("Ромашка");
		choco1.sayType(chocoType);
		choco1.sayWeight(15);
		choco1.saySugar(11);

		CandiesConstructor choco2 = new CandiesConstructor("Букашка");
		choco2.sayType(chocoType);
		choco2.sayWeight(30);
		choco2.saySugar(22);
		choco2.sayPrint();

		CandiesConstructor choco3 = new CandiesConstructor("Некрономикашка");
		choco3.sayType(chocoType);
		choco3.sayWeight(45);
		choco3.saySugar(33);
		choco3.sayPrint();
	}

	public static Object sayWeight(int i) {
		return 15 + 30 + 45;
	}
}
