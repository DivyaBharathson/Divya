package com.selenium.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonRegister {

	public static void main(String[] args) throws Throwable {
		
		
		//Ran Successfully
		//you may want to try after "Mouse over"
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&switch_account=");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//WebElement signIn = driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
		//signIn.click();
		WebElement create = driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
		create.click();
		WebElement name = driver.findElement(By.xpath("//input[@id='ap_customer_name']"));
		name.sendKeys("Divya Bharath");
		WebElement num = driver.findElement(By.xpath("//input[@id='ap_phone_number']"));
		num.sendKeys("1234567891");
		WebElement eMail = driver.findElement(By.xpath("//input[@id='ap_email']"));
		eMail.sendKeys("abc@def.com");
		WebElement pass = driver.findElement(By.xpath("//input[@id='ap_password']"));
		pass.sendKeys("123ASqwe#");
		WebElement cont = driver.findElement(By.xpath("//input[@id='continue']"));
		cont.click();
		Thread.sleep(2000);
		
		
		
	}

}
