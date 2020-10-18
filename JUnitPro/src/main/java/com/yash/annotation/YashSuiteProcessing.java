package com.yash.annotation;

import java.lang.reflect.Method;

public class YashSuiteProcessing {

	public static void main(String[] args) {

		Class classData=YashSuiteClass.class;
		YashSuite yashSuite=(YashSuite)classData.getAnnotation(YashSuite.class);
		if(yashSuite==null) {
			System.out.println("YashSuite not applied");
		}else {
			System.out.println("YashSuite  applied");

		}
		try {
			Method method=classData.getDeclaredMethod("testMethod", int.class);
			YashTest yashTest=(YashTest)method.getAnnotation(YashTest.class);
			if(yashTest==null) {
				System.out.println("@YashTest not applied");
			}else {
				System.out.println("Time value specified:"+yashTest.time());
			}
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
