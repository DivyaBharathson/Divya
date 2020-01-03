package com.selenium.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDealItemsToCart {

	public static void main(String[] args) throws Throwable {
		
		//NoSuchElementException
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement img = driver.findElement(By.xpath("(//img[@class='wooble'])[5]"));
		img.click();
		Thread.sleep(2000);
		
		WebElement toCart = driver.findElement(By.xpath("(//span[@class='intialtext'])[1]"));
		toCart.click();
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.snapdeal.com/");
		
		WebElement img1 = driver.findElement(By.xpath("(//img[@class='wooble'])[6]"));
		img1.click();
		Thread.sleep(2000);
		
		WebElement toCart1 = driver.findElement(By.xpath("(//span[@class='intialtext'])[1]"));
		toCart1.click();
		Thread.sleep(2000);
		
		WebElement total = driver.findElement(By.xpath("(//span[@class='price'])[2]"));
		System.out.println(total.getText());
		
		
	}
	}


