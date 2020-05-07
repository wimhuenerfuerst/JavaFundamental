package junitdemo;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class Test03 {

	private class UnderTest {
		public int pow2(int value) {
			return value * value;
		}

		public boolean greaterThan(int a, int b) {
			return a > b;
		}

		public String get(int i) {
			return new String[]{null, "test"}[i];
		}
	}

	@Test
	public void test01() {
		// Setup
		UnderTest underTest = new UnderTest();
		// Execution
		int result = underTest.pow2(3);
		// Test
		assertEquals(result, 9);
	}

	@Test
	public void test02() {
		// Setup
		UnderTest underTest = new UnderTest();
		// Execution
		boolean result = underTest.greaterThan(1, 2);
		// Test
		assertFalse(result);
	}

	@Test
	public void test03() {
		// Setup
		UnderTest underTest = new UnderTest();
		// ExecutionF
		boolean result = underTest.greaterThan(2, 1);
		// Test
		assertTrue(result);
	}

	@Test
	public void test04() {
		// Setup
		UnderTest underTest = new UnderTest();
		// ExecutionF
		String result = underTest.get(0);
		// Test
		assertNull(result);
	}

	@Test
	public void test05() {
		// Setup
		UnderTest underTest = new UnderTest();
		// ExecutionF
		String result = underTest.get(1);
		// Test
		assertNotNull(result);
	}

	@Test
	public void test06() {
		String a = "qwert";
		String b = new String("qwert");

		assertNotSame(a, b); // ???
	}

	@Test
	public void test07() {
		String a = "qwert";
		String b = "qwert";

		assertSame(a, b); // ???
	}

	@Test
	public void test08() {
		String a = "qwert";
		String b = a;

		assertSame(a, b);
	}

	@Test
	public void test09() {
		String[] a = {"a", "b", "c"};
		String[] b = {"a", "b", "c"};

		assertArrayEquals(a, b);
	}
	
	@Test
	public void test10() {
		String[] a = {"a", "b"};
		String[] b = {"a", "b", "c"};

		assertFalse(Arrays.equals(a, b));
	}

}
