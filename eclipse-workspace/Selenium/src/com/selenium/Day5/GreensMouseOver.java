package com.selenium.Day5;

import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensMouseOver {
	public static void main(String[] args) throws Throwable {
		
		//Ran successfully
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement close = driver.findElement(By.xpath("//button[@class='close']"));
		close.click();
		Thread.sleep(2000);
		
		WebElement courses = driver.findElement(By.xpath("//a[text()='COURSES']"));
		
		Actions ac=new Actions(driver);
		ac.moveToElement(courses).build().perform();
		
		WebElement oracle = driver.findElement(By.xpath("//span[text()='Oracle Training ']"));
		ac.moveToElement(oracle).build().perform();
		Thread.sleep(2000);
		
		WebElement courses1 = driver.findElement(By.xpath("//span[text()='Oracle Apps SCM Training']"));
		courses1.click();
		
//		WebElement selenium = driver.findElement(By.xpath("//span[text()='Selenium Training']"));
//		ac.moveToElement(selenium).click();
//		Thread.sleep(3000);
//		close.click();
		
//		WebElement para = driver.findElement(By.xpath("//p[contains(text(),'The Selenium with Appium training')]"));
//		System.out.println(para.getText());
//		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
