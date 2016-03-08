package com.lab1.calculator;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator calculator;
	
	@Before
	public void setUp(){
		calculator = new Calculator();
	}
	
	@Test
	public void addTest(){
		assertEquals(4, calculator.add(2,2));
	}
	
	@Test
	public void subtractTest(){
		assertEquals(2, calculator.subtract(4,2));
	}
	
	@Test
	public void multiplyTest(){
		assertEquals(6, calculator.multiply(3,2));
	}
	
	@Test
	public void divideTest(){
		assertEquals(2, calculator.divide(6,3));
	}
	
	@Test
	public void isEqualTest(){
		assertTrue(calculator.isEqual(2, 2));
	}
	
	@Test
	public void isEqualTest2(){
		assertFalse(calculator.isEqual(2, 3));
	}
	
	
	//@Test
	//public void test() {
	//	fail("Not yet implemented");
	//}

}
