package com.maven.MavenPractise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePagePOM extends SeleniumBaseClass{
	
	@FindBy (id="twotabsearchtextbox")
	private WebElement searchBox;
	
	@FindBy (xpath="(//input[@type='submit'])[1]")
	private WebElement searchButton;
	
	
	
	public WebElement getSearchBox() {
		return searchBox;
	}



	public void setSearchBox(WebElement searchBox) {
		this.searchBox = searchBox;
	}



	public WebElement getSearchButton() {
		return searchButton;
	}



	public void setSearchButton(WebElement searchButton) {
		this.searchButton = searchButton;
	}



	public AmazonHomePagePOM() {

		PageFactory.initElements(driver, this);
	}

}
