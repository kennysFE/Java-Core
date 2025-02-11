package DesignPatternsJava;

public class SingletonLogger {

	private static SingletonLogger instance;

	private SingletonLogger() {
		// Tạo kết nối tới file hoặc database nơi lưu log
	}

	public static SingletonLogger getInstance() {
		if (instance == null) {
			instance = new SingletonLogger();
		}
		return instance;
	}

	public void log(String message) {
		// Ghi log vào file hoặc console
		System.out.println("Log: " + message);
	}

}
