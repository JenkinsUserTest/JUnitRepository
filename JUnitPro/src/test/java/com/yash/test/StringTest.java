package com.yash.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringTest {
	
	private String str;
	@Before
	public void initialize() {
		str="sabbir";
	}

	@After
	public void destroy() {
		str=null;
	}
	
	@Test
	public void testStrLength() {
        int result=str.length();
        assertTrue("expected was greater than 0",result>0);
	}

}
