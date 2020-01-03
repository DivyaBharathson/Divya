package com.maven.MavenPractise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonProductPagePOM extends SeleniumBaseClass{
		
	public WebElement getAddToCart() {
		return addToCart;
	}

	public void setAddToCart(WebElement addToCart) {
		this.addToCart = addToCart;
	}

	public WebElement getPriceOfMobile() {
		return priceOfMobile;
	}

	public void setPriceOfMobile(WebElement priceOfMobile) {
		this.priceOfMobile = priceOfMobile;
	}

	@FindBy (id="add-to-cart-button")
			private WebElement addToCart;
	
	@FindBy (xpath="(//span[@class='currencyINR']//parent::span)[1]")
			private WebElement priceOfMobile;
	
	public AmazonProductPagePOM() {
		PageFactory.initElements(driver, this);
	}
	
}
