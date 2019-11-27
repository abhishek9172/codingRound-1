package com.ace.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ace.qa.base.TestBase;
import com.ace.qa.pages.Logintest;
import com.ace.qa.pages.Properties;

public class listTest extends TestBase{

	Logintest Login;
	Properties test;
	String login;
	//public static void main(String ars[]) {
	public listTest() {
		super();
	}
	
	@BeforeMethod()
	public void setup() {
		initialization();
		Login =new Logintest();
	    test =Login.login(prop.getProperty("search"));
	}
	
	@Test
	public void logintitletest()
	   
	{
		String title =Login.gettitle();
		Assert.assertEquals(title,"Property for Sale in London - Buy Properties in London - Zoopla");
	}
	
	@Test
	
	public void Test() {
		
		test.price();
	}
	
	
@AfterMethod()
public void teardown() {
	driver.quit();
}
	
}

