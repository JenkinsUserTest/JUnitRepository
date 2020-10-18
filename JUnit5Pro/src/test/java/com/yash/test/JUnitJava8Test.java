package com.yash.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class JUnitJava8Test {

	@Test
	void testLambda1() {

		List<Integer> integerList=new ArrayList<>();
		integerList.add(1);
		integerList.add(20);
		integerList.add(30);
		integerList.add(40);
		integerList.add(50);
		
		assertTrue(integerList.stream().filter((n)->n>5).count()>=2);
		
	}
	@Test
	void testLambda2() {

		List<Integer> integerList=new ArrayList<>();
		integerList.add(1);
		integerList.add(20);
		integerList.add(30);
		integerList.add(40);
		integerList.add(50);
		
		assertTrue(integerList.stream().filter((n)->n>5).filter((n)->n%2==0).count()>=2);
	}
	@Test
	void testLambda3() {
		int[] numbers= {0,1,2,3,4};
		assertAll("numbers",
		()->assertEquals(numbers[0],0),
		()->assertEquals(numbers[3],3),	
		()->assertEquals(numbers[4],4)
		);
	}
	@Test
	void testAssumption() {
		assumeTrue(1==5);
		assertEquals("HelloWorld","Hello");
		
	}
	@Test
	void checkIfExceptionThrown() {
		Throwable exception=assertThrows(ArithmeticException.class,()->{
			throw new ArithmeticException("Invalid data");
		});
		
		assertEquals(exception.getMessage(),"Invalid data");
	}

	@Test
	void methodReferenceTest(){
		assumeTrue("sabbir".equals("amit"),JUnitJava8Test::message);
	}

	
	public static String message() {
		return "Test execution has failed";
	}
	
   @Test
	void supplierEx() {
		Supplier<String> supplyMessage=()->{
			return "Test Condition Failed";
		};
		
		assertEquals("HelloWorld","HelloWorld1",supplyMessage);
	}
}
