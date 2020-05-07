package junitdemo;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class Test04 {
	@Test
	public void test01() {
		try {
			double a = 10 / 0;
			fail();
		} catch (ArithmeticException e) {
			assertTrue(e instanceof ArithmeticException
					&& "/ by zero".equals(e.getMessage()));
		}
	}

	@Test(expected = ArithmeticException.class)
	public void test02() {
		double a = 10 / 0;
		fail();
	}

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void test03() {

		thrown.expect(ArithmeticException.class);
		thrown.expectMessage("/ by zero");

		double a = 10 * 0;
	}

	@Test
	public void test04() {

		assertThrows("/ by zero", ArithmeticException.class, () -> {
			double a = 10 / 0;
		});
	}

}
