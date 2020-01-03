package com.selenium.Day5;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonMouseOver {
	
	public static void main(String[] args) throws Throwable {
		
		//Ran successfully
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		Actions ac=new Actions(driver);
		Robot r=new Robot();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Explicit wait
		//WebdriverWait - Class
		
		
		WebElement signIn = driver.findElement(By.id("nav-link-accountList"));
		WebDriverWait wb = new WebDriverWait(driver, 60);
		wb.until(ExpectedConditions.visibilityOf(signIn));
		ac.moveToElement(signIn).build().perform();
		
	
		WebElement startHere = driver.findElement(By.xpath("(//a[@class='nav-a'])[1]"));
		wb.until(ExpectedConditions.visibilityOf(startHere));
		
		
		
		startHere.click();
		
//		WebElement signIn1 = driver.findElement(By.xpath("(//a[@class='a-link-emphasis'])[1]"));
//		signIn1.click();
//		Thread.sleep(2000);
		
		WebElement cusName = driver.findElement(By.id("ap_customer_name"));
		wb.until(ExpectedConditions.visibilityOf(cusName));

		cusName.sendKeys("Divya");
		
		WebElement mobile = driver.findElement(By.id("ap_phone_number"));
		mobile.sendKeys("987654321");
		
		WebElement pass = driver.findElement(By.id("ap_password"));
		pass.sendKeys("123qweQWE");
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
				
//		WebElement email = driver.findElement(By.id("ap_email"));
//		email.sendKeys("ref@ref.com");
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		driver.quit();
		
		
	}
}

