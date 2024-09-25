package Lab13;

public class ThreadThree implements Runnable {
	private String name;

	public ThreadThree(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 15; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name + ">>>" + i);
		}

	}

}
