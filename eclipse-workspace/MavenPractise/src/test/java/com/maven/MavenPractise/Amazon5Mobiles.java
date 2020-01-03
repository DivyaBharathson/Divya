package com.maven.MavenPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;

public class Amazon5Mobiles extends SeleniumBaseClass {
	
	public static void main(String[] args) throws Throwable {
		
		browserLaunch("chrome");
		getUrl("https://www.amazon.in/");
		
		AmazonHomePagePOM a=new AmazonHomePagePOM();
		AmazonProductPagePOM b=new AmazonProductPagePOM();
				
		waitForElementVisiblity(a.getSearchBox());
		inputValuesInElement(a.getSearchBox(), "mobile phones for 100000");
		clickOnTheElement(a.getSearchButton());
		int cartTotal=0;
		
		for (int i = 0; i < 20; i++) {
			
			WebElement image = driver.findElement(By.xpath("(//img[@class='s-image'])["+i+"]"));
			clickOnTheElement(image);
			switchToWindows(1);
			waitForElementVisiblity(b.getAddToCart());
			clickOnTheElement(b.getAddToCart());
			waitForElementVisiblity(b.getPriceOfMobile());
			int price = GetttingTextFromElementToInt(b.getPriceOfMobile());
			cartTotal = cartTotal+price;
			if (cartTotal>=500000) {
				driver.quit();
				System.out.println("You have exceeded the given amount");
				break;
			}
			driver.close();
		}
		
		
	}
	
	
	
	

}
