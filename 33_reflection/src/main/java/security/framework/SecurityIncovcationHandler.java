package security.framework;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SecurityIncovcationHandler implements InvocationHandler {

	Object secureObject;

	public SecurityIncovcationHandler(Object secureObject) {
		this.secureObject = secureObject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		if (method.isAnnotationPresent(SecurityCheck.class)) {
			String username = (String) args[0];
			String password = (String) args[1];

			if (username.equals("user") && password.equals("123")) {
				return method.invoke(secureObject, args);
			} else {
				throw new SecurityException("Access rejected");
			}
		}

		return method.invoke(secureObject, args);
	}
}
