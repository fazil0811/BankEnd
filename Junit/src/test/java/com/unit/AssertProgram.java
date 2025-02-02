package com.unit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;

public class AssertProgram {

	@Test
	public void testAssertEquals() {
		assertEquals(5, 5);
	}

	@Test
	public void testAssertNotEquals() {
		assertNotEquals(5, 2);
	}

	@Test
	public void testAssertNull() {
		assertNull(null, null);
	}

	@Test
	public void testAssertNotNull() {
		assertNotNull("fazil", 5);
	}

	@Test
	public void testAssertSame() {
		assertSame("fazil", "fazil");
	}

	@Test
	public void testAssertNotSame() {
		assertNotSame("fazil", "Fazil");
	}

	@Test
	public void testAssertTrue() {
		assertTrue(10 > 3);
	}

	@Test
	public void testAssertFalse() {
		assertFalse(2 > 10);
	}

	@Test
	public void testAssertArrayEquals() {
		int[] a = { 10, 5, 3 };
		int[] b = { 10, 5, 3 };

		assertArrayEquals(a, b);
	}


}
