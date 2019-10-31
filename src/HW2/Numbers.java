package HW2;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Введите шестизначное число: ");
		int x = scan.nextInt();
		int x1 = x / 100000;
		if (x >= 100000 || (x1 == 0 && x <= 99999))
			if (x <= 999999) {
				int x2 = (x / 10000) - (x1 * 10);
				int x3 = (x / 1000) - (x1 * 100) - (x2 * 10);
				int x4 = (x / 100) - (x1 * 1000) - (x2 * 100) - (x3 * 10);
				int x5 = (x / 10) - (x1 * 10000) - (x2 * 1000) - (x3 * 100) - (x4 * 10);
				int x6 = x - (x1 * 100000) - (x2 * 10000) - (x3 * 1000) - (x4 * 100) - (x5 * 10);
				System.out.println("Переводим значения в столбик:");
				System.out.println(x1);
				System.out.println(x2);
				System.out.println(x3);
				System.out.println(x4);
				System.out.println(x5);
				System.out.println(x6);
			} else {
				System.out.println("Неверное значение! Перезапустите программу и попробуйте ещё раз ;)");
			}
		scan.close();
	}
}
