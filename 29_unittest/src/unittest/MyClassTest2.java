package unittest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyClassTest2 {

	MyClass myClass;
	
	@BeforeClass
	public static void setupClass() {
		System.out.println("setupClass");
	}
	
	@AfterClass
	public static void cleanupClass() {
		System.out.println("cleanupClass");
	}

	@Before
	public void setup() {
		System.out.println("setup");
		myClass = new MyClass();
	}
	
	@After
	public void cleanup() {
		System.out.println("cleanup");
	}

	@Test
	public void test1() {
		System.out.println("test1");
		int result = myClass.addNumbers(1, 2);
		assertEquals(3, result);
		
		//assertTrue(condition);
		//assertFalse(condition);
		//assertNotNull(object);
		//assertNull(object);
		//assertArrayEquals(expecteds, actuals);
		//assertEquals(expected, actual);
		//assertSame(expected, actual);
		//assertNotSame(unexpected, actual);
	}
	
	@Test
	public void test3() {
		MyClass result = myClass.build(10, 12);				
		
		assertEquals(10, result.x);
		assertEquals(12, result.y);
		
		MyClass expected = new MyClass(10, 12);
		
		assertEquals(expected, result);
		
		assertTrue(result.x == 10 && result.y == 12);
	}

	@Test
	public void test2() {
		System.out.println("test2");
		int result = myClass.addNumbers(-1, 2);
		assertEquals(1, result);
	}
}
