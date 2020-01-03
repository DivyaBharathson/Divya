package com.selenium.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LakshmiVilasBankRegister {

	public static void main(String[] args) throws Throwable {
		
		//Ran successfully
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://management.ind.in/forum/lakshmi-vilas-bank-net-banking-application-form-157353.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement uName = driver.findElement(By.xpath("//input[@name='vb_login_username']"));
		uName.sendKeys("abc@def.com");
		WebElement pass = driver.findElement(By.xpath("//input[@name='vb_login_password']"));
		pass.sendKeys("QWE123!@qqw");
		WebElement check= driver.findElement(By.id("cb_cookieuser_navbar"));
		check.click();
		WebElement reg= driver.findElement(By.xpath("(//input[@class='button'])[1]"));
		reg.click();	
	}


}
