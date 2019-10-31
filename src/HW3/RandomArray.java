package HW3;

import java.util.Arrays;

public class RandomArray {

	public static void main(String[] args) {

		int[] arr1 = new int[10];
		
		for (int i = 0; i < 10; i++) {
			arr1[i] = (int) (Math.random() * 40 + 1);
			System.out.print(arr1[i] + " ");
		}

		System.out.print("\n");

		int[] arr2 = new int[20];
		arr2 = Arrays.copyOf(arr1, 20);

		for (int i = 0; i < 10; i++) {
			arr2[i + 10] = arr2[i] * 2;
		}

		for (int i = 0; i < 20; i++) {
			System.out.print(arr2[i] + " ");
		}

	}

}