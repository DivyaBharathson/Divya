package com.selenium.Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IELaunch {

	
		public static void main(String[] args) throws Throwable {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\divibharath\\eclipse-workspace\\SeleniumDay1\\Drivers\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://www.greenstechnologys.com/");
		
		
		//didnt execute from here
		
		
		driver.close();
		//Thread.sleep(1000);
		driver.navigate().to("https://www.facebook.com/");
		driver.close();
		//Thread.sleep(1000);
		driver.navigate().to("http://www.greenstechnologys.com/selenium-course-content.html"); 

		//Thread.sleep(1000);
		driver.close();
	
		
		}
		

}
