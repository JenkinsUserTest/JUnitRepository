package com.yash.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestDelta {
	private int no1;
	private int no2;

	@Before
	public void setUp() throws Exception {
		no1=10;
		no2=5;
	}

	@After
	public void tearDown() throws Exception {
		no1=0;
		no2=0;
	}
	

	@Test
	public void test() {
		int actual=no1+no2;
		int expected=15;
        assertEquals("Didnt meet expecation",expected,actual,2);
	}

}
