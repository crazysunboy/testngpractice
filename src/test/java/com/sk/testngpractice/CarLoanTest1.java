package com.sk.testngpractice;

import org.testng.annotations.Test;

public class CarLoanTest1 {
	
	@Test
	public void cl1Test1() {
		System.out.println("cl1Test1");
	}
	
	@Test
	public void cl1Test2() {
		System.out.println("cl1Test2");
	}
	
	@Test(groups = {"smoke"})
	public void cl1Test3() {
		System.out.println("cl1Test3");
	}
}
