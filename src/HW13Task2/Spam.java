package HW13Task2;

public class Spam extends Thread {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Thread thread = new Spam();
		
		thread.start();
		
		String stopThread = Part2();
		
		if (stopThread != null) {
			
			thread.stop();
		}
	}
	
	public static String Part2 () {
		
		try {
			sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return "\n";
		
	}
	
	
	public void run() {
		
		int[] arrInt= {200, 200, 200, 200, 200, 200, 200, 200, 200};
		
		String[] arrString = {"Дом, ", "в ", "котором ", "нет ", "книг, ", "подобен ", "телу, ", "лишенному ", "души."};
		
		for (int i = 0; i < arrInt.length; i++) {
			
			try {
				Thread.sleep(arrInt[i]);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.printf(arrString[i]);
			
			if (i == 8) {
				System.out.println();
				i = -1;
			}
		}
		
	}
}
