package com.selenium.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciciBank {

	public static void main(String[] args) throws Throwable {
		
		//Ran successfully
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement click1 = driver.findElement(By.id("DUMMY1"));
		click1.click();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='AuthenticationFG.USER_PRINCIPAL']"));
		username.sendKeys("Divya Bharath");
		WebElement password = driver.findElement(By.xpath("//input[@id='AuthenticationFG.ACCESS_CODE']"));
		password.sendKeys("*******");
		Thread.sleep(2000);
		driver.close();
	

}

}
