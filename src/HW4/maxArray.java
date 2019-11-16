package HW4;

import java.util.Scanner;

public class maxArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] arr = new int[5];
		System.out.println("¬ведите п€ть значений дл€ сравнени€:");
		arr[0] = scan.nextInt();
		arr[1] = scan.nextInt();
		arr[2] = scan.nextInt();
		arr[3] = scan.nextInt();
		arr[4] = scan.nextInt();

		System.out.println("—амое большое значение у числа:");

		if ((arr[0] >= arr[1]) && (arr[0] >= arr[2]) && (arr[0] >= arr[3]) && (arr[0] >= arr[4])) {
			System.out.println(arr[0]);
		}

		else if ((arr[1] >= arr[2]) && (arr[1] >= arr[3]) && (arr[1] >= arr[4])) {
			System.out.println(arr[1]);
		}

		else if ((arr[2] >= arr[3]) && (arr[2] >= arr[4])) {
			System.out.println(arr[2]);
		}

		else if ((arr[3] >= arr[4])) {
			System.out.println(arr[3]);
		} else if (arr[4] >= arr[1]) {
			System.out.println(arr[4]);
		}
	}
} 