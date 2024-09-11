package Lab13;

public class TestThread {
	public static void main(String[] args) {
		// Create thread one
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 15; i++) {
					System.out.println("Thread 1 >>> i = " + i);
					try {
						Thread.sleep(2500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			};
		};
		t1.start();

		// Create thread two throught class ThreadTwo extends Thread
		Thread t2 = new ThreadTwo("t2");
		t2.start();

		// Create thread three throuht class ThreadThree implement Runable
		Thread t3 = new Thread(new ThreadThree("t3"));
		t3.start();

		// Testing status thread
		for (int i = 0; i < 20; i++) {
			System.out.println("Main thread >>> " + i);
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Check status thread >>> " + t1.isAlive());
			System.out.println("Check status thread >>> " + t2.isAlive());
			System.out.println("Check status thread >>> " + t3.isAlive());
		}
	}
}
