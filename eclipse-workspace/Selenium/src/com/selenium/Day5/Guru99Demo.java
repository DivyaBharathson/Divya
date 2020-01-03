package com.selenium.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru99Demo {

	public static void main(String[] args) throws Throwable {
		
		//no such element exception
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement des = driver.findElement(By.xpath("(//li[@data-id='5'])[2]"));
		
		Actions ac=new Actions(driver);
		ac.dragAndDrop(src, des).build().perform();
		
		driver.quit();
	}
}
