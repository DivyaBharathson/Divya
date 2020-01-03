package com.selenium.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CTSquestions {


	public static void main(String[] args) throws Throwable {
		
		//Ran successfully
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologies.in/selenium-training.php");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//WebElement close = driver.findElement(By.xpath("//button[@type='button']"));
		//close.click();
		WebElement link = driver.findElement(By.xpath("//a[@href='http://greenstech.in/interview-questions/cts.pdf#toolbar=0']"));
		link.click();		
	
		
	}
	}


