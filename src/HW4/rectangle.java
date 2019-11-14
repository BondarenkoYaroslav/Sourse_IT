package HW4;

import java.util.Scanner;

public class rectangle {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("¬ведите значение ширины пр€моугольника: ");
		int a = scan.nextInt();
		
		System.out.println("¬ведите значение высоты пр€моугольника: ");
		int b = scan.nextInt();

		String str = ("+").repeat(a-2);
		
		System.out.println("+" + str + "+");
		
		while (b > 2)
		{
			
			System.out.println("+" + str.replace('+', ' ') + "+");
			b--;
		}
		
		System.out.println("+" + str + "+");
		
	}

}
