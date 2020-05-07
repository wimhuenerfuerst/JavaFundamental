package mockitodemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {

	public static interface Test {
		public void dosomething();
	}

	public static void main(String[] args) {
		InvocationHandler handler = new InvocationHandler() {

			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

				System.out.println(method);

				return null;
			}
		};
		Class[] proxyInterfaces = new Class[]{Test.class};

		Test test = (Test) Proxy.newProxyInstance(Main.class.getClassLoader(), proxyInterfaces, handler);
		test.dosomething();
	}

}
