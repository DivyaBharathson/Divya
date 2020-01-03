package com.selenium.pom;

public class AutomationSiteTask3Script extends SeleniumBaseClass{
	public static void main(String[] args) throws Throwable {
		
		browserLaunch("chrome");
		getUrl("http://automationpractice.com/index.php");
		
		AutomationSiteHomePagePOM home=new AutomationSiteHomePagePOM();
		AutomationSiteContactUsPagePOM contact=new AutomationSiteContactUsPagePOM();
		
		clickOnTheElement(home.getContactUs());
//		ScrollToElement(contact.getSendButton());
		waitForElementVisiblity(contact.getChooseHeading());
		
		
		selectFromDropDown(contact.getChooseHeading(), "2");
		validationOfText(contact.getChooseHeading().getText(), "customer service");
		inputValuesInElement(contact.getEmail(), "divya.madvem@gmail.com");
		validationOfText(contact.getEmail().getText(), "divya.madvem@gmail.com");
//		selectFromDropDown(contact.getOrderReference(), "151246");
		
		inputValuesInElement(contact.getOrderReference(), "qwery");
//		validationOfText(contact.getOrderReference().getText(), "qwery");
//		waitForElementVisiblity(contact.getProdReference());
//		selectFromDropDown(contact.getProdReference(), "2");
		inputValuesInElement(contact.getMessage(), "Test");
		validationOfText(contact.getMessage().getText(),"test");
		clickOnTheElement(contact.getSendButton());
		driver.quit();
	}

}
