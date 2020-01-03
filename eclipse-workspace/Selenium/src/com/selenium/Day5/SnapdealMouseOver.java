package com.selenium.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealMouseOver {
	
	public static void main(String[] args) throws Throwable {
		
		//no error, but heels didnt click
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions ac=new Actions(driver);
		
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
//		WebElement mobiles = driver.findElement(By.xpath("(//span[@class='catText'])[2]"));
//		ac.moveToElement(mobiles).build().perform();
//		
//		WebElement covers = driver.findElement(By.xpath("(//span[text()='New Launches Covers'])"));
//		covers.click();
		
		
		WebElement women = driver.findElement(By.xpath("(//span[@class='catText'])[7]"));
		ac.moveToElement(women).build().perform();
		
		WebElement heels = driver.findElement(By.xpath("(//span[text()='Heels'])[1]"));
		heels.click();
		
		Thread.sleep(5000);
		driver.quit();
	
	}

}
