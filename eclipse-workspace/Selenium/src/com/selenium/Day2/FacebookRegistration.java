package com.selenium.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookRegistration {
	
	//Ran successfully

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divibharath\\eclipse-workspace\\SeleniumDay1\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=1653993517&extra_1=s%7Cc%7C318504235901%7Ce%7Cfacebook%7C&placement=&creative=318504235901&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D1653993517%26adgroupid%3D63066387003%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D1t1%26target%3D%26targetid%3Dkwd-541132862%26loc_physical_ms%3D1007809%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIwIa-kOTo5QIVRh0rCh0gGwJvEAAYASAAEgLZTfD_BwE");
	driver.manage().window().maximize();
	WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
	firstName.sendKeys("Divya");
	WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
	lastName.sendKeys("Bharath");
	WebElement mobile = driver.findElement(By.xpath("//input[@id='u_0_s']"));
	mobile.sendKeys("9840085983");
	WebElement pass1 = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
	pass1.sendKeys("123@Asw23");
	WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	day.click();
	WebElement chooseDate = driver.findElement(By.xpath("(//option[@value='12'])[1]"));
	chooseDate.click();
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	month.click();
	WebElement chooseMonth = driver.findElement(By.xpath("//option[@value='12']"));
	chooseMonth.click();
	WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	year.click();
	WebElement chooseYear = driver.findElement(By.xpath("//option[@value='1988']"));
	chooseYear.click();
	WebElement gender = driver.findElement(By.xpath("//input[@id='u_0_6']"));
	gender.click();
	WebElement signUp = driver.findElement(By.xpath("//button[@name='websubmit']"));
	signUp.click();
	
	
	
	}

}
