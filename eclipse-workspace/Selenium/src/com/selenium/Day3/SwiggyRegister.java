package com.selenium.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyRegister {

	public static void main(String[] args) throws Throwable {
		
		//Ran successfully
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement logIn = driver.findElement(By.xpath("//a[@class='r2iyh']"));
		logIn.click();
		WebElement num = driver.findElement(By.xpath("//input[@id='mobile']"));
		num.sendKeys("1234567891");
		WebElement name= driver.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys("Divya");
		WebElement eMail= driver.findElement(By.xpath("//input[@id='email']"));
		eMail.sendKeys("abc@drf.com");
		WebElement pass= driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("QWE!@#qwe123");
		WebElement cont= driver.findElement(By.xpath("//a[@class='a-ayg']"));
		cont.click();
			
		
	}
	}


