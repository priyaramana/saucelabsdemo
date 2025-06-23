package com.pages;

//import java.time.Duration;


//import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage {

	WebDriver driver;
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(className = "app_logo")
	WebElement logo;
	
	public void logoTest() {
		
		String actualText = logo.getText();
		String expectedText = "Swag Labs";
		Assert.assertEquals(actualText, expectedText);
		System.out.println(driver.getTitle());
	}
	
}
