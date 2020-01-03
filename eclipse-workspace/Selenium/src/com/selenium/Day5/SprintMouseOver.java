package com.selenium.Day5;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SprintMouseOver {

	public static void main(String[] args) throws Throwable {
		
		//Ran successfully
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.sprint.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
//		WebElement plans= driver.findElement(By.xpath("(//a[@class='sprint-menu__root-link'])[1]"));
		
		Actions ac=new Actions(driver);
		Robot r=new Robot();
		
//		ac.moveToElement(plans).build().perform();	
		
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement mySprint = driver.findElement(By.xpath("(//a[@class='sprint-menu__root-link'])[4]"));
		ac.moveToElement(mySprint).build().perform();
		Thread.sleep(1000);
		WebElement payBill = driver.findElement(By.xpath("(//a[@target='_self'])[41]"));
		ac.moveToElement(payBill).build().perform();
		payBill.click();
		
		Thread.sleep(2000);
		driver.quit();

	}
	
	
}
