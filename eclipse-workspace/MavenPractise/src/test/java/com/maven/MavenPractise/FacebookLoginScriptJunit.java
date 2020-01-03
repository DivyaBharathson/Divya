package com.maven.MavenPractise;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class FacebookLoginScriptJunit extends SeleniumBaseClass {

	FacebookLoginPOM a = new FacebookLoginPOM();

	@BeforeClass
	public static void beforeClass() throws Throwable {
		browserLaunch("chrome");
		getUrl("https://www.facebook.com/");

	}

	@Test
	public void testCase() throws Throwable {
		
		waitForElementVisiblity(a.getEmail());
		inputValuesInElement(a.getEmail(),getExcelData("Sheet1", 1, 0));
		inputValuesInElement(a.getPass(), getExcelData("Sheet1", 1, 1));
		clickOnTheElement(a.getLogIn());
		
	}

	@AfterClass
	public static void afterClass() {
		driver.quit();

	}

}
