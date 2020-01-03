package com.maven.MavenPractise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinBookingPOM extends SeleniumBaseClass {
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;

	@FindBy(id="room_type")
	private WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement roomNums;
	
	@FindBy(id="datepick_in")
	private WebElement checkInDate;
	
	@FindBy(id="datepick_out")
	private WebElement checkOutDate;
	
	@FindBy(id="adult_room")
	private WebElement adultsPerRoom;
	
	@FindBy(id="child_room")
	private WebElement childPerRoom;
	
	@FindBy(id="Submit")
	private WebElement searchButton;
	
	@FindBy (id="radiobutton_1")
	private WebElement radioButton;
	
	@FindBy (id="continue")
	private WebElement continueTo;
	
	
	
	
	public WebElement getLocation() {
		return location;
	}

	public void setLocation(WebElement location) {
		this.location = location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public void setHotel(WebElement hotel) {
		this.hotel = hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public void setRoomType(WebElement roomType) {
		this.roomType = roomType;
	}

	public WebElement getRoomNums() {
		return roomNums;
	}

	public void setRoomNums(WebElement roomNums) {
		this.roomNums = roomNums;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(WebElement checkInDate) {
		this.checkInDate = checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(WebElement checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}

	public void setAdultsPerRoom(WebElement adultsPerRoom) {
		this.adultsPerRoom = adultsPerRoom;
	}

	public WebElement getChildPerRoom() {
		return childPerRoom;
	}

	public void setChildPerRoom(WebElement childPerRoom) {
		this.childPerRoom = childPerRoom;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public void setSearchButton(WebElement searchButton) {
		this.searchButton = searchButton;
	}

	public WebElement getRadioButton() {
		return radioButton;
	}

	public void setRadioButton(WebElement radioButton) {
		this.radioButton = radioButton;
	}

	public WebElement getContinueTo() {
		return continueTo;
	}

	public void setContinueTo(WebElement continueTo) {
		this.continueTo = continueTo;
	}

	public AdactinBookingPOM() {
		PageFactory.initElements(driver, this);
	}
	




}
