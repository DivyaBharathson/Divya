package com.maven.MavenPractise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookRegPOM extends SeleniumBaseClass{
	
	@FindBy (xpath=("//input[@name='firstname']"))
	private WebElement firstName;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement email;
	
	@FindBy(xpath="//input[@name='reg_passwd__']")
	private WebElement passWord;
	
	@FindBy(id="day")
	private WebElement day;
	
	@FindBy(id="month")
	private WebElement month;
	
	@FindBy(id="year")
	private WebElement year;
	
	@FindBy(xpath="//input[@value='1']")
	private WebElement gender;
	
	@FindBy(xpath="//button[@name='websubmit']")
	private WebElement signUp;
	
	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public void setPassWord(WebElement passWord) {
		this.passWord = passWord;
	}

	public WebElement getDay() {
		return day;
	}

	public void setDay(WebElement day) {
		this.day = day;
	}

	public WebElement getMonth() {
		return month;
	}

	public void setMonth(WebElement month) {
		this.month = month;
	}

	public WebElement getYear() {
		return year;
	}

	public void setYear(WebElement year) {
		this.year = year;
	}

	public WebElement getGender() {
		return gender;
	}

	public void setGender(WebElement gender) {
		this.gender = gender;
	}

	public WebElement getSignUp() {
		return signUp;
	}

	public void setSignUp(WebElement signUp) {
		this.signUp = signUp;
	}

	public FacebookRegPOM() {
		PageFactory.initElements(driver, this);
	}

}
