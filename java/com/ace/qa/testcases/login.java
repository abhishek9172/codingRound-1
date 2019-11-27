package com.ace.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ace.qa.base.TestBase;
import com.ace.qa.pages.Logintest;
//import com.ace.qa.pages.login;

public class login extends TestBase{
	Logintest Login;
	String login;
	//public static void main(String ars[]) {
	public login() {
		super();
	}
	
	@BeforeMethod()
	public void setup() {
		initialization();
		Login =new Logintest();
		Login.login(prop.getProperty("search"));
	}
	
	@Test
	public void logintitletest()
	   
	{
		String title =Login.gettitle();
		Assert.assertEquals(title,"Property for Sale in London - Buy Properties in London - Zoopla");
	}
	
@AfterMethod()
public void teardown() {
	driver.quit();
}
	
}