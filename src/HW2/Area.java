package HW2;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("¬ведите значение первой стороны треугольника: ");
		double a = scan.nextDouble();
		System.out.println("¬ведите значение второй стороны треугольника: ");
		double b = scan.nextDouble();
		System.out.println("¬ведите значение третьей стороны треугольника: ");
		double c = scan.nextDouble();
		if (a > 0 && b > 0 && c > 0 && a < b + c && b < a + c && c < a + b) {
			double p = (a + b + c) / 2; // p Ц полупериметр треугольника
			double s = Math.sqrt((p * (p - a) * (p - b) * (p - c))); // s - площадь треугольника
			System.out.println("ѕлощадь ¬ашего треуголника равна: " + s);
		} else
			System.out.println("¬ведены неверные значени€! ѕерезапустите программу и попробуйте ещЄ ;)");
		scan.close();
	}
}
