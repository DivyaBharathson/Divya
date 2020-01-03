package com.maven.MavenPractise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLoginPOM extends SeleniumBaseClass {
	
	@FindBy (id="username")
	private WebElement email;
	
	@FindBy (id="password")
	private WebElement pass;
	
	@FindBy (id="login")
	private WebElement login;
	
	public AdactinLoginPOM() {
		PageFactory.initElements(driver, this);
	}

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

	public WebElement getLogin() {
		return login;
	}

	public void setLogin(WebElement login) {
		this.login = login;
	}

}
