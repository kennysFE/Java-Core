package DesignPatternsJava;

public class Singleton {

	/**
	 * Đảm bảo rằng một lớp chỉ có một thể hiện duy nhất trong suốt quá trình chạy
	 * của ứng dụng.(Example: Logger, Database, Configuration, ...)
	 * 
	 * Cần phải cẩn thận với Singleton khi triển khai trong môi trường đa luồng, vì
	 * có thể dẫn đến các vấn đề như race conditions nếu không được quản lý đúng
	 * cách.
	 */

	private static Singleton instance;

	private Singleton() {
	}

	public static Singleton getInstance() {

		if (instance == null) {
			instance = new Singleton();
		}
		return instance;

	}
}
