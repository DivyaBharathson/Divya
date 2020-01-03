package com.selenium.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTripSignIn {

	public static void main(String[] args) throws Throwable {
		
		//Ran successfully
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement sign = driver.findElement(By.xpath("//a[@href='/signin']"));
		sign.click();
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("divya.madhan@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("123ASqwe");
		WebElement check = driver.findElement(By.xpath("//input[@id='persistent_login']"));
		check.click();
		WebElement sign1 = driver.findElement(By.xpath("//button[@id='signInButton']"));
		sign1.click();
		
		
		
	}
	}


