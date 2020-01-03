package com.selenium.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {

	public static void main(String[] args) throws Throwable {
		
		//Ran Successfully
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		
		WebElement from = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		from.sendKeys("MGR CHENNAI CTL - MAS");
		WebElement to = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		to.sendKeys("MUMBAI CENTRAL - BCT");
		Thread.sleep(2000);
		driver.close();
		
	}
	}


