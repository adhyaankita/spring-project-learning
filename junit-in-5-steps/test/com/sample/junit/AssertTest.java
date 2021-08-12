package com.sample.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertTest {

	@Test
	public void test() {
		assertEquals(1, 2);
		boolean condn = true;
		assertEquals(true, condn);
		assertTrue(condn);
		assertFalse(condn);
		// assertNull & asserNotNull; assertNotEquals; assertArrayEquals
	}

}
