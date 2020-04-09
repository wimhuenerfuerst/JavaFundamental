package examples;

public class LoggerUser {

	LoggerInterface loggerInterface;

	public LoggerUser(LoggerInterface loggerInterface) {
		this.loggerInterface = loggerInterface;
	}

	public void doSomething() {
		loggerInterface.print("doSomething was called");
	}
}
