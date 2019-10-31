package HW3;

import java.util.Scanner;

public class StarrySky {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("¬ведите значение звЄздного неба:");

		int n = scan.nextInt();
		int n2 = n;
		int n3 = 1;

		scan.close();

		String str1 = ("*");
		String str2 = ("" + str1);
		while (n > 0) {
			System.out.println("" + str2);
			str2 = (str2 + str1);
			n--;
		}

		System.out.println(str2.substring(0, str2.length() - 2));
		while (n2 > 1) {
			n3++;
			System.out.println(str2.substring(0, str2.length() - (n3 + 1)));
			n2--;
		}
	}

}
