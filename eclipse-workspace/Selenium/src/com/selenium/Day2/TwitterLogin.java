package com.selenium.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwitterLogin {
	public static void main(String[] args) throws Throwable {
		
		//Ran successfully
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://twitter.com/login");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("(//input[@name='session[username_or_email]'])[2]"));
		username.click();
		username.sendKeys("Divya Bharath");
		WebElement password = driver.findElement(By.xpath("(//input[@name='session[password]'])[2]"));
		password.sendKeys("*******");
		Thread.sleep(2000);
		driver.close();
	
	}

}
