package com.sk.testngpractice;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HomeLoanTest2 {
	
	@BeforeSuite
	public void beforeLoansSuite() {
		System.out.println("beforeLoansSuite");
	}	
	
	@Test
	public void hl2Test1() {
		System.out.println("hl2Test1");
	}
	
	@Test(groups = {"smoke"})
	public void hl2Test2() {
		System.out.println("hl2Test2");
	}
	
	@Test
	public void hl2Test3() {
		System.out.println("hl2Test3");
	}
}
