package com.selenium.pom;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationSiteContactUsPagePOM extends SeleniumBaseClass{

	@FindBy (id="id_contact")
	private WebElement chooseHeading;
	
	@FindBy (id="email")
	private WebElement email;
	
	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	@FindBy (xpath="//select[@name='id_order']")
	private WebElement orderReference;
	
	@FindBy (id="message")
	private WebElement message;
	
	@FindBy (id="submitMessage")
	private WebElement sendButton;
	
	@FindBy (xpath="//select[@name='id_product']")
	private WebElement prodReference;
	
	public WebElement getChooseHeading() {
		return chooseHeading;
	}

	public void setChooseHeading(WebElement chooseHeading) {
		this.chooseHeading = chooseHeading;
	}

	public WebElement getOrderReference() {
		return orderReference;
	}

	public void setOrderReference(WebElement orderReference) {
		this.orderReference = orderReference;
	}

	public WebElement getMessage() {
		return message;
	}

	public void setMessage(WebElement message) {
		this.message = message;
	}

	public WebElement getSendButton() {
		return sendButton;
	}

	public void setSendButton(WebElement sendButton) {
		this.sendButton = sendButton;
	}

	public WebElement getProdReference() {
		return prodReference;
	}

	public void setProdReference(WebElement prodReference) {
		this.prodReference = prodReference;
	}

	public AutomationSiteContactUsPagePOM() {
		PageFactory.initElements(driver, this);
		
	}
}
