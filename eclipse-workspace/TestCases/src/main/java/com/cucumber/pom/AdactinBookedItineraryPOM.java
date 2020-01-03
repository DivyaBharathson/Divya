package com.cucumber.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.baseclass.SeleniumBaseClass;

public class AdactinBookedItineraryPOM extends SeleniumBaseClass{
	
	@FindBy (xpath="(//input[@class='select_text'])[1]")
	private WebElement firstDisplayedOrderId;
	
	@FindBy (id="order_id_323536")
	private WebElement lastDisplayedOrderId;
	
	@FindBy (id="btn_id_323536")
	private WebElement lastCancelOrderButton;
	
	public WebElement getLastDisplayedOrderId() {
		return lastDisplayedOrderId;
	}

	public WebElement getLastCancelOrderButton() {
		return lastCancelOrderButton;
	}

	@FindBy (xpath="//input[@value='323480']")
	private WebElement firstDisplayedCheckBox;
	
	@FindBy (xpath="(//input[@type='button'])[1]")
	private WebElement firstCancelOrderButton;
	
	@FindBy (id="order_id_text")
	private WebElement orderIdSearchBox;
	
	@FindBy (id="search_hotel_id")
	private WebElement searchGoButton;
	
	@FindBy (id="hotel_name_323480")
	private WebElement hotelNameTeVerify;
	
	@FindBys (value= @FindBy (xpath = "//input[@class='select_text']"))
	private WebElement allDetailsFromItineraryPage;
	
	public WebElement getHotelNameTeVerify() {
		return hotelNameTeVerify;
	}

	public WebElement getAllDetailsFromItineraryPage() {
		return allDetailsFromItineraryPage;
	}

	public void setHotelNameTeVerify(WebElement hotelNameTeVerify) {
		this.hotelNameTeVerify = hotelNameTeVerify;
	}

	public WebElement getOrderIdSearchBox() {
		return orderIdSearchBox;
	}

	public WebElement getSearchGoButton() {
		return searchGoButton;
	}

	public void setFirstDisplayedCheckBox(WebElement firstDisplayedCheckBox) {
		this.firstDisplayedCheckBox = firstDisplayedCheckBox;
	}

	public void setFirstCancelOrderButton(WebElement firstCancelOrderButton) {
		this.firstCancelOrderButton = firstCancelOrderButton;
	}

	public void setOrderIdSearchBox(WebElement orderIdSearchBox) {
		this.orderIdSearchBox = orderIdSearchBox;
	}

	public void setSearchGoButton(WebElement searchGoButton) {
		this.searchGoButton = searchGoButton;
	}

	public AdactinBookedItineraryPOM() {
		PageFactory.initElements(driver, this);
	}

	public void setFirstDisplayedOrderId(WebElement firstDisplayedOrderId) {
		this.firstDisplayedOrderId = firstDisplayedOrderId;
	}

	public WebElement getFirstDisplayedOrderId() {
		return firstDisplayedOrderId;
	}

	public WebElement getFirstDisplayedCheckBox() {
		return firstDisplayedCheckBox;
	}

	public WebElement getFirstCancelOrderButton() {
		return firstCancelOrderButton;
	}
}
