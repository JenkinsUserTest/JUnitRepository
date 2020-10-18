package com.yash.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitAnnotations {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After class");

	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before test condition");

	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After test condition");

	}

	@Test
	public void test1() {
		System.out.println("test 1 condition");
		assertTrue(true);
	}
	@Ignore
	@Test
	public void test2() {
		System.out.println("test 2 condition");
		assertTrue(true);
	}

}
