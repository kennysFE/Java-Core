package lab09;

public class Calculator {
	public static int divide(int x, int y) throws ExceptionDevideByZero {
		if (y == 0) {
			throw new ExceptionDevideByZero(x, y);
		}
		return x / y;
	}

	public static int plus(int x, int y) {
		return x + y;
	}
}
