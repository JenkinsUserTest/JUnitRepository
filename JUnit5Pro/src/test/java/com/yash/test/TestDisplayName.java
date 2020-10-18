package com.yash.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestDisplayName {

	@DisplayName("Check if length of string is greater than 6")
	@Test
	void test() {
	assertTrue("HelloWorld".length()>6);
	}
	

}
