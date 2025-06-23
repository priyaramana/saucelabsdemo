package com.pages;

import java.time.Duration;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage {

	WebDriver driver;
	
	// constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		//initialize webelements
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user-name")
	WebElement Username;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(id="login-button")
	WebElement Loginbtn;
	
	@FindBy(xpath="//h3[text()='Epic sadface: Username is required']")
	WebElement Usererrormsg;
	
	@FindBy(xpath="//h3[text()='Epic sadface: Password is required']")
	WebElement Passerrormsg;
	
	public void ValidLogin(String user,String pass) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOf(Username));
		Username.sendKeys(user);
		Password.sendKeys(pass);
		Loginbtn.click();
		
	}
	
	public void LoginWithoutPass(String user) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOf(Username));
		Username.sendKeys(user);
		Loginbtn.click();
	    Assert.assertTrue(Passerrormsg.isDisplayed());
	}
	
	public void LoginWithoutUser(String pass) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOf(Username));
		Password.sendKeys(pass);
		Loginbtn.click();
		Assert.assertTrue(Usererrormsg.isDisplayed());
		
	}
}
