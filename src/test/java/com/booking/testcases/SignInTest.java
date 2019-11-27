package com.booking.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.booking.pagelibrary.SignIn;
import com.booking.tesbase.TestBase;

public class SignInTest extends TestBase {
	
	 SignIn login;
 
	
public SignInTest() {
	super();
	
}
@BeforeMethod 
public   void setup() {
	intilization();
	login = new SignIn();
	
}

@Test 

public void login() throws InterruptedException {	
	
	login.shouldThrowAnErrorIfSignInDetailsAreMissing();
}
}

