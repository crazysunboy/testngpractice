package com.sk.testngpractice;

import java.io.FileReader;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;

public class DataProviderTest {
	@Test(dataProvider = "dataArray")
	public void printDataArray(String one, String two, String three) throws Exception {
		System.out.print(one+" "+two+" "+three+"\n");
	}
	
	@Test(dataProvider = "dataList")
	public void printDataList(String one, String two, String three) throws Exception {
		System.out.print(one+" "+two+" "+three+"\n");
	}
	
	@DataProvider
	public String[][] dataArray() throws Exception {
		String[][] data=new String[3][3];
		data[0][0]="1";
		data[0][1]="First";
		data[0][2]="One";
		data[1][0]="2";
		data[1][1]="Second";
		data[1][2]="Two";
		data[2][0]="3";
		data[2][1]="Third";
		data[2][2]="Three";
		return data;
	}
	
	@DataProvider
	public Iterator<String[]> dataList() throws Exception {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/data.csv"));
	    List<String[]> data = reader.readAll();
	    return data.iterator();
	}
}
