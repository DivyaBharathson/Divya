package com.selenium.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensPrint3rdPara {

	public static void main(String[] args) throws Throwable {
		
		//Ran successfully
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement close = driver.findElement(By.xpath("//button[@type='button']"));
		close.click();
		
		WebElement para = driver.findElement(By.xpath("//p[contains(text(),'Our')]"));
		String text = para.getText();
		System.out.println(text);
		
		driver.close();
		
		
		
		
		
		
	}
	}


