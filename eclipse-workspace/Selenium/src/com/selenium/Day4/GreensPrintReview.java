package com.selenium.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensPrintReview {

	public static void main(String[] args) throws Throwable {
		
		//Ran Successfully
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement sign = driver.findElement(By.xpath("//span[@itemprop='itemreviewed']"));
		
		System.out.println(sign.getText());
		driver.close();
		
	}
	}


