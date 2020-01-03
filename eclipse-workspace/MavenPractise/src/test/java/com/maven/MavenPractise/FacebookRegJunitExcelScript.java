package com.maven.MavenPractise;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class FacebookRegJunitExcelScript extends SeleniumBaseClass {

	FacebookRegPOM a = new FacebookRegPOM();

	@BeforeClass
	public static void beforeClass() throws Throwable {
		browserLaunch("chrome");
		getUrl("https://www.facebook.com/");

	}

	@Test
	public void test() throws Throwable {
		
		inputValuesInElement(a.getFirstName(), getExcelDataUsingMap("Reg", 0, "FirstName"));
		writeToExcel("Write", 0, 0, a.getFirstName().getAttribute("value"));
		
		inputValuesInElement(a.getLastName(), getExcelDataUsingMap("Reg", 0, "LastName"));
		writeToExcel("Write", 0, 1, a.getLastName().getAttribute("value"));
		
		inputValuesInElement(a.getEmail(), getExcelDataUsingMap("Reg", 0, "Email"));
		writeToExcel("Write", 0, 2, a.getEmail().getAttribute("value"));
		
		inputValuesInElement(a.getPassWord(), getExcelDataUsingMap("Reg", 0, "Password"));
		writeToExcel("Write", 0, 3, a.getPassWord().getAttribute("value"));
		
		selectFromDropDown(a.getDay(), getExcelDataUsingMap("Reg", 0, "Day"));
		writeToExcel("Write", 0, 4, a.getDay().getAttribute("value"));
	;    
		selectFromDropDown(a.getMonth(), getExcelDataUsingMap("Reg", 0, "Month"));
		writeToExcel("Write", 0, 5, a.getMonth().getAttribute("value"));
		
		selectFromDropDown(a.getYear(), getExcelDataUsingMap("Reg", 0, "Year"));
		writeToExcel("Write", 0, 6, a.getYear().getAttribute("value"));
		
		clickOnTheElement(a.getGender());
		clickOnTheElement(a.getSignUp());
	}

	@AfterClass
	public static void afterClass() {
		driver.quit();

	}

}
