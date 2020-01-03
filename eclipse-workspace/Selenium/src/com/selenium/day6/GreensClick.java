package com.selenium.day6;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensClick {

	public static void main(String[] args) throws Throwable {
		
		//irrelevant output
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Robot r=new Robot();
		Actions ac=new Actions(driver);
		
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement para = driver.findElement(By.xpath("(//p[@style='text-align:justify; font-size:18px;'])[1]"));
		para.click();
		para.click();
		para.click();
		
		//ac.contextClick(para).
		
		Thread.sleep(2000);

		driver.quit();
		
	}
	
	
}
