package com.selenium.day6;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TwitterSendkeysKeyboardActionsWithoutRobotClass {
	
	public static void main(String[] args) throws Throwable {
		
		//Ran successfully
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Robot r=new Robot();
		Actions ac=new Actions(driver);
		
		driver.get("https://twitter.com/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement text = driver.findElement(By.xpath("(//input[@name='session[username_or_email]'])[2]"));
		text.sendKeys("divya.madhan@gmail.com");
		text.sendKeys(Keys.CONTROL,"ax");
		WebElement pass = driver.findElement(By.xpath("(//input[@name='session[password]'])[2]"));
		pass.sendKeys(Keys.CONTROL,"v");
	
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
