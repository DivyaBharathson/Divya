package com.selenium.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoreJavaMaterials {

	public static void main(String[] args) throws Throwable {
		
		//Ran successfully
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologies.in/selenium-training.php");
		WebElement coreJava = driver.findElement(By.xpath("//a[@href='http://traininginchennai.in/core%20java%20material.pdf']"));
		coreJava.click();
		Thread.sleep(3000);
		
	}
	}


