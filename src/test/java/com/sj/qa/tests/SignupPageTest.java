package com.sj.qa.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sj.qa.base.TestBase;
import com.sj.qa.pages.LaunchPage;
import com.sj.qa.pages.SignupPage;

public class SignupPageTest extends TestBase{
	LaunchPage launchPage;
	SignupPage signupPage;
	
	public SignupPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		launchPage = new LaunchPage();
		signupPage = launchPage.validateSignupPageLink();
		
	}
	
	@Test
	public void validateRegistrationLogo() {
		WebElement regLogo = signupPage.validateRegistrationLogo();
		System.out.println(regLogo.getText());
		Assert.assertTrue(regLogo.isDisplayed());
		Assert.assertEquals(regLogo.getText(), "SPICECLUB MEMBER REGISTRATION");
	}
	
	@Test
	public void validateMemberRegTest() {
		signupPage.validateMemberRegistration();
	}
	
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}

}
