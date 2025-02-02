package com.unit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalculator {
	
	Calculator c=new Calculator();
	
	@Before
	public void show1() {
		System.out.println("hi");
	}
	@Test
	public void testadd() {
		System.out.println(c.add(8, 3));
	}
	
	@Test
	public void testdiv() {
		c.div();
	}
	
	@Test
	public void max() {
		assertEquals(54,c.findmax());
	}
		
	@After
	public void show2() {
		System.out.println("thank you");
	}

}
