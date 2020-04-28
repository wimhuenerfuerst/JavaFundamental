package security;

public class MyServiceImpl implements MyService {

	@Override
	public void printUnsecure(String value) {
		System.out.println("unsecure " + value);

	}

	@Override
	public void printSecure(String username, String password, String value) {
		System.out.println("secure " + value);
	}

}
