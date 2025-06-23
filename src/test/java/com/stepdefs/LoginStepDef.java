package com.stepdefs;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.driverfactory.DriverFactory;
import com.pages.LoginPage;

//import Project3.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {

	static Logger logger = Logger.getLogger(LoginStepDef.class);
	LoginPage loginpage;
	WebDriver driver;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		logger.info("login page should open");
		driver = DriverFactory.getDriver();
	    loginpage = new LoginPage(driver);
	}

	@When("User enters username {string} and password {string}")
	public void user_enters_username_and_password(String user, String pass) {
	    loginpage.ValidLogin(user, pass);
	}

	@When("clicks on Login button")
	public void clicks_on_login_button() {
	    logger.info("login button should be clicked");
	}

	@Then("User should navigate to home page")
	public void user_should_navigate_to_home_page() {
	    logger.info("home page should display");
	}

	@When("user enters password {string}")
	public void user_enters_password(String pass) {
	    loginpage.LoginWithoutPass(pass);
	}

	@When("click on login button")
	public void click_on_login_button() {
	    logger.info("login button shoudl be clicked");
	}

	@Then("error message should display")
	public void error_message_should_display() {
	    logger.info("error message should be displayed");
	}

	@When("user enters username {string}")
	public void user_enters_username(String user) {
	    loginpage.LoginWithoutUser(user);
	}
	
	@Then("user error message should display")
	public void user_error_message_should_display() {
		logger.info("user error message should be displayed");
	}

	

}
