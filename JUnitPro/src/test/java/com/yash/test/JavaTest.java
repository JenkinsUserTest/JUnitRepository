package com.yash.test;

import junit.framework.TestCase;

public class JavaTest extends TestCase {
	
	protected int no1;
	protected int no2;
	protected void setUp() {
		no1=3;
		no2=5;
	}
	
	public void testAdd_1() {
		int result=no1+no2;
		assertTrue("Condition not met",result==8);
	}

	public void testAdd_2() {
		int result=no1+no2;
		assertTrue("Condition not met",result>no1);
	}
}
