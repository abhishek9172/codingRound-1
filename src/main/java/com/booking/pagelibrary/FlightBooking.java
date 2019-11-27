package com.booking.pagelibrary;
import com.booking.tesbase.TestBase;
import com.sun.javafx.PlatformUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class FlightBooking extends TestBase {

	
	@FindBy(id ="OneWay")
	WebElement journeytype;
	
	@FindBy(id="FromTag")
	WebElement origin;
	
	@FindBy(id = "ui-id-1")

	WebElement options;

	



@FindBy(xpath="//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[3]")
  WebElement calendardate;

@FindBy(id ="SearchBtn")
WebElement Search;



public FlightBooking() {
	PageFactory.initElements(driver, this);
}

   
    public void testThatResultsAppearForAOneWayJourney() throws InterruptedException {
    	
     
       
        waitFor(2000);
        journeytype.click();

        origin.clear();
        waitFor(2000);
        origin.sendKeys("Bangalore");

        //wait for the auto complete options to appear for the origin   
        //Thread.sleep(10000);
       waitFor(2000);
        //options.click();
       
       
        
        List<WebElement> originOptions = driver.findElement(By.id("ui-id-1")).findElements(By.tagName("li"));
        originOptions.get(0).click();

        driver.findElement(By.id("ToTag")).clear();
        driver.findElement(By.id("ToTag")).sendKeys("Delhi");

        //wait for the auto complete options to appear for the destination

        waitFor(2000);
        //select the first item from the destination auto complete list
        List<WebElement> destinationOptions = driver.findElement(By.id("ui-id-2")).findElements(By.tagName("li"));
        destinationOptions.get(0).click();

        
        

        //wait for the auto complete options to appear for the destination

        waitFor(2000);
       
       

        
        calendardate.click();

        //all fields filled in. Now click on search
        Search.click();
        //String text = .getText();

        //waitFor(5000);
        //verify that result appears for the provided journey search
        Assert.assertTrue(isElementPresent(By.className("searchSummary")));

        //close the browser
        driver.quit();

    }


    
}
