package com.maven.MavenPractise;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AdactinBookingJunitScript extends SeleniumBaseClass {
	
	AdactinLoginPOM l=new AdactinLoginPOM();
	AdactinBookingPOM b=new AdactinBookingPOM();
	AdactinBookingPaymentDetailsPOM b2=new AdactinBookingPaymentDetailsPOM();
	
	
	@BeforeClass
	public static void beforeClass() throws Throwable {
		browserLaunch("chrome");
		getUrl("https://www.adactin.com/HotelApp/index.php");

	}
	
	@Before
	
	public void before() throws Throwable {
		//waitForElementVisiblity(l.getEmail());
		inputValuesInElement(l.getEmail(), getExcelData("logIn", 1, 0));
		inputValuesInElement(l.getPass(), getExcelData("logIn", 1, 1));
		clickOnTheElement(l.getLogin());
	}
	
	@Test 
	public void test() throws Throwable {
		waitForElementVisiblity(b.getLocation());
		selectFromDropDown(b.getLocation(),getExcelData("RoomDetails", 1, 0));
		//inputValuesInElement(b.getHotel(), getExcelData("RoomDetails", 1, 1));
		//inputValuesInElement(b.getRoomType(), getExcelData("RoomDetails", 1, 2));
		selectFromDropDown(b.getRoomNums(), getExcelData("RoomDetails", 1, 3));
		inputValuesInElement(b.getCheckInDate(), getExcelData("RoomDetails", 1, 4));
		inputValuesInElement(b.getCheckOutDate(), getExcelData("RoomDetails", 1, 5));
		inputValuesInElement(b.getHotel(), getExcelData("RoomDetails", 1, 6));
		//inputValuesInElement(b.getAdultsPerRoom(), getExcelData("RoomDetails", 1, 7));
		//inputValuesInElement(b.getChildPerRoom(), getExcelData("RoomDetails", 1, 8));
		clickOnTheElement(b.getSearchButton());
		waitForElementVisiblity(b.getRadioButton());
		clickOnTheElement(b.getRadioButton());
		clickOnTheElement(b.getContinueTo());
		waitForElementVisiblity(b2.getFirstName());
		inputValuesInElement(b2.getFirstName(), getExcelData("Booking Details", 1, 0));
		inputValuesInElement(b2.getLastName(), getExcelData("Booking Details", 1, 1));
		inputValuesInElement(b2.getAddress(), getExcelData("Booking Details", 1, 2));
		inputValuesInElement(b2.getCardNum(), getExcelData("Booking Details", 1, 3));
		selectFromDropDown(b2.getCardType(), getExcelData("Booking Details", 1, 4));
		selectFromDropDown(b2.getExpMonth(), getExcelData("Booking Details", 1, 5));
		selectFromDropDown(b2.getExpYear(), getExcelData("Booking Details", 1, 6));
		inputValuesInElement(b2.getCVVNum(), getExcelData("Booking Details", 1, 7));
		clickOnTheElement(b2.getBookNow());
		waitForElementVisiblity(b2.getOrderNum());
		System.out.println("Room booked. The order number is ");
		getAttributeValue(b2.getOrderNum());
		takeScreenShot("Adactin Room booked");
		
		
	}
	
	@After
	public void after() throws Throwable {
		waitForElementVisiblity(b2.getLogOut());
		clickOnTheElement(b2.getLogOut());

	}
	
	@AfterClass
	public static void afterClass() {
		driver.quit();

	}

}
