package com.selenium.Day9;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MovetoElementActions {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Move hovers
		Actions ac = new Actions(driver);
		WebElement mensfashion = driver.findElement(By.xpath("(//span[text()=\"Men's Fashion\"])[2]"));
		ac.moveToElement(mensfashion).perform();
		Thread.sleep(3000);
		WebElement backpacks = driver.findElement(By.xpath("(//span[text()='Backpacks'])[1]"));
		//ac.click(backpacks).build().perform();
		backpacks.click();
		Thread.sleep(3000);

		//Screenshot
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(System.getProperty("user.dir")+"\\Library\\Test.png");
		FileUtils.copyFile(temp, des);
		

	
	}

}
