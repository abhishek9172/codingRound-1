package com.booking.pagelibrary;
import com.booking.tesbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignIn extends TestBase {

    @FindBy(id ="userAccountLink")
    WebElement trips;
    
    @FindBy(id="SignIn")
    
    WebElement signIn;
    
    @FindBy(id="signInButton")
    
    WebElement loginButton;
    @FindBy(id="errors1")
    WebElement errors;

    public SignIn() {
    	PageFactory.initElements(driver, this);
    }
   
    public void shouldThrowAnErrorIfSignInDetailsAreMissing() throws InterruptedException {

        
       
        waitFor(2000);

        trips.click();
        signIn.click();
        waitFor(2000);
        driver.switchTo().frame("modal_window");//Added a method for switching to frame.
        
        loginButton.click();

        String actualString=   errors.getText();
        Assert.assertTrue(actualString.contains("There were errors in your submission"));
        driver.quit();
    }

    


}
