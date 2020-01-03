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

public class SnapdealWindowHandling {

	public static void main(String[] args) throws Throwable {
		
		//didnt get printed
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Robot r=new Robot();
		
		driver.get("https://www.snapdeal.com/");
		String pid = driver.getWindowHandle();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.id("inputValEnter"));
		search.sendKeys("Iphone 7");
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		WebElement firstImage = driver.findElement(By.xpath("//img[@title='Apple iPhone 7 ( 32GB , 2 GB ) Rose Gold']"));
		firstImage.click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> li=new ArrayList<String>();
		li.addAll(windowHandles);
		
		driver.switchTo().window(li.get(1));
		
		driver.findElement(By.xpath("(//span[@class=\"intialtext\"])[2]")).click();
		
		WebElement cost = driver.findElement(By.xpath("(//span[@class=\"price\"])[2]"));
		System.out.println(cost.getText());
		
		Thread.sleep(2000);
		driver.quit();
	}
}
