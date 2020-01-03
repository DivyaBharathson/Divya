package com.selenium.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCategory {

	public static void main(String[] args) throws Throwable {
		
		//no such element exception
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement category = driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']"));
		category.click();
		
		WebElement mobiles = driver.findElement(By.xpath("//a[@data-menu-id='7']"));
		mobiles.click();
		
		WebElement power = driver.findElement(By.xpath("//div[text()='Power Banks']"));
		power.click();
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}
