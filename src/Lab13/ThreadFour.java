package Lab13;

public class ThreadFour implements Runnable {

	ThreadTwo t2;

	public ThreadFour() {
	}

	public ThreadFour(ThreadTwo t2) {
		this.t2 = t2;
	}

	public void run() {
		try {
			System.out.println(" Join t2 into t4 ");
			t2.join();
			System.out.println(" t2 end ");
			for (int i = 0; i < 10; i++) {
				System.out.println(" Thread fout >> " + i);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
