package com.selenium.Day10;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartWindowsHandling {
			
	//Element Click intercepted  
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Robot r=new Robot();
		
		driver.get("https://www.flipkart.com/");
		String pid = driver.getWindowHandle();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement close = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		close.click();
		
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("Iphone 7");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		WebElement first = driver.findElement(By.xpath("//img[@alt='Apple iPhone 7 (Black, 32 GB)']"));
		first.click();
		
		Thread.sleep(2000);
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> li=new ArrayList<String>();
		li.addAll(windowHandles);
		
		driver.switchTo().window(li.get(1));
		
		Thread.sleep(2000);
		
		
		WebElement Element = driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(Element).build().perform();
		Element.click();
		
//		JavascriptExecutor js= (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();",Element);
//		
//		Thread.sleep(2000);
		
//		WebElement add = driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
//
//		add.click();
		Thread.sleep(2000);
		
		WebElement pay = driver.findElement(By.xpath("//div[@class='hJYgKM']"));
		System.out.println(pay.getText());
		
		driver.quit();
	}
	
}
