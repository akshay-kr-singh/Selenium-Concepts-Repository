package com.sj.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sj.qa.base.TestBase;
import com.sj.qa.pages.LaunchPage;
import com.sj.qa.pages.SignupPage;

public class LaunchPageTest extends TestBase{
	LaunchPage launchPage;
	SignupPage signupPage;
	
	public LaunchPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {		
		initialization();
		launchPage = new LaunchPage();
	}
	
	@Test
	public void validateSignupPageLinkTest() {
		signupPage = launchPage.validateSignupPageLink();
		System.out.println(driver.getCurrentUrl());
	}
	
	@AfterMethod
	public void tearDown(){
		//driver.quit();
	}

}
