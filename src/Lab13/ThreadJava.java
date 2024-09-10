package Lab13;

public class ThreadJava {
	public static void main(String[] args) {
		// Tao main thread => Bat buoc khi khoi tao mot ung dung thread
		// Cach 1

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// ham sleep => chay tung phan tu sau mot khoan thoi gian t
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				// Goi toi phan xu ly code trong phan nay => khi ma t1.start() duoc goi
				for (int i = 0; i < 10; i++) {
					System.out.println("i -> " + i);
				}

			}
		});
		t1.start();
		// Tai thoi diem nay, ung dung co 2 thread -> do la t1 & thread

		// Lay thread 2 tu ThreadTwo.java
		Thread t2 = new ThreadTwo("T2");
		t2.start();

		// Lay thread 3 tu ThreadThree.java
		ThreadThree r = new ThreadThree("T3");
		Thread t3 = new Thread(r);
		t3.start();

		// Main thread
		for (int i = 0; i < 15; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(" T1 >> isAlive " + t1.isAlive());
			System.out.println(" T2 >> isAlive " + t2.isAlive());
			System.out.println(" T3 >> isAlive " + t3.isAlive());
			System.out.println("Main thread -> " + i);
		}

		// Khi chay ung dung -> ung dung se chay dong thoi 4 thread

	}
}
