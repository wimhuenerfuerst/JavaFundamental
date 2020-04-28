package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {

	public static void main(String[] args) {
		MyInterface myInterface = (MyInterface) Proxy.newProxyInstance(Main.class.getClassLoader(),
				new Class<?>[] { MyInterface.class }, new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

						System.out.println("Method called " + method.getName());

						if ("sum".equals(method.getName())) {
							int a = (int) args[0];
							int b = (int) args[1];

							return a + b;
						} else if ("mul".equals(method.getName())) {
							int a = (int) args[0];
							int b = (int) args[1];

							return a * b;
						}

						return null;
					}
				});

		System.out.println(myInterface.sum(1, 2));
		System.out.println(myInterface.mul(1, 2));
		
		myInterface = new MyInterface() {
			
			@Override
			public int sum(int a, int b) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int mul(int a, int b) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		System.out.println(myInterface.sum(1, 2));
		System.out.println(myInterface.mul(1, 2));

	}

}
