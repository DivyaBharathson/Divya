package com.selenium.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClassByPrem
{

	public static void main(String[] args) throws Throwable {
		System.out.println(System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	
		WebElement emailFeild = driver.findElement(By.name("email"));
		emailFeild.sendKeys("testuser@gmail.com");
		
		WebElement passwordFeild = driver.findElement(By.name("pass"));
		passwordFeild.sendKeys("!@#$%%");
		
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
		
		
		
	}

}
