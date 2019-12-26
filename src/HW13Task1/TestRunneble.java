package HW13Task1;

public class TestRunneble implements Runnable {

	public void run() {

		for (int i = 0; i < 5000; i += 500) {

			System.out.println(Thread.currentThread().getName());

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {

		Thread thread = new Thread(new TestRunneble());
		thread.setName("MISS ME?");
		thread.start();
	}
}
