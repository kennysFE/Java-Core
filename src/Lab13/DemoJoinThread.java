package Lab13;

public class DemoJoinThread {
	public static void main(String[] args) {
		System.out.println(" Thread main begin ");
		ThreadTwo t2 = new ThreadTwo("t2");
		Thread t4 = new Thread(new ThreadFour(t2));

		t2.start();
		t4.start();
		System.out.println(" Thread main end ");
	}
}
