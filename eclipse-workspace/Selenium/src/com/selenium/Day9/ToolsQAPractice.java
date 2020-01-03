package com.selenium.Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToolsQAPractice {

	public static void main(String[] args) throws InterruptedException {
		
		// couldnt be clicked
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.toolsqa.com/automation-practice-form/");
	driver.manage().window().maximize();
	
	WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
	boolean displayed = firstName.isDisplayed();
	System.out.println(displayed);
	boolean enabled = firstName.isEnabled();
	System.out.println(enabled);
	firstName.clear();
	firstName.sendKeys("Divya");
	WebElement lastName = driver.findElement(By.id("lastname"));
	lastName.sendKeys("Bharath");
	try {
		WebElement female = driver.findElement(By.id("sex-0"));
		female.click();
	} catch (Exception e) {
		System.out.println("sex not clicked");
	}
	try {
		WebElement exp = driver.findElement(By.xpath("//input[@id='exp-4']"));
		exp.click();
	} catch (Exception e) {
		System.out.println("Exp not clicked");
	}
	
	WebElement date = driver.findElement(By.xpath("//input[@id='datepicker']"));
	date.sendKeys("12-12-1988");
	
	WebElement check1 = driver.findElement(By.xpath("//input[@id='profession-0']"));
	check1.click();
	
	WebElement check2 = driver.findElement(By.xpath("//input[@id='profession-1']"));
	check2.click();
	
	Thread.sleep(5000);
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	WebElement scrollDown = driver.findElement(By.xpath("//label[contains(text(),'Selenium Commands')]"));
	js.executeScript("arguments[0].scrollIntoView();",scrollDown);
	Thread.sleep(2000);
	
	try {
		WebElement qtp= driver.findElement(By.id("tool-0"));
		qtp.click();
	} catch (Exception e) {
		System.out.println("Qtp checkbox not clicked");
	}
	
	try {
		WebElement seleniumIDE = driver.findElement(By.id("tool-1"));
		seleniumIDE.click();
	} catch (Exception e) {
		System.out.println("Selenium IDE checkbox not clicked");
	}
	
	
	WebElement SingleDD = driver.findElement(By.id("continents"));
	Select s=new Select(SingleDD);
	s.selectByIndex(3);
	
	WebElement multipleDD = driver.findElement(By.id("continentsmultiple"));
	Select s1=new Select(multipleDD);
	System.out.println(s1.isMultiple());
	s1.selectByValue("AF");
	s1.selectByVisibleText("Asia");
	
	WebElement printText1 = driver.findElement(By.xpath("//span[text()='Text1']"));
	System.out.println(printText1.getText());
	
	
			
	
	driver.quit();
		
		
		
		
	
	}

}
