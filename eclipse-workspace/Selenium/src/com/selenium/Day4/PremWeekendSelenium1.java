package com.selenium.Day4;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PremWeekendSelenium1 {

	public static void main(String[] args) throws InterruptedException {

		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	    WebElement username = driver.findElement(By.id("email"));
	    boolean displayed = username.isDisplayed();
	    System.out.println(displayed);
		boolean enabled = username.isEnabled();
		System.out.println(enabled);
		if (displayed&&enabled) {
			username.clear();
			username.sendKeys("divya.madvem@gmail.com");
			String text = username.getText();
			System.out.println("Text is "+ text);
			String attribute = username.getAttribute("value");
			System.out.println("Attribute "+ attribute);
	}
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select dayDD = new Select(day);
		dayDD.selectByIndex(5);
		

		
		Select monthDD = new Select(month);
		
		WebElement beforeSelect = monthDD.getFirstSelectedOption();
		System.out.println("Before select "+ beforeSelect.getText());
		
		monthDD.selectByValue("6");
		
		
		List<WebElement> options = monthDD.getOptions();
		for (WebElement x : options) {
			System.out.println(x.getText());
		}
		
		WebElement afterSelect = monthDD.getFirstSelectedOption();
		System.out.println("After select " +afterSelect.getText());
		
		Select yearDD = new Select(year);
		yearDD.selectByVisibleText("2018");
		
		
		
//		Dimension size = username.getSize();
//		System.out.println("Height "+size.getHeight());
//		System.out.println("Width " + size.getWidth());
//		
//		
//		Point location = username.getLocation();
//		System.out.println(" x " + location.getX());
//		System.out.println(" y " + location.getY());
		//		
//		WebElement pass = driver.findElement(By.id("pass"));
//		pass.sendKeys("123456");
//		WebElement logIn = driver.findElement(By.xpath("//input[@id='u_0_b']"));
//		logIn.click();
//		
//		WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
//		radio.click();
//		boolean selected = radio.isSelected();
//		drive
		
		
		
//		WebElement gmail = driver.findElement(By.xpath("(//a[@data-pid='23'])[1]"));
//		String text = gmail.getText();
//		System.out.println(text);
//		
//		driver.findElement(By.name("q")).sendKeys("Movies");
//		Thread.sleep(2000);
//		List<WebElement> autosuggestion
//		= driver.findElements(By.xpath("//span[contains(text(),'movies')]"));
//		for (WebElement x : autosuggestion) {
//			System.out.println(x.getText());
//		}
//		
		
		
		
	}

}
