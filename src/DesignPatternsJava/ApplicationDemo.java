package DesignPatternsJava;

public class ApplicationDemo {
	public static void main(String[] args) {

		SingletonLogger logger = SingletonLogger.getInstance();
		logger.log(" Log message ");

		SingletonLogger logger2 = SingletonLogger.getInstance();
		logger2.log(" Another log message ");
		logger.log(" Log message 2");
	}
}
