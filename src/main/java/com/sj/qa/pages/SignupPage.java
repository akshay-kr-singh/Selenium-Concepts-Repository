package com.sj.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sj.qa.base.TestBase;

public class SignupPage extends TestBase{
	//PageFactory -- OR -- Object Repository
	@FindBy(xpath = "//p[contains(text(),'SpiceClub Member Registration')]")
	WebElement RegistrationLogo;
	
	@FindBy(xpath = "//select[contains(@id,'DropDownListTitle')]")
	WebElement Title;
	
	@FindBy(xpath = "//input[contains(@id,'TextBoxFirstName')]")
	WebElement FirstName;
	
	@FindBy(xpath = "//input[contains(@id,'TextBoxLastName')]")
	WebElement LastName;
	
	@FindBy(xpath = "//input[contains(@id,'TEXTBOXINTLMOBILENUMBER')]")
	WebElement MobileNo;
	
	@FindBy(xpath = "//input[contains(@id,'PasswordFieldAgentPassword')]")
	WebElement Password;
	
	@FindBy(xpath = "//input[contains(@id,'PasswordFieldPasswordConfirm')]")
	WebElement ConfirmPassword;
	
	@FindBy(xpath = "//input[contains(@id,'TEXTBOXINPUTDOB')]")
	static
	WebElement DOB;
		
	@FindBy(xpath = "//input[contains(@id,'TextBoxEmail')]")
	WebElement Email;
	
	@FindBy(xpath = "//input[@type='checkbox' and @id='chkSpiceClubTnC']")
	WebElement AcceptTerms;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement SubmitBtn;
	
	
	//OR initialization
	public SignupPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	//Define Functionalities/Methods	
	public WebElement validateRegistrationLogo() {
		return RegistrationLogo;
	}
	
	public void validateMemberRegistration() {
		Select title = new Select(Title);
		title.selectByVisibleText("MR");
		
		FirstName.sendKeys("akshay");
		LastName.sendKeys("singh");
		MobileNo.sendKeys("8954209423");
		Password.sendKeys("test@123");
		ConfirmPassword.sendKeys("test@123");
		selectDOB();
		Email.sendKeys("spicejet@sj.com");
		AcceptTerms.click();
		SubmitBtn.click();
		
	}
	
	private static void selectDOB() {
		DOB.click();
		List<WebElement> years = driver.findElements(By.xpath("//tbody[@class='datepickerYears']/tr/td/a/span"));
		for(int i=0;i<years.size();i++) {
			if(years.get(i).getText().equalsIgnoreCase("2002")) {
				years.get(i).click();
				break;
			}
		}
		
		List<WebElement> months = driver.findElements(By.xpath("//tbody[@class='datepickerMonths']/tr/td/a/span"));
		for(int i=0;i<months.size();i++) {
			if(months.get(i).getText().equalsIgnoreCase("Feb")) {
				months.get(i).click();
				break;
			}
		}
		
		List<WebElement> days = driver.findElements(By.xpath("//tbody[@class='datepickerDays']/tr/td/a/span"));
		for(int i=0;i<days.size();i++) {
			if(days.get(i).getText().equalsIgnoreCase("11")) {
				days.get(i).click();
				break;
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
