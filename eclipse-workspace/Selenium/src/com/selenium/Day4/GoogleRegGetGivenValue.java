package com.selenium.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleRegGetGivenValue {

	public static void main(String[] args) throws Throwable {
		
		//the input I have given is not printed
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		try {
			driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.sendKeys("Divya");
		
		//WebElement nameEntered = driver.findElement(By.xpath("//input[getAttribute('value')]"));
		//System.out.println(nameEntered);
	
	
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		lastName.sendKeys("Bharath");
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys("qwertyytrewq");
		WebElement pass = driver.findElement(By.xpath("//input[@name='Passwd']"));
		pass.sendKeys("QW12!@er");
		WebElement pass1 = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		pass1.sendKeys("QW12!@er");
		WebElement next = driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		next.click();
		Thread.sleep(2000);
		driver.close();
		
		
	}
	

}
