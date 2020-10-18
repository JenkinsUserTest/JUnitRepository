package com.yash.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
//import org.junit.jupiter.api.Test;

import com.yash.service.Calculator;
class JUnit5TestCase {

	private Calculator calculator;
	@BeforeAll
	static void setup(){
		System.out.println("--Before All--");
	}
	@AfterAll
	static void tear(){
		System.out.println("--After All--");
	}
	@BeforeEach
	void setUpCondition(){
		System.out.println("--Before Each test condition--");
		calculator=new Calculator();
	}
	
	@AfterEach
	void tearCondition(){
		System.out.println("--After Each test condition--");
		calculator=null;
	}
	
	@Test
	@Tag("DEV")
	void testAddDev() {
	System.out.println("--dev test condition--");
	//Mockito.mock(Calculator.class);
	int actual=calculator.add(10,5);
    assertEquals(15,actual);
	}
	
	@Tag("PROD")
	@Test
	void testAddProd() {
	System.out.println("--prod test condition--");
	//Mockito.spy(Calculator.class);
	int actual=calculator.add(10,5);
    assertEquals(15,actual);
	}
	
	@Test
	@Disabled
	void testDisabled() {
  //fail("not implemented");

	}

}
