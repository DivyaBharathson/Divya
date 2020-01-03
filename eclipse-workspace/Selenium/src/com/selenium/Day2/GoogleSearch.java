package com.selenium.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	public static void main(String[] args) throws Throwable {
		
	//Ran successfully

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement search = driver.findElement(By.name("q"));
	search.sendKeys("Greens Technologies");
	Thread.sleep(2000);
	driver.close();
	

}
}