package com.selenium.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleActionsClass {
		
		public static void main(String[] args) throws Throwable {
			
			//No Such Element
				
			System.setProperty("webdriver.chrome.driver","C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[@title='Google apps']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//span[@class='Rq5Gcb'])[4]")).click();
			
			Thread.sleep(2000);
			
			driver.quit();
					
		}
}
