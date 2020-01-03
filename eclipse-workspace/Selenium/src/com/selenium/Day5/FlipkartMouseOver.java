package com.selenium.Day5;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartMouseOver {
		
	public static void main(String[] args) throws Throwable {
		
		//Ran succesfully
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions ac=new Actions(driver);
		Robot r=new Robot();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement close = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		close.click();
		Thread.sleep(2000);
		
		WebElement women = driver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[4]"));
		ac.moveToElement(women).build().perform();
		Thread.sleep(2000);
		
		WebElement footwear = driver.findElement(By.xpath("(//a[@title='Footwear'])[2]"));
		footwear.click();
		Thread.sleep(2000);
		
		WebElement flats = driver.findElement(By.xpath("(//a[@title='Flats'])[2]"));
		flats.click();
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}
