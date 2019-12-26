package HW13Task3;

public class Task3 {

	public static void main(String[] args) {
		
		Runnable run1 = new AsynchronousCount();
		Thread thr1 = new Thread(run1);
		Thread thr2 = new Thread(run1);
		Thread thr3 = new Thread(run1);
		thr1.start();
		thr2.start();
		thr3.start();
		
		Runnable run2 = new SynchronousCount();
		Thread synchThr1 = new Thread(run2);
		Thread synchThr2 = new Thread(run2);
		Thread synchThr3 = new Thread(run2);
		synchThr1.start();
		synchThr2.start();
		synchThr3.start();
	}
}
