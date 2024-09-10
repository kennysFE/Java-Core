package Lab13;

public class ThreadTwo extends Thread {
	private String name;

	public ThreadTwo(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name + ">>>" + i + ">>>" + isAlive());
		}
	}
}
