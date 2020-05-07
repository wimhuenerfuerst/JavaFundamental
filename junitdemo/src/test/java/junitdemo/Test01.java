package junitdemo;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class Test01 {

	@Test
	public void test01() {
		//fail("Not yet implemented");
	}
	
	@Test
	public void test02() {
	}
	
	@Test
	@Ignore
	public void test03() {
		fail("Not yet implemented");
	}

}
