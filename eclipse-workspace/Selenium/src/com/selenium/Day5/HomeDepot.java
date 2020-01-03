package com.selenium.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeDepot {
	
	public static void main(String[] args) throws Throwable {
		
		//Ran successfully
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		Actions ac=new Actions(driver);
		
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement allDepts = driver.findElement(By.xpath("(//a[@data-id='departmentsFlyout'])[1]"));
		ac.moveToElement(allDepts).build().perform();
		
		WebElement Heating = driver.findElement(By.xpath("(//a[@title='Heating & Cooling'])[1]"));
		ac.moveToElement(Heating).build().perform();
		
		WebElement Aircond = driver.findElement(By.xpath("(//a[@title='Air Conditioners'])[1]"));
		ac.moveToElement(Aircond).build().perform();
		
		WebElement portable = driver.findElement(By.xpath("(//a[@title='Portable Air Conditioners'])[1]"));
		portable.click();
		
//		WebElement paint = driver.findElement(By.xpath("//a[@title='Paint']"));
//		ac.moveToElement(paint).build().perform();
//		
//		WebElement interiorPaint = driver.findElement(By.xpath("//a[@title='Interior Paint']"));
//		ac.moveToElement(interiorPaint).build().perform();
//		
//		WebElement ceilingPaint = driver.findElement(By.xpath("//a[@title='Ceiling Paint']"));
//		ceilingPaint.click();
		
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	
	
	
	
}
