package HW13Task4;

import java.util.concurrent.Callable;

public class MatrixThread extends Thread implements Callable<Integer> {

	private int parametr;
	private static int m = 4;
	private static int n = 100;
	private static int[][] arr = new int[m][n];
	private static int[] maxValueOllThread = new int[4];

	private static int[][] Arr() {

		for (int i = 0; i < m; i++) {

			for (int j = 0; j < n; j++) {

				arr[i][j] = (int) (-10_000 + (Math.random() * (10_000 - (-10_000))));
			}
		}
		return arr;
	}

	public MatrixThread(int parametr) {
		this.parametr = parametr;
	}

	public static void main(String[] args) throws Exception {

		Arr();

		Thread thr0 = new MatrixThread(0);
		Thread thr1 = new MatrixThread(1);
		Thread thr2 = new MatrixThread(2);
		Thread thr3 = new MatrixThread(3);

		long start = System.currentTimeMillis();

		thr0.start();
		thr0.join();
		thr1.start();
		thr1.join();
		thr2.start();
		thr2.join();
		thr3.start();
		thr3.join();

		int a = Math.max(maxValueOllThread[0], maxValueOllThread[1]);
		int b = Math.max(maxValueOllThread[2], maxValueOllThread[3]);
		int reMaxValue = Math.max(a, b);

		long finish = System.currentTimeMillis();

		System.out.println("Максимальное значение: " + reMaxValue);
		System.out.println("Время выполнения: " + (finish - start));

//		Максимальное значение: 9964
//		Время выполнения: 495

	}

	@Override
	public Integer call() throws Exception {

		int maxValue = -35536;

		for (int j = 0; j < n; j++) {

			Thread.sleep(1);

			if (arr[parametr][j] > maxValue) {
				maxValue = arr[parametr][j];
			}

		}
		if (maxValueOllThread[parametr] < maxValue) {
			maxValueOllThread[parametr] = maxValue;
		}
		return maxValue;
	}

	public void run() {

		MatrixThread task = new MatrixThread(parametr);

		try {
			task.call();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}