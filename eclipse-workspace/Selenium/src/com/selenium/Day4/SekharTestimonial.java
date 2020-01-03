package com.selenium.Day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SekharTestimonial {

	public static void main(String[] args) throws Throwable {
		
		//couldnt find tagname
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/testimonial.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		
		
		
		
		
	
	}

}
