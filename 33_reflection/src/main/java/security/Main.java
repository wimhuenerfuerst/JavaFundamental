package security;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import security.framework.SecurityIncovcationHandler;

public class Main {

	public static void main(String[] args) {
		MyService myService = new MyServiceImpl();

		myService.printUnsecure("myvalue");
		myService.printSecure("user", "123", "myvalue");

		InvocationHandler invocationHandler = new SecurityIncovcationHandler(myService);

		myService = (MyService) Proxy.newProxyInstance(Main.class.getClassLoader(), new Class[] { MyService.class },
				invocationHandler);

		myService.printUnsecure("myvalue");
		myService.printSecure("user", "123", "myvalue");
		myService.printSecure("test", "123", "myvalue");
	}

}
