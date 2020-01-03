package com.selenium.Day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintContinents {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement continents = driver.findElement(By.id("continents"));
		Select s=new Select(continents);
		List<WebElement> options = s.getOptions();
		
		for (WebElement x : options) {
			System.out.println(x.getText());
		}
		
		
		driver.quit();	
		
	}

}
