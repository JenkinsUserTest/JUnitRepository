package com.yash.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class JUnit5ParameterizedTest {

	@ParameterizedTest
	@ValueSource(strings = {"sabbir","sachin","sumeet"})
	void test(String str) {
    assertTrue(str.startsWith("s"));
	}
	@RepeatedTest(value = 5)
	void repeatedTest() {
		assertEquals("HelloWorld","HelloWorld");
	}

}
