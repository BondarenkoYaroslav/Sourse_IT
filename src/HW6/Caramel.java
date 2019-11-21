package HW6;

public class Caramel{
	public Caramel() {
		String caramel = "Карамельные конфеты";

		CandiesConstructor caramel1 = new CandiesConstructor("Рачок");
		caramel1.sayType(caramel);
		caramel1.sayWeight(5);
		caramel1.saySugar(3);
		caramel1.sayPrint();

		CandiesConstructor caramel2 = new CandiesConstructor("Жучок");
		caramel2.sayType(caramel);
		caramel2.sayWeight(10);
		caramel2.saySugar(6);
		caramel2.sayPrint();

		CandiesConstructor caramel3 = new CandiesConstructor("Волчок");
		caramel3.sayType(caramel);
		caramel3.sayWeight(15);
		caramel3.saySugar(9);
		caramel3.sayPrint();
	}
	public static Object sayWeight(int i) {
		return 5+10+15;
	}
}
