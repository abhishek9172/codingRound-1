package com.booking.tesbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.booking.testutils.TestUtils;

public class TestBase {
	
	
	public static WebDriver driver;
	
	public static Properties prop;

	public  TestBase() {
		
		try {
			prop = new Properties();
			FileInputStream  stream;
			  stream = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\booking\\config\\config.properties");
			prop.load(stream);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
 			e.printStackTrace();
		}
		
	}
	
	
	
	public  static void intilization() {
		//driver = new ChromeDriver();
		
		String browserName =prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.getProperty("Webdriver.chrome.driver","C:\\Users\\a.g.saxena\\Desktop\\Abhishek\\codingRound-1\\chromedriver");
			driver = new ChromeDriver();
		
		}
		else if(browserName.equals("Mac")){
			
			 System.setProperty("Webdriver.chrome.driver", "C:\\Users\\a.g.saxena\\Desktop\\Abhishek\\codingRound-1\\chromedriver");
			 driver = new ChromeDriver();
			
			
		}
		else if (browserName.equals("Linux"))  {
			System.setProperty("Webdriver.chrome.driver", "C:\\Users\\a.g.saxena\\Desktop\\Abhishek\\codingRound-1\\chromedriver_linux");
			driver =new ChromeDriver();
			
			
			   
		}
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(TestUtils.Page_Load_Timeout,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils.Implicit_Wait, TimeUnit.SECONDS);
		
		
	}
	public  void waitFor(int durationInMilliSeconds) {
        try {
            Thread.sleep(durationInMilliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
	
	


    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }




}



