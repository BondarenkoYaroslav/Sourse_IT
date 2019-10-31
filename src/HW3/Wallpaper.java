package HW3;

import java.util.Scanner;

public class Wallpaper {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Сколько полосок? ");
		int m = sc.nextInt();
		System.out.println("Какая ширина полосок? ");
		int n = sc.nextInt();
		System.out.println("Какая высота? ");
		int h = sc.nextInt();

		for (int k = 0; k < h; k++) {
			int j = 0;
			while (j < m) {
				if (j % 2 == 0) {
					for (int i = 0; i < n; i++) {
						System.out.print("+");
					}
				}
				if (j % 2 != 0) {
					for (int i = 0; i < n; i++) {
						System.out.print("*");
					}
				}
				j++;
			}
			System.out.print("\n");
		}
	}

}
