package com.selenium.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusLogin {

	public static void main(String[] args) throws Throwable {
		
		//Ran successfully
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.redbus.in/ ");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement from = driver.findElement(By.id("src"));
		from.sendKeys("Chennai");
		WebElement to = driver.findElement(By.id("dest"));
		to.sendKeys("Mumbai");
		Thread.sleep(2000);
		driver.close();
	}
	}


