package com.selenium.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensPrint2Paras {

	public static void main(String[] args) throws Throwable {
		
		//Ran successfully
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/index.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement para1 = driver.findElement(By.xpath("(//p[@style='text-align:justify; font-size:18px;'])[2]"));
		System.out.println(para1.getText());
		
		WebElement para2 = driver.findElement(By.xpath("(//p[@style='text-align:justify; font-size:18px;'])[3]"));
		System.out.println(para2.getText());
		
		driver.close();
	
		
	}
	}


