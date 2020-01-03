package com.selenium.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationSiteProductListPagePOM extends SeleniumBaseClass{
	
	@FindBy (xpath="(//a[@title='Add to cart'])[1]")
	private WebElement addToCart;
	
	@FindBy (xpath="//span[contains(text(),'There is 1 item in your cart.')]")
	private WebElement textToValidateIfAddedToCart;
	
	@FindBy (xpath="(//a[@title='Proceed to checkout'])[1]")
	private WebElement proceedToCheckOut;
	
	@FindBy (xpath="//input[@class='cart_quantity_input form-control grey']")
	private WebElement productsInCart;
	
	public WebElement getAddToCart() {
		return addToCart;
	}

	public void setAddToCart(WebElement addToCart) {
		this.addToCart = addToCart;
	}

	public WebElement getTextToValidateIfAddedToCart() {
		return textToValidateIfAddedToCart;
	}

	public void setTextToValidateIfAddedToCart(WebElement textToValidateIfAddedToCart) {
		this.textToValidateIfAddedToCart = textToValidateIfAddedToCart;
	}

	public WebElement getProceedToCheckOut() {
		return proceedToCheckOut;
	}

	public void setProceedToCheckOut(WebElement proceedToCheckOut) {
		this.proceedToCheckOut = proceedToCheckOut;
	}

	public WebElement getProductsInCart() {
		return productsInCart;
	}

	public void setProductsInCart(WebElement productsInCart) {
		this.productsInCart = productsInCart;
	}

	public AutomationSiteProductListPagePOM() {
		PageFactory.initElements(driver, this);
	}
	
	
	
}
