package security;

import security.framework.SecurityCheck;

public interface MyService {

	void printUnsecure(String value);

	@SecurityCheck
	void printSecure(String username, String password, String value);

}
