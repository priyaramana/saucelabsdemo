package com.stepdefs;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import com.driverfactory.DriverFactory;
import com.pages.HomePage;
import com.pages.LoginPage;
import io.cucumber.java.en.*;

public class HomePageStepDefs {

	WebDriver driver;
	LoginPage loginpage;
	HomePage homepage;
	static Logger logger = Logger.getLogger(HomePageStepDefs.class);
	
	@Given("User is initially on login page")
	public void user_is_initially_on_login_page() {
	    driver = DriverFactory.getDriver();
	    loginpage = new LoginPage(driver);
	}

	@When("User enters valid username {string} and valid password {string}")
	public void user_enters_valid_username_standard_user_and_valid_password(String standard_user,String secret_sauce) {
	    loginpage.ValidLogin(standard_user, secret_sauce);
	}

	@Then("User should redirect to home page")
	public void user_should_redirect_to_home_page() {
	    logger.info("user should redirect to home page");
	    driver = DriverFactory.getDriver();
	    homepage = new HomePage(driver);
	}

	@When("user verifies the page title")
	public void user_verifies_the_page_title() {
	    homepage.logoTest();
	}

	@Then("page title should be displayed")
	public void page_title_should_be_displayed() {
	    logger.info("page title should be displayed");
	}
}
