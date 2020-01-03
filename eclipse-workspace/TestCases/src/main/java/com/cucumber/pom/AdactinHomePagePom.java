package com.cucumber.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.baseclass.SeleniumBaseClass;

public class AdactinHomePagePom extends SeleniumBaseClass {
	
	@FindBy (id="username")
	private WebElement userNameField;
	
	@FindBy (id="password")
	private WebElement passNameField;
	
	@FindBy (id="login")
	private WebElement loginButton;
	
	public WebElement getUserNameField() {
		return userNameField;
	}

	public WebElement getPassNameField() {
		return passNameField;
	}

	public void setUserNameField(WebElement userNameField) {
		this.userNameField = userNameField;
	}

	public void setPassNameField(WebElement passNameField) {
		this.passNameField = passNameField;
	}

	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public AdactinHomePagePom() {
		PageFactory.initElements(driver, this);
	}

}
