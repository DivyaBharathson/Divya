package com.selenium.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
	public static void main(String[] args) throws Throwable {
		
		//Ran Successfully
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/login");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("userName"));
		username.sendKeys("Divya Bharath");
		WebElement login = driver.findElement(By.xpath("//button[@id='checkUser']"));
		login.click();
		Thread.sleep(2000);
		driver.close();
		
	}

	
	}


