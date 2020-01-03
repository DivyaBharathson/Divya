package com.selenium.Day10;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensRightClick {
		
		public static void main(String[] args) throws Throwable {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			Actions ac=new Actions(driver);
			Robot r=new Robot();
			
			driver.get("http://www.greenstechnologys.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			WebElement contact = driver.findElement(By.xpath("//a[text()='CONTACT US']"));
			ac.contextClick(contact).build().perform();
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(2000);
			
			Set<String> windowHandles = driver.getWindowHandles();
			List<String> li=new ArrayList<String>();
			li.addAll(windowHandles);
			
			driver.switchTo().window(li.get(1));
			Thread.sleep(2000);
			
			driver.quit();
			
		}
	
	
	
}
