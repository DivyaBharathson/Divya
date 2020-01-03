package com.selenium.Day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintEvenOddDetails {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement cmds = driver.findElement(By.id("selenium_commands"));
		Select s=new Select(cmds);
		
		List<WebElement> options = s.getOptions();
		
		System.out.println("*******All the options are*******");
		int temp=1;
		for (WebElement x : options) {
			System.out.println(x.getText());
			temp=temp+1;
		}
		System.out.println("*******The Even options are********");
		for (int i = 0; i < temp; i=i+2) {
			System.out.println(options.get(i).getText());
		}
		System.out.println("*******The Odd options are********");
		for (int i = 1; i <temp ; i=i+2) {
			System.out.println(options.get(i).getText());
		}
		
		driver.quit();
		}		
			
	}


