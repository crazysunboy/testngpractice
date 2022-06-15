package com.sk.testngpractice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class PersonalLoanTest1 {
	
	@Test(groups = {"smoke"})
	public void pl1Test1() {
		System.out.println("pl1Test1");
	}
	
	@Test(enabled = false)
	public void pl1Test2() {
		System.out.println("pl1Test2");
	}
	
	@Test
	public void pl1Test3() {
		System.out.println("pl1Test3");
	}
	
	@AfterTest
	public void afterPLTests() {
		System.out.println("afterPLTests");
	}	
}
