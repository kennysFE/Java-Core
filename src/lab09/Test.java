package lab09;

public class Test {
	public static void main(String[] args) {
		try {
			int x = Calculator.divide(5, 0);
			System.out.println("sum = " + x);
		} catch (ExceptionDevideByZero e) {
			System.out.println(e.getMessage());
		}

	}
}
