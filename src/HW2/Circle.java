package HW2;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите значение радиуса окружности: ");
		double r = scan.nextDouble();
		System.out.println("Длинна окружности равняется:" + "" + Math.PI*(r*2));
		scan.close();
	}
}