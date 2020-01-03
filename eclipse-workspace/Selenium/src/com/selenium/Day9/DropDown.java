package com.selenium.Day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
//		driver.findElement(By.id("email")).isDisplayed();
//		driver.findElement(By.id("email")).isEnabled();
//		driver.findElement(By.id("email")).clear();
//		driver.findElement(By.id("email")).sendKeys("");
//		
//		
//		WebElement send = driver.findElement(By.id("email"));
//		send.isDisplayed();
//		send.isEnabled();
//		send.clear();
//		send.sendKeys("");
		
		
		
		WebElement singleDD = driver.findElement(By.id("select-demo"));
		Select sc = new Select(singleDD);
		WebElement firstSelectedOption = sc.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println("Before selecting " + text);
		sc.selectByIndex(5);
		System.out.println("After selecting "+ sc.getFirstSelectedOption().getText());
		System.out.println("TO print all the options");
		List<WebElement> options = sc.getOptions();
		for (WebElement x : options) {
			System.out.println(x.getText());
		}
		Thread.sleep(15000);

		System.out.println("Multiple Drop down");
		Select multipleDD = new Select(driver.findElement(By.id("multi-select")));
		System.out.println(sc.isMultiple());
			multipleDD.selectByIndex(5);
			Thread.sleep(3000);

			multipleDD.selectByValue("New York");
			Thread.sleep(3000);

			multipleDD.selectByVisibleText("Florida");
			Thread.sleep(3000);

			multipleDD.selectByVisibleText("California");
			Thread.sleep(3000);

		System.out.println("verify the selected options");
		List<WebElement> allSelectedOptions = multipleDD.getAllSelectedOptions();
		for (WebElement x : allSelectedOptions) {
			System.out.println(x.getText());
		}
		System.out.println(allSelectedOptions.size());
		
		List<WebElement> options2 = multipleDD.getOptions();
		for (WebElement x : options2) {
			System.out.println(x.getText());
		}
		
		//deselect by options
		multipleDD.deselectByIndex(5);
		Thread.sleep(5000);
		multipleDD.deselectAll();
	}
	
	
	
}
