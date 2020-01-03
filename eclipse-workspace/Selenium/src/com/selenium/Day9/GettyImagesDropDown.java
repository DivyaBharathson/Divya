package com.selenium.Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettyImagesDropDown {

	public static void main(String[] args) throws Throwable {
		
		//ran successfully
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gettyimages.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement click = driver.findElement(By.xpath("(//div[@ng-click='showOverlay()'])[2]"));
		boolean displayed = click.isDisplayed();
		System.out.println(displayed);
		click.click();
		Thread.sleep(2000);
		WebElement video = driver.findElement(By.xpath("(//label[@class='header-search-bar-dropdown__option-label'])[4]"));
		video.click();
		Thread.sleep(2000);
		driver.close();
		
		
		
	}
	}


