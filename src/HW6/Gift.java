package HW6;

import java.util.Scanner;

public class Gift {

	public static void main(String args[]) {

		System.out.println("Подарок состоит из: ");
		System.out.println("_________________________________");

		Sweetmeats lollipops = new Sweetmeats();
		Caramel caramel = new Caramel();
		Chocolate chocolate = new Chocolate();

		System.out.println("_________________________________");
		System.out.println("Введите Да/Yes если хотите узнать суммарный вес подарка: ");
		System.out.println("_________________________________");
		Scanner scan = new Scanner(System.in);
		String condition1 = scan.nextLine();

		if (condition1.equalsIgnoreCase("Да") || condition1.equalsIgnoreCase("Yes")) {

			Object sum1 = Sweetmeats.sayWeight(3);
			Object sum2 = Caramel.sayWeight(3);
			Object sum3 = Chocolate.sayWeight(3);

			System.out
					.println("Суммарный вес подарка составляет: " + ((int) sum1 + (int) sum2 + (int) sum3) + " грамм");

		} else {
			System.out.println("Пропуск.");
		}
		System.out.println("_________________________________");
		System.out.println("Введите тип конфет для дополнительной информации! Шоколад, карамель, леденцы.");
		System.out.println("_________________________________");
		String condition2 = scan.nextLine();

		if (condition2.equalsIgnoreCase("Шоколад") || condition1.equalsIgnoreCase("Chocolate")) {

			Chocolate chocolate1 = new Chocolate();

		} else if (condition2.equalsIgnoreCase("Карамель") || condition1.equalsIgnoreCase("Caramel")) {

			Caramel caramel2 = new Caramel();

		} else if (condition2.equalsIgnoreCase("Леденцы") || condition1.equalsIgnoreCase("Lollipops")) {

			Sweetmeats lollipops3 = new Sweetmeats();

		} else {

			System.out.println("Введены не верные данные, но продолжим... ");

		}
		
		System.out.println("_________________________________");
		System.out.println("Введите Да/Yes если желаете найти конфету по содержанию сахара. ");
		String condition3 = scan.nextLine();
		
		if (condition3.equalsIgnoreCase("Да") || condition3.equalsIgnoreCase("Yes")) {
			
			System.out.println("Введите значение сахара (2,3,4,6,9,11,22,33) для поиска сладости: ");
			int suger = scan.nextInt();
			
			System.out.println("В следующий раз, вероятно...");
			
		} else {
			System.out.println("Работа программы завершена.");
		}
	}
}