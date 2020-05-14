package com.crm.qa.tests;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;

public class DemoTest extends TestBase{
	
	@BeforeMethod
	public void setUp() {
		initialization();
	}
	
	@Test
	public void testDemo() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Log In']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(5000);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
