package HW13Task5;

import java.util.Scanner;

public class Task5 extends Thread {
	
	private static StringBuffer sb = new StringBuffer();
	
	public Task5(StringBuffer sb) {
		Task5.sb = sb;
	}

	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		
		Thread thr0 = new Task5(sb.append(scan.nextLine()));
		Thread thr1 = new Task5(sb.append(scan.nextLine()));
		Thread thr2 = new Task5(sb.append(scan.nextLine()));
		
		scan.close();
		
		thr0.start();
		thr1.start();
		thr2.start();
	}
	
	public void run() {

		System.out.println(sb);

	}
	
}
