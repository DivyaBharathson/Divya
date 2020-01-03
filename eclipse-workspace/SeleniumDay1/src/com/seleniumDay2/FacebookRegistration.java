package com.seleniumDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookRegistration {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divibharath\\eclipse-workspace\\SeleniumDay1\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement firstName = driver.findElement(By.id("u_0_m"));
	firstName.sendKeys("Divya");
	WebElement lastName = driver.findElement(By.id("u_0_o"));
	lastName.sendKeys("Bharath");
	WebElement mobile = driver.findElement(By.id("u_0_r"));
	mobile.sendKeys("9840085983");
	WebElement pass = driver.findElement(By.id("u_0_w"));
	pass.sendKeys("*****");
	WebElement day = driver.findElement(By.id("day"));
	day.sendKeys("12");
	WebElement month = driver.findElement(By.id("month"));
	month.sendKeys("Dec");
	WebElement year = driver.findElement(By.id("year"));
	year.sendKeys("1988");
	WebElement gender = driver.findElement(By.id("u_0_6"));
	gender.click();
	WebElement signUp = driver.findElement(By.id("u_0_13"));
	signUp.click();
	
	
	
	}

}
