package com.selenium.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinGetGivenDetails {
	
	public static void main(String[] args) throws Throwable {
		
		//Ran successfully
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Divya");
		String x = userName.getAttribute("value");
		System.out.println(x);
		
		WebElement pass= driver.findElement(By.id("password"));
		pass.sendKeys("123456");
		String x1 = pass.getAttribute("value");
		System.out.println(x1);
		
		driver.close();
		
		
	}

}
