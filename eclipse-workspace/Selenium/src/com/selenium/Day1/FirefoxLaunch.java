package com.selenium.Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\divibharath\\eclipse-workspace\\SeleniumDay1\\Drivers\\geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		driver1.get("https://www.amazon.com/");
		
		
		
		
		
	}
	}


