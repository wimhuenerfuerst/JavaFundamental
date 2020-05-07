package junitdemo;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Test;

public class Test05 {

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
	public void test01() {
		UserRepository userRepositoryStub = new UserRepository() {
			Map<Long, String> users = new HashMap<Long, String>();

			@Override
			public long save(String user) {
				return 0;
			}

			@Override
			public String load(long id) {
				return "Test";
			}
		};

		UserService userService = new UserService(userRepositoryStub);
		String user = userService.loadUser(0);
		assertEquals(user, "Test");
	}

	@Test
	public void test02() {
		AtomicInteger saveCount = new AtomicInteger();

		UserRepository userRepositoryMock = new UserRepository() {
			@Override
			public long save(String user) {
				saveCount.incrementAndGet();
				return 0;
			}

			@Override
			public String load(long id) {
				return null;
			}
		};

		UserService userService = new UserService(userRepositoryMock);
		userService.createUser("Test");
		assertEquals(saveCount.get(), 1);
	}

	@Test
	public void test03() {
		UserRepository userRepositoryFake = new UserRepository() {
			Map<Long, String> users = new HashMap<Long, String>();

			@Override
			public long save(String user) {
				Long max = 0L;
				Set<Long> keys = users.keySet();

				if (keys.size() > 0) {
					max = Collections.max(keys) + 1;
				}

				users.put(max, user);

				return max;
			}

			@Override
			public String load(long id) {
				return users.get(id);
			}
		};

		UserService userService = new UserService(userRepositoryFake);
		String userName = "Test";
		Long id = userService.createUser(userName);
		String user = userService.loadUser(id);
		assertEquals(userName, user);
	}

}
