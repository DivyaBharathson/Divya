package com.maven.MavenPractise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.record.RightMarginRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FlipkartTestNG extends SeleniumBaseClass {

	@BeforeSuite
	public void beforeSuite() throws Throwable {

		browserLaunch("chrome");

	}

	@Test(enabled = false)
	public void testCase() throws Throwable {

		getUrl("https://www.flipkart.com/");
		WebElement close = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		clickOnTheElement(close);

		WebElement emptySpace = driver.findElement(By.xpath("(//div[@class='_1S7OK2'])[1]"));
		
		List<String> li=new ArrayList<String>();

		List<WebElement> menus = driver.findElements(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']"));

		for (WebElement singleMenu : menus) {

			String text = singleMenu.getText();
			if (text.isEmpty()) {
				continue;
				} 
			else {
				System.out.println(text);

				//mouseOver(singleMenu);
				
				clickOnTheElement(singleMenu);

				List<WebElement> subMenus = driver.findElements(By.xpath("(//li[@class='_1KCOnI _2BfSTw _1h5QLb _3ZgIXy'])"));

				for (WebElement singleSubMenu : subMenus) {

					clickOnTheElement((singleMenu));

					if (singleSubMenu.getText().isEmpty()) {
						continue;
					}
					else {
						li.add(singleSubMenu.getText());
					}

					clickOnTheElement(emptySpace);

				}
				for (int i = 0; i < li.size(); i++) {
					writeToExcel("Flipkart", i, 0, li.get(i));
				}
			}
		}
		driver.close();

	}

	@Test
	public void testCase1() throws Throwable {

		getUrl("https://www.amazon.in/");
		clickOnTheElement(driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")));
		clickOnTheElement(driver.findElement(By.xpath("//div[contains(text(),'TV, Appliances, Electronics')]")));
		List<WebElement> electronicsMenu = driver
				.findElements(By.xpath("(//a[@class='hmenu-item'])//following-sibling::div"));

		

		List<String> li = new ArrayList<String>();
		for (WebElement subElectronicsMenu : electronicsMenu) {

			String textFromMenu = subElectronicsMenu.getText();
			WebElement menu = driver.findElement(By.xpath("//div[contains(text(),'" + textFromMenu + "')]"));

			if (textFromMenu.isEmpty()) {
				continue;
			} else
				li.add(textFromMenu);
		}
		System.out.println(li.size());
		for (int i = 0; i < li.size(); i++) {

			WebElement menu = driver.findElement(By.xpath("//div[contains(text(),'" + li.get(i) + "')]"));
			clickOnTheElement(menu);
			List<WebElement> brandName = driver.findElements(By.xpath("//div[@class='acs-ln-links']//following-sibling::a"));
			for (WebElement eachBrand : brandName) {

				waitForElementVisiblity(eachBrand);
				clickOnTheElement(eachBrand);
				WebElement product = driver.findElement(By.xpath("(//img[@class='s-access-image cfMarker'])[1]"));
				ScrollToElement(product);
				clickOnTheElement(product);
				WebElement product1 = driver.findElement(By.id("productTitle"));
				writeToExcel(li.get(i), 0, 0, product1.getText().trim());
				WebElement productPrice = driver.findElement(By.id("priceblock_dealprice"));
				writeToExcel(li.get(i), 0, 1, productPrice.getText().trim());
				clickOnTheElement(driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")));
				clickOnTheElement(driver.findElement(By.xpath("//div[contains(text(),'TV, Appliances, Electronics')]")));
				clickOnTheElement(menu);
				
			}
			clickOnTheElement(driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")));
			clickOnTheElement(driver.findElement(By.xpath("//div[contains(text(),'TV, Appliances, Electronics')]")));
		}
		for (int i = 0; i < li.size(); i++) {

			writeToExcel("Amazon", i, 0, li.get(i));

		}

	}

	@AfterSuite
	private void afterSuite() {
		driver.quit();

	}
}
