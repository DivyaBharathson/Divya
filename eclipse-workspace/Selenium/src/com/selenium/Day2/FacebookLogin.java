package com.selenium.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		
		//Ran successfully
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("divya.madvem@gmail.com");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("123456");
		WebElement logIn = driver.findElement(By.xpath("//input[@id='u_0_b']"));
		logIn.click();
		
		
	}
	}

