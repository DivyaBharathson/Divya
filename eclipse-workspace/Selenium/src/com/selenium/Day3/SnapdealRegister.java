package com.selenium.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapdealRegister {
	
	public static void main(String[] args) throws Throwable {
		
	//no such element Exception 

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	WebElement sign = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
	sign.click();
	WebElement reg = driver.findElement(By.xpath("//span[@class='newUserRegister']"));
	reg.click();
	WebElement userName = driver.findElement(By.xpath("//input[@class='col-xs-24']"));
	userName.sendKeys("Divya Bharath");
	WebElement signUp = driver.findElement(By.xpath("//button[@id='checkUser']"));
	signUp.click();
	
	
	
	
	
	}

}
