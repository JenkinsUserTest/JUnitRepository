package com.yash.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArthimeticTest {
	
	private int no1;
	private int no2;
	@Before
	public void setUp() {
		no1=5;
		no2=3;
	}

	@Test
	public void testAdd1() {
     int result=no1+no2;
     assertTrue(result==8);
	}

	@Test
	public void testAdd2() {
     int result=no1+no2;
     assertTrue(result>no1);
	}
}
