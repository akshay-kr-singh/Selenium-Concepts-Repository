package com.sj.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sj.qa.base.TestBase;

public class LaunchPage extends TestBase {

	// PageFactory -- OR -- ObjectRepository
	@FindBy(xpath = "//a[@id='Login']")
	WebElement LoginSignupLink;

	@FindBy(xpath = "//a[contains(text(),'SpiceClub Members')]")
	WebElement SpiceClubMembersLink;

	@FindBy(xpath = "//a[contains(text(),'Member Login')]")
	WebElement MemberLoginLink;

	@FindBy(xpath = "//a[contains(text(),'Sign up')]")
	WebElement SignUpLink;

	// OR initialization
	public LaunchPage() {
		PageFactory.initElements(driver, this);
	}

	// Define Functionalities
	public SignupPage validateSignupPageLink() {
		Actions a = new Actions(driver);
		a.moveToElement(LoginSignupLink).build().perform();
		a.moveToElement(SpiceClubMembersLink).build().perform();
		a.moveToElement(SignUpLink).click().build().perform();
		return new SignupPage();
		
	}

}
