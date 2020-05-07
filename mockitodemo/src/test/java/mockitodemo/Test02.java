package mockitodemo;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.ArgumentCaptor;

public class Test02 {

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
	public void test02() {
		UserRepository userRepositoryMock = mock(UserRepository.class);
		when(userRepositoryMock.save(anyString())).thenReturn(2L);

		UserService userService = new UserService(userRepositoryMock);
		long id = userService.createUser("Test");

		verify(userRepositoryMock).save(anyString());
		// times(1)
		// never()
		// atLeastOnce()
		// atLeast(2)
		// atMost(3)
	}

	@Test
	public void test03() {
		List<String> list = new ArrayList<String>();
		list.add("0");
		list.add("1");
		list.add("2");

		List<String> listSpy = spy(list);
		when(listSpy.get(1)).thenReturn("10");

		assertEquals("0", listSpy.get(0));
		assertEquals("10", listSpy.get(1));
		assertEquals("2", listSpy.get(2));
	}

	public static class Printer {
		public String print() {
			System.out.println("hello printer");

			return "123";
		}
	}

	@Test
	public void test04() {
		System.out.println("mock");

		Printer printerMock = mock(Printer.class);
		when(printerMock.print()).thenReturn("456");
		assertEquals("456", printerMock.print());

		System.out.println("spy");

		Printer printerSpy = spy(Printer.class);
		when(printerSpy.print()).thenReturn("456");
		assertEquals("456", printerSpy.print());
	}

	@Test
	public void test05() {
		List<String> list = new ArrayList<String>();

		List<String> listSpy = spy(list);
		//when(listSpy.get(0)).thenReturn("0");
		doReturn("0").when(listSpy).get(0);

		assertEquals("0", listSpy.get(0));
	}

	@Test
	public void test06() {
		UserRepository userRepositoryMock = mock(UserRepository.class);
		ArgumentCaptor<Long> longCaptor = ArgumentCaptor.forClass(Long.class);

		UserService userService = new UserService(userRepositoryMock);
		userService.loadUser(1);

		verify(userRepositoryMock).load(longCaptor.capture());

		Long result = longCaptor.getValue();
		assertEquals(result, new Long(1));
	}
}
