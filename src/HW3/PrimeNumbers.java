package HW3;

public class PrimeNumbers {

	public static void main(String[] args) {
		int n;
		for (int j = 1; j < 100; j++) {
			n = 0;
			for (int i = 1; i <= j; i++) {
				if (j % i == 0)
					n++;
			}
			if (n == 2)
				System.out.println(j);
		}

	}

}