package com.selenium.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensEnquiryForm {

	public static void main(String[] args) throws Throwable {
		
		//Ran successfully
		//Try auto suggestion as well
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement contactUs = driver.findElement(By.xpath("//a[@href='contact.php']"));
		contactUs.click();
		Thread.sleep(5000);
		WebElement name = driver.findElement(By.id("InputName"));
		name.sendKeys("Divya");
		WebElement eMail = driver.findElement(By.id("InputEmail1"));
		eMail.sendKeys("divya.madhan@gmail.com");
		WebElement num = driver.findElement(By.id("InputSubject"));
		num.sendKeys("1234567891");
		WebElement courses = driver.findElement(By.name("courses"));
		courses.click();
		WebElement choose = driver.findElement(By.xpath("(//option[@value='Selenium'])[1]"));
		choose.click();
		WebElement branch= driver.findElement(By.name("branch"));
		branch.click();
		WebElement chooseBranch= driver.findElement(By.xpath("//option[@value='OMR']"));
		chooseBranch.click();
		WebElement plan= driver.findElement(By.name("time"));
		plan.click();
		WebElement choosePlan= driver.findElement(By.xpath("//option[@value='Immediately']"));
		choosePlan.click();
		WebElement cmt = driver.findElement(By.xpath("//textarea[@name='comments']"));
		cmt.sendKeys("Task Day3");
		WebElement send= driver.findElement(By.id("submit"));
		send.click();
		Thread.sleep(2000);
		driver.close();
		
		
	}
	}


