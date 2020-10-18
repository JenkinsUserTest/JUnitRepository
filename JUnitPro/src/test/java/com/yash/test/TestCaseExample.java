package com.yash.test;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class TestCaseExample extends TestCase{
	
	private int no1;
	private int no2;
	int totalTestCases;
	@Before
	protected void setUp() {
		no1=5;
		no2=10;
	}
	@Test
	public void testSum() {
		totalTestCases=this.countTestCases();
		
		String testCaseName=this.getName();
		System.out.println("Test case name:"+testCaseName);
		
		this.setName("testNewSum");
		testCaseName=this.getName();
		System.out.println("New Test case name:"+testCaseName);
		int actual=no1+no2;
		int expected=15;
		assertEquals("expected did not match with actual",expected,actual);
	}
	
	@Test
	public void testSumPositive() {
		totalTestCases=this.countTestCases();

		System.out.println("Total Test cases:"+totalTestCases);

		assertTrue(true);
	}

}
