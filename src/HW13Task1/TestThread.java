package HW13Task1;

public class TestThread extends Thread {

	TestThread(String name) {
		super(name);
	}

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
		
		new TestThread("MISS ME?").start();

	}

}
