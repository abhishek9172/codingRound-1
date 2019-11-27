package com.booking.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.booking.pagelibrary.HotelBooking;
import com.booking.pagelibrary.SignIn;
import com.booking.tesbase.TestBase;

public class HotelBookingTest extends TestBase {

	SignIn login;
	
	public HotelBookingTest() {
		
		super();
	}
	@BeforeMethod
		public void setup() {
		intilization();
		login = new SignIn();
			
		}
		
	@Test 
		
		public void  hotelSearch() {
		HotelBooking booking = new HotelBooking();
		booking.shouldBeAbleToSearchForHotels();
			
		}
	
	@AfterMethod
	
	public void teardown() {
		driver.quit();
	}
	
		
	}


