package com.selenium.Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		WebElement src = driver.findElement(By.xpath("//a[text()=' 687878 ']"));
		
		WebElement des = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		Actions ac = new Actions(driver);
		ac.dragAndDrop(src, des).build().perform();
		
 
	
	}

}
