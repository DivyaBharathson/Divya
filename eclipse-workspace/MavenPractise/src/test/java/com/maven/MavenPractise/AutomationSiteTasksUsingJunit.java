package com.maven.MavenPractise;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AutomationSiteTasksUsingJunit extends SeleniumBaseClass {
	
	AutomationPracticeSiteHomePOM a=new AutomationPracticeSiteHomePOM();
	AutomationSiteProductListPOM b=new AutomationSiteProductListPOM();
	AutomationSiteProductPurchasePOM c=new AutomationSiteProductPurchasePOM();
	
	@BeforeClass 
	public static void beforeClass() throws Throwable {
		browserLaunch("chrome");
		getUrl("http://automationpractice.com/index.php");
	}
	
	@Before
	public void before() throws Throwable {
		
		clickOnTheElement(a.getSignIn());
		waitForElementVisiblity(c.getSignIn());
		inputValuesInElement(c.getEmailToSignIn(), "divya.madvem@gmail.com");
		inputValuesInElement(c.getPassToSignIn(), "qwerty");

	}
	
	@Test
	
	public void testCase1() throws Throwable {
		
		inputValuesInElement(a.getSearch(), "Blouses");
		clickOnTheElement(a.getSearchButton());
		waitForElementVisiblity(b.getAddToCart());
		clickOnTheElement(b.getAddToCart());
		waitForElementVisiblity(b.getProceedToCheckOut());
		clickOnTheElement(b.getProceedToCheckOut());
		waitForElementVisiblity(c.getToCheckOut());
		clickOnTheElement(c.getToCheckOut());
		waitForElementVisiblity(c.getToCheckOut());
		clickOnTheElement(c.getToCheckOut());
		waitForElementVisiblity(b.getProceedToCheckOut());
		clickOnTheElement(c.getTocheckAddress());
		clickOnTheElement(b.getProceedToCheckOut());
		waitForElementVisiblity(c.getPayByWire());
		clickOnTheElement(c.getPayByWire());
		clickOnTheElement(c.getToCheckOut());
		
		
	}
	
	
	
	
	
	@After
	
	public void after() {
		clickOnTheElement(c.getSignOut());

	}
	
	@AfterClass
	public static void afterClass() {
		driver.quit();
	}
	
	
	

}
