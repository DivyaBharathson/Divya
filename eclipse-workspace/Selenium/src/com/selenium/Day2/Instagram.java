package com.selenium.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws Throwable {
		
		
		//Ran successfully
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en)%20login%20page");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Divya Bharath");
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("12345");
		Thread.sleep(2000);
		driver.close();
	}
	}


