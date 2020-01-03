package com.selenium.Day5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopcluesMouseOver {

	public static void main(String[] args) throws Throwable {
		
		//Ran successfully
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
//		Alert a=driver.switchTo().alert();
//		a.accept();
//		Thread.sleep(2000);
		
		WebElement Mobiles = driver.findElement(By.xpath("//a[text()='Mobiles & Electronics']"));
		
		Actions ac=new Actions(driver);
		ac.moveToElement(Mobiles).build().perform();
		
		Thread.sleep(2000);
		
		WebElement price = driver.findElement(By.xpath("//a[text()='Rs.5001 - Rs.10000']"));
		price.click();
		
		Thread.sleep(2000);
		
		driver.quit();
	
	
	}
	
	
}