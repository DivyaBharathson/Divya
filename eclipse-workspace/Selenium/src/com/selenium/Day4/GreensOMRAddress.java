package com.selenium.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensOMRAddress {

	public static void main(String[] args) throws Throwable {
		
		
		//Ran successfully
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/index.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement line1 = driver.findElement(By.xpath("//span[@class='red_text']"));
		System.out.println(line1.getText());
		
		WebElement line2 = driver.findElement(By.xpath("(//font[@size='-1'])[6]"));
		System.out.println(line2.getText());
		
		
		WebElement line3 = driver.findElement(By.xpath("(//font[@size='-1'])[7]"));
		System.out.println(line3.getText());
		
		WebElement line4 = driver.findElement(By.xpath("(//font[@size='-1'])[8]"));
		System.out.println(line4.getText());
		
		WebElement line5 = driver.findElement(By.xpath("(//font[@size='-1'])[9]"));
		System.out.println(line5.getText());
		
		driver.close();
		
	}
	}


