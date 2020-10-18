package com.yash.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yash.service.ComputeService;

public class TestComputeService {
	
	private ComputeService computeService;
	@Before
	public void setUp() throws Exception {
		computeService=new ComputeService();
	}

	@After
	public void tearDown() throws Exception {
		computeService=null;
	}

	@Test(timeout=1200)
	public void testCompute() {
    computeService.compute(10,20);
    assertTrue(true);
	}
	@Test
	public void testDivPositive(){
		int actual=computeService.div(10,5);
		int expected=2;
		assertEquals(expected,actual);
	}
	@Test(expected= ArithmeticException.class)
	public void testException(){
		computeService.div(10,0);
	}

}
