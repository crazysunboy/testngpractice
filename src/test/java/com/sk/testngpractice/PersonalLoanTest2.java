package com.sk.testngpractice;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PersonalLoanTest2 {
	
	@Test(parameters = {"param1","plparam1"})
	public void pl2Test1(String suiteParam, String plParam) {
		System.out.println("pl2Test1");
		System.out.println("Suite Param: " + suiteParam + " Personal Loan Param: " + plParam);
	}
	
	@Parameters("param1")
	@Test
	public void pl2Test2(String suiteParam) {
		System.out.println("pl2Test2");
		System.out.println("Suite Param: " + suiteParam);
	}
	
	@Parameters(value={"param1","plparam1"})
	@Test
	public void pl2Test3(String suiteParam, String plParam) {
		System.out.println("pl2Test3");
		System.out.println("Suite Param: " + suiteParam + " Personal Loan Param: " + plParam);
	}
	
	@BeforeTest
	public void beforePLTests() {
		System.out.println("beforePLTests");
	}
}
