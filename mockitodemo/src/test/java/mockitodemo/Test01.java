package mockitodemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class Test01 {

	private interface UserRepository {
		public long save(String user);
		public String load(long id);
	}

	private class UserService {
		private UserRepository userRepository;

		public UserService(UserRepository userRepository) {
			this.userRepository = userRepository;
		}

		public long createUser(String user) {
			return userRepository.save(user);
		}

		public String loadUser(long id) {
			return userRepository.load(id);
		}
	}

	@Test
	public void test01a() {
		UserRepository userRepositoryStub = mock(UserRepository.class);
		when(userRepositoryStub.load(anyLong())).thenReturn("Test1");

		UserService userService = new UserService(userRepositoryStub);
		String user = userService.loadUser(0);

		assertEquals("Test1", user);
	}

	@Test
	public void test01b() {
		UserRepository userRepositoryStub = mock(UserRepository.class);
		when(userRepositoryStub.load(anyLong())).thenReturn("Test1").thenReturn("Test2");

		UserService userService = new UserService(userRepositoryStub);
		String user = userService.loadUser(0);

		assertEquals("Test1", user);

		user = userService.loadUser(0);

		assertEquals("Test2", user);
	}

	@Test
	public void test01c() {
		UserRepository userRepositoryStub = mock(UserRepository.class);
		when(userRepositoryStub.load(1)).thenReturn("Test1");
		when(userRepositoryStub.load(2)).thenReturn("Test2");

		UserService userService = new UserService(userRepositoryStub);
		String user = userService.loadUser(2);

		assertEquals("Test2", user);

		user = userService.loadUser(1);

		assertEquals("Test1", user);
	}

	@Test
	public void test01d() {
		UserRepository userRepositoryStub = mock(UserRepository.class);
		when(userRepositoryStub.load(isA(Long.class))).thenReturn("Test1");

		UserService userService = new UserService(userRepositoryStub);
		String user = userService.loadUser(1);

		assertEquals("Test1", user);
	}

	@Test
	public void test01e() {
		UserRepository userRepositoryStub = mock(UserRepository.class);
		when(userRepositoryStub.load(anyLong()))
				.thenThrow(NullPointerException.class);

		UserService userService = new UserService(userRepositoryStub);

		assertThrows(NullPointerException.class, () -> {
			String user = userService.loadUser(1);
		});
	}

	@Test
	public void test01f() {
		UserRepository userRepositoryStub = mock(UserRepository.class);
		doReturn("Test1").when(userRepositoryStub).load(anyLong()); // no type
																	// safety in
																	// return
		// doNothing
		// doThrow

		UserService userService = new UserService(userRepositoryStub);
		String user = userService.loadUser(0);

		assertEquals("Test1", user);
	}
}
