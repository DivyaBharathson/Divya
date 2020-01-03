package com.selenium.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleGetGivenDetails {
	
	public static void main(String[] args) throws Throwable {
		
		//firstname and username is not getting printed
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		try {
			driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.sendKeys("Divya");
		String x = firstName.getAttribute("Value");
		System.out.println("name: " +x);
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		lastName.sendKeys("Bharath");
		String x1 = lastName.getAttribute("value");
		System.out.println(x1);
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys("qwertyytrewq");
		String x2 = userName.getAttribute("Value");
		System.out.println(x2);
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='Passwd']"));
		pass.sendKeys("QW12!@er");
		String x3 = pass.getAttribute("value");
		System.out.println(x3);
		
		WebElement pass1 = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		pass1.sendKeys("QW12!@er");
		String x4 = pass1.getAttribute("value");
		System.out.println(x4);
		
		WebElement next = driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		next.click();
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
