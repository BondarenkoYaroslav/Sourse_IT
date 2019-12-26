package HW13Task3;

public class SynchronousCount implements Runnable {

	private int count1 = 0;
	private int count2 = 0;

	public synchronized void run() {

		while (count1 < 1000) {
			if (count1 == count2) {

				System.out.println("synch " + count1 + " == " + count2);

				count1++;

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				count2++;

			} else {
				System.out.println("synch " + count1 + " == " + count2);
				count1++;

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				count2++;
			}
		}
	}

}
