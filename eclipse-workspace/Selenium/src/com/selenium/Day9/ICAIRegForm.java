package com.selenium.Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICAIRegForm {

	public static void main(String[] args) throws Throwable {
		
		//Element Not Traceable
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.icaionlineregistration.org/Admin_Module/login.aspx");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement userName = driver.findElement(By.xpath("(//input[@class='texboxBG'])[2]"));
		userName.sendKeys("DivyaBharath");
		System.out.println(userName.getAttribute("value"));
		
		WebElement pass = driver.findElement(By.xpath("(//input[@class='texboxBG'])[4]"));
		pass.sendKeys("123!@#QWEqwe");
		System.out.println(pass.getAttribute("value"));
		
		driver.quit();
		
	}
	
	
}
