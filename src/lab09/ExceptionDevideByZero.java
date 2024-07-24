package lab09;

public class ExceptionDevideByZero extends Exception {
	public float x;
	public float y;

	public ExceptionDevideByZero(float x, float y) {
		super.getMessage();
		this.x = x;
		this.y = y;
	}

	@Override
	public String getMessage() {
		return "Exception Devide By Zero (" + x + "/" + y + ")";
	}
}
