package com.selenium.Day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchVelmurugan {

	public static void main(String[] args) throws Throwable {
		
		//Ran Successfully
				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
        Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Greens Velmurugan");
		Thread.sleep(2000);
		
		List<WebElement> x = driver.findElements(By.xpath("//span[text()='greens velmurugan']"));
			x.get(0).click();
			
		}
	
	}

