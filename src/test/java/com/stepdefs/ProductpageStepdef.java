package com.stepdefs;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.driverfactory.DriverFactory;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.ProductDetailsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductpageStepdef {

	LoginPage loginpage;
	HomePage homepage;
	ProductDetailsPage productpage;
	static Logger logger = Logger.getLogger("ProductpageStepdef");
	WebDriver driver;
	
	@Given("User is on login page for product test")
	public void User_is_on_login_page_for_product_test() {
	    driver = DriverFactory.getDriver();
	    loginpage = new LoginPage(driver);
	}

	@When("User enters product username {string} and product password {string}")
	public void User_enters_product_username_and_product_password(String standard_user,String secret_sauce) {
	    loginpage.ValidLogin(standard_user, secret_sauce);
	}

	@Then("user should land on homepage after login")
	public void user_should_land_on_homepage_after_login() {
	    logger.info("user should redirect to home page");
	    driver = DriverFactory.getDriver();
	    productpage = new ProductDetailsPage(driver);
	}

	@When("user clicks on remove CTA")
	public void user_clicks_on_remove_cta() throws InterruptedException {
	    productpage.RemoveOrAddProduct();
	}

	@Then("product should get removed from cart")
	public void product_should_get_removed_from_cart() {
	    logger.info("product should get removed");
	}

	@When("user clicks on add to cart CTA")
	public void user_clicks_on_add_to_cart_cta() throws InterruptedException {
	    productpage.RemoveOrAddProduct();
	}

	@Then("product should get added to cart")
	public void product_should_get_added_to_cart() {
	    logger.info("product should get added");
	}

	@Given("user is on product page")
	public void user_is_on_product_page() {
	    //logger.info("user should be on product page");
	    logger.info("user should be on product page");
        driver = DriverFactory.getDriver();
        productpage = new ProductDetailsPage(driver); 
	}

	@When("user clicks on addtocart CTA on second product")
	public void user_clicks_on_addtocart_cta_on_second_product() throws InterruptedException {
	    productpage.addSecondProduct();
	}

	@When("user navigates to SauceLabsBoltTShirt_Price")
	public void user_navigates_to_sauce_labs_bolt_t_shirt_price() {
	    productpage.printPrice();
	}

	@Then("price should get displayed")
	public void price_should_get_displayed() {
	 
		logger.info("price should get displayed");
	}

}
