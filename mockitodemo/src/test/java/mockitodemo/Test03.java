package mockitodemo;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Test03 {

	private interface UserRepository {
		public long save(String user);
		public String load(long id);
	}

	private static class UserService {
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

	@Mock
	private UserRepository userRepository;

	@Spy
	private List<String> listSpy = new ArrayList<String>();

	@Captor
	ArgumentCaptor<Long> longCaptor;

	@InjectMocks
	private UserService userService;

	@Test
	public void test01a() {
		when(userRepository.load(anyLong())).thenReturn("Test1")
				.thenReturn("Test2");

		String user = userService.loadUser(0);

		assertEquals("Test1", user);

		user = userService.loadUser(0);

		assertEquals("Test2", user);
	}

	@Test
	public void test01b() {
		when(userRepository.load(anyLong())).thenReturn("Test1");
		String user = userService.loadUser(0);

		assertEquals("Test1", user);

		user = userService.loadUser(0);

		assertEquals("Test1", user);
	}

	@Test
	public void test02() {
		doReturn("0").when(listSpy).get(0);
		assertEquals("0", listSpy.get(0));
	}

	@Test
	public void test03() {
		userService.loadUser(1);

		verify(userRepository).load(longCaptor.capture());

		Long result = longCaptor.getValue();
		assertEquals(result, new Long(1));
	}
}
