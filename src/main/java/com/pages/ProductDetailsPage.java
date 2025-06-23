package com.pages;

//import java.time.Duration;

import java.util.List;

import org.apache.log4j.Logger;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDetailsPage {

	static Logger logger = Logger.getLogger(ProductDetailsPage.class);
	WebDriver driver;
	
	public ProductDetailsPage(WebDriver driver) {
		this.driver = driver;
		//initialize find by webelements
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(className = "inventory_list")
	List<WebElement> products;
	
	@FindBy(xpath="//button[text()='Remove']")
	WebElement Remove;
	
	@FindBy(xpath="//button[text()='Add to cart']")
	WebElement AddToCart;
	
	@FindBy(xpath="(//div[@class='pricebar']/div//following-sibling::button)[2]")
	WebElement secondProductTitle;
	
	@FindBy(xpath="//div[@class='inventory_item_name ' and text()='Sauce Labs Fleece Jacket']//parent::div//parent::a//parent::div//following-sibling::div[@class='pricebar']/div")
	WebElement SauceLabsBoltTShirt_Price;
	
	@FindBy(id="back-to-products")
	WebElement BackToProducts;
	
	@FindBy(className="shopping_cart_badge")
	WebElement cartCount;
	
	public void RemoveOrAddProduct() throws InterruptedException {
		Thread.sleep(500);
		AddToCart.click();
	}
	public void addSecondProduct() throws InterruptedException {
		
		secondProductTitle.click();
		Thread.sleep(20);
		AddToCart.click();
		logger.info("cartcount :" +cartCount.getText());
		//BackToProducts.click();
		
	}
	public void printPrice() {
		logger.info("product price:" +SauceLabsBoltTShirt_Price);
	}
}
