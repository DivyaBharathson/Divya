package com.selenium.Day9;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandle {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		String fiD = driver.getWindowHandle();
		System.out.println(fiD);

		WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		// Right Click
		Actions ac = new Actions(driver);
		ac.contextClick(gmail).build().perform();
		Thread.sleep(2000);

		// keyboard actions
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(5000);

		WebElement images = driver.findElement(By.xpath("//a[text()='Images']"));
		ac.contextClick(images).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(10000);

		Set<String> pid = driver.getWindowHandles();
		// gives all the window id's

		System.out.println(pid);
		List<String> li = new ArrayList<String>();
		li.addAll(pid);
//		for (int i = 0; i < li.size(); i++) {
//			driver.switchTo().window(li.get(i));
//			String title = driver.getTitle();
//			System.out.println("index is "+ i +" title is "+ title);
//			
//		}
		driver.switchTo().window(li.get(1));
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("(//a[contains(text(),'Sign in')])[2]")).click();

		
		
//		for (String x : pid) {
//			if (!x.equals(fiD)) {
//				System.out.println(x);
//				driver.switchTo().window(x);
//				Thread.sleep(5000);
//				driver.findElement(By.xpath("(//a[contains(text(),'Sign in')])[2]")).click();
//			}
//		}
//
//		for (String x : pid) {
//			
//			driver.switchTo().window(x);
//			String title = driver.getTitle();
//			if (title.contains("Gmail")) {
//				System.out.println(x);
//				driver.findElement(By.xpath("(//a[contains(text(),'Sign in')])[2]")).click();
//				driver.close();
//			}
//			if (title.contains("Images")) {
//				System.out.println(x);
//
//				driver.findElement(By.name("q")).sendKeys("Mobiles", Keys.ENTER);
//				driver.close();
//			}
//			
//		}

//		for (String x : pid) {
//			driver.switchTo().window(x);
//			String title = driver.getTitle();
//			if (title.contains("Images")) {
//				System.out.println(x);
//
//				driver.findElement(By.name("q")).sendKeys("Mobiles", Keys.ENTER);
//				driver.close();
//			}
//		}

		Thread.sleep(20000);

		driver.quit();

	}

}
