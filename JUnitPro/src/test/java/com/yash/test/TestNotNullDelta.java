package com.yash.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestNotNullDelta {

	String str1;
	String str2;
	@Before
	public void setUp() throws Exception {
		str1="sabbir";
		str2=null;
	}

	

	@Test
	public void test() {
    assertNotNull(str1);
    assertNull(str2);
	}

}
