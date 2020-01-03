package com.selenium.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
public static void main(String[] args) throws Throwable {
	
	//Ran successfully
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement eMail = driver.findElement(By.xpath("//input[@name='email']"));
	eMail.sendKeys("divya.madhan@gmail.com");
	WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
	pass.sendKeys("123@Asd!23");
	WebElement login = driver.findElement(By.xpath("//input[@id='u_0_b']"));
	login.click();;
	
	
}
	}


