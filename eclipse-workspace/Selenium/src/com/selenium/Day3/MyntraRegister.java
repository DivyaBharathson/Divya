package com.selenium.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraRegister {

	public static void main(String[] args) throws Throwable {
		
		//Ran successfully
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement eMail = driver.findElement(By.xpath("//input[@name='email']"));
		eMail.sendKeys("abc@def.com");
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("QWE123!@qqw");
		WebElement num = driver.findElement(By.xpath("//input[@name='mobile']"));
		num.sendKeys("1234567891");
		WebElement radio= driver.findElement(By.xpath("//input[@id='female']"));
		radio.click();
		WebElement reg= driver.findElement(By.xpath("//button[@class='register-register-button']"));
		reg.click();
		Thread.sleep(2000);
		driver.close();
	}
	

}
