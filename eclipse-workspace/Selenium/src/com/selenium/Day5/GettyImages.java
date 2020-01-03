package com.selenium.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GettyImages {

	public static void main(String[] args) throws Throwable {
		
		//Ran successfully
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.gettyimages.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement editorial = driver.findElement(By.xpath("(//a[@class='text-link--sly action--with-emphasis'])[1]"));
		
		Actions ac=new Actions(driver);
		ac.moveToElement(editorial);
		
		Thread.sleep(2000);
		
		editorial.click();
		
		WebElement video = driver.findElement(By.xpath("//a[text()='Entertainment']"));
		video.click();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}
	
	
}
