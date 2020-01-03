package com.selenium.Day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toolsQA {

	public static void main(String[] args) throws Throwable {
		
		//not working after lastname, maybe after "scrolldown" it will work
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("Divya");
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastname']"));
		lastName.sendKeys("Bharath");
		//WebElement button = driver.findElement(By.xpath("//button[@id='buttonwithclass']"));
		//WebElement button = driver.findElement(By.id("buttonwithclass"));
		//button.click();
		//WebElement gender = driver.findElement(By.xpath("//input[@id='sex-1']"));
		WebElement gender = driver.findElement(By.id("sex-1"));
		gender.click();
		WebElement exp = driver.findElement(By.xpath("//input[@id='exp-4']"));
		exp.click();
		WebElement date = driver.findElement(By.xpath("//input[@id='datepicker']"));
		date.sendKeys("12.12.1988");
		WebElement manual = driver.findElement(By.xpath("//input[@id='profession-0']"));
		manual.click();
		WebElement automation = driver.findElement(By.xpath("//input[@id='profession-1']"));
		automation.click();
		
		//skipping profile pic, because it opens another window
		
		WebElement tool1 = driver.findElement(By.xpath("//input[@id='tool-0']"));
		tool1.click();
		WebElement tool2 = driver.findElement(By.xpath("//input[@id='tool-1']"));
		tool2.click();
		WebElement tool3 = driver.findElement(By.xpath("//input[@id='tool-2']"));
		tool3.click();
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='continents']"));
		dropDown.click();
		WebElement chooseDropDown = driver.findElement(By.xpath("//option[@value='AS']"));
		chooseDropDown.click();
		
		
		List<WebElement> beverages = driver.findElements(By.id("beverages"));
		for (WebElement i : beverages) {
			i.getText();
			System.out.println(i);
		}
		
		
		
	}
	}


