package HW13Task4;

import java.util.concurrent.Callable;

public class MatrixThreads extends Thread implements Callable<Integer> {

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

	public MatrixThreads(int parametr) {
		this.parametr = parametr;
	}

	public static void main(String[] args) throws Exception {

		Arr();

		Thread thr0 = new MatrixThreads(0);
		Thread thr1 = new MatrixThreads(1);
		Thread thr2 = new MatrixThreads(2);
		Thread thr3 = new MatrixThreads(3);

		long start = System.currentTimeMillis();

		thr0.start();
		thr1.start();
		thr2.start();
		thr3.start();
		thr0.join();
		thr1.join();
		thr2.join();
		thr3.join();

		int a = Math.max(maxValueOllThread[0], maxValueOllThread[1]);
		int b = Math.max(maxValueOllThread[2], maxValueOllThread[3]);
		int reMaxValue = Math.max(a, b);

		long finish = System.currentTimeMillis();

		System.out.println("Максимальное значение: " + reMaxValue);
		System.out.println("Время выполнения: " + (finish - start));
		
//		Максимальное значение: 9997
//		Время выполнения: 174

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

		MatrixThreads task = new MatrixThreads(parametr);

		try {
			task.call();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}