package com.booking.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.booking.pagelibrary.FlightBooking;
import com.booking.pagelibrary.SignIn;
import com.booking.tesbase.TestBase;

public class FlightBookingTest extends TestBase {
	 SignIn login;
	FlightBooking fbooking;



public FlightBookingTest() {
	super();
	
}
@BeforeMethod 
public   void setup() {
	intilization();
	login = new SignIn();
	
}

@Test

public void flightbooking() throws InterruptedException {
	fbooking = new FlightBooking();
	fbooking.testThatResultsAppearForAOneWayJourney();
}
}