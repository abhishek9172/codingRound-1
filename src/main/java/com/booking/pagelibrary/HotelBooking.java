package com.booking.pagelibrary;
import com.booking.tesbase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HotelBooking extends TestBase {

  
    @FindBy(linkText = "Hotels")
     WebElement hotelLink;

    @FindBy(id = "Tags")
     WebElement localityTextBox;

    @FindBy(id = "SearchHotelsButton")
     WebElement searchButton;

    @FindBy(id = "travellersOnhome")
     WebElement travellerSelection;

    
    public HotelBooking() {
    	
    	PageFactory.initElements(driver, this);
    }
    
    public  void shouldBeAbleToSearchForHotels() {
        
        hotelLink.click();

        localityTextBox.sendKeys("Indiranagar, Bangalore");

        new Select(travellerSelection).selectByVisibleText("1 room, 2 adults");
        searchButton.click();

        driver.quit();

    }

   
    }


