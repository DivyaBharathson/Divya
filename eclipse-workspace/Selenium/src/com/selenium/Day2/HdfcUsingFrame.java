package com.selenium.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcUsingFrame {

	public static void main(String[] args) throws Throwable {
		
		//Ran successfully after Frame
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.name("login_page"));
		driver.switchTo().frame(login);
		Thread.sleep(2000);
		WebElement userID = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		userID.sendKeys("897624");
		Thread.sleep(2000);
		driver.close();
			
	}
	}


