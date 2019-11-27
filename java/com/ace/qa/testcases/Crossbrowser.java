package com.ace.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser {
	
	static WebDriver driver;
	
	
	@BeforeMethod()
	@Parameters("browser")
		public void crossbrowser(String browser) {
		
		if(browser.equalsIgnoreCase("Chrome")) {
			driver =new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			
			driver =new FirefoxDriver();
		}
		
		else {
			System.out.println("driver not found");
		}
			
		}
	@Test
	public void loginpage() {
		//Find user name
		WebElement userName = driver.findElement(By.name("uid"));
		//Fill user name
		userName.sendKeys("guru99");
		//Find password
		WebElement password = driver.findElement(By.name("password"));
		//Fill password
		password.sendKeys("guru99");
		
	}
	
	@AfterMethod()
	public void teardown() {
		driver.close();
	}
	}
	


