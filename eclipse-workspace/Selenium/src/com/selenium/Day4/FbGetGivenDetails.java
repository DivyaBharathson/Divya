package com.selenium.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbGetGivenDetails {
	public static void main(String[] args) throws Throwable {
		
	//Ran Successfully

	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	WebElement userName = driver.findElement(By.id("email"));
	userName.sendKeys("divya.madhan@msnbwkchlik");
	String x = userName.getAttribute("value");
	System.out.println("user name "+x);
	
	WebElement pass = driver.findElement(By.id("pass"));
	pass.sendKeys("!@@#$#EF");
	String x1 = pass.getAttribute("value");
	System.out.println("Pass is "+x1);
	
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript(argument[0].setAttribute('value',"divya.madhan@gmail.com"),userName);
	
	

}
}