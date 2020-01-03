package com.selenium.Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassportOfficeDetails {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		driver.manage().window().maximize();
		
		System.out.println("The passport Offices are");
		WebElement passOffice = driver.findElement(By.id("dcdrLocation"));
		System.out.println(passOffice.getText());
		
		driver.quit();
	}

}
