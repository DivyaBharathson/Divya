package com.maven.MavenPractise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPOM extends SeleniumBaseClass{
	
	@FindBy (id = "email")
	private WebElement email;
	
	@FindBy (id="pass")
	private WebElement pass;
	
	@FindBy (xpath="//input[@value='Log In']")
	private WebElement logIn;
	
	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getPass() {
		return pass;
	}

	public void setPass(WebElement pass) {
		this.pass = pass;
	}

	public WebElement getLogIn() {
		return logIn;
	}

	public void setLogIn(WebElement logIn) {
		this.logIn = logIn;
	}

	public FacebookLoginPOM() {
		PageFactory.initElements(driver, this);
	}

}
