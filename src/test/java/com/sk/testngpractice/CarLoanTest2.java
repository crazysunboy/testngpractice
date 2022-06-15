package com.sk.testngpractice;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CarLoanTest2 {
	
	@Test(dataProvider ="datasets")
	public void cl2Test1(String id, String pwd) {
		System.out.println("cl2Test1");
		System.out.println("ID: " + id + " PWD: " + pwd);
	}
	
	@Parameters({"param1"})
	@Test
	public void cl2Test2(String suiteParam) {
		System.out.println("cl2Test2");
		System.out.println("Suite Param: " + suiteParam);
	}
	
	@Test
	public void cl2Test3() {
		System.out.println("cl2Test3");
	}
	
	@DataProvider(name = "datasets")
	public Object[][] data() {
		Object[][] data=new Object[3][2];
		data[0][0]="ID1";
		data[0][1]="PWD1";
		data[1][0]="ID2";
		data[1][1]="PWD2";
		data[2][0]="ID3";
		data[2][1]="PWD3";
		return data;
	}
	
	@AfterSuite
	public void afterLoansSuite() {
		System.out.println("afterLoansSuite");
	}
}
