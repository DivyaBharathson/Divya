package com.cucumber.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.baseclass.SeleniumBaseClass;

public class AdactinBookingDetailsVerifyToContinuePOM extends SeleniumBaseClass{

	@FindBy (id="hotel_name_0")
	private WebElement verifyHotelName;
	
	@FindBy (id="location_0")
	private WebElement verifyHotelLocation;
	
	@FindBy (id="rooms_0")
	private WebElement verifyRoomNum;
	
	@FindBy (id="arr_date_0")
	private WebElement verifyArrivalDate;

	@FindBy (id="dep_date_0")
	private WebElement verifyDepartureDate;
	
	@FindBy (id="no_days_0")
	private WebElement verifyNoOfRooms;
	
	@FindBy (id="room_type_0")
	private WebElement verifyRoomType;
	
	@FindBy (id="price_night_0")
	private WebElement verifyPricePerNight;
	
	@FindBy (id="total_price_0")
	private WebElement verifyTotalPrice;

	public WebElement getVerifyHotelName() {
		return verifyHotelName;
	}
	@FindBy (id="radiobutton_0")
	private WebElement radioButton;
	
	@FindBy (id="continue")
	private WebElement continueButton;

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	public WebElement getVerifyHotelLocation() {
		return verifyHotelLocation;
	}

	public WebElement getVerifyRoomNum() {
		return verifyRoomNum;
	}

	public WebElement getVerifyArrivalDate() {
		return verifyArrivalDate;
	}

	public WebElement getVerifyDepartureDate() {
		return verifyDepartureDate;
	}

	public WebElement getVerifyNoOfRooms() {
		return verifyNoOfRooms;
	}

	public WebElement getVerifyRoomType() {
		return verifyRoomType;
	}

	public WebElement getVerifyPricePerNight() {
		return verifyPricePerNight;
	}

	public WebElement getVerifyTotalPrice() {
		return verifyTotalPrice;
	}

	public AdactinBookingDetailsVerifyToContinuePOM() {
		PageFactory.initElements(driver, this);
	}


}
