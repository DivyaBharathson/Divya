package com.selenium.Day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartChairAddToCart {

	
	public static void main(String[] args) throws Throwable {
		
		//no such element exception
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement close = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		close.click();
		
		WebElement furniture = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(furniture).build().perform();
		
		WebElement chairs = driver.findElement(By.xpath("//a[@title='Chairs']"));
		chairs.click();
		
		String fwh = driver.getWindowHandle();
		
		WebElement chair1 = driver.findElement(By.xpath("(//div[@class='_3BTv9X _3MSCRn'])[1]"));
		chair1.click();
		
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		
		List<String> li=new ArrayList<String>();
		li.addAll(handles);
		
		driver.switchTo().window(li.get(1));
		
		WebElement add = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
		add.click();
		
		Thread.sleep(5000);
		driver.quit();
		
		
	
	
	}
}
