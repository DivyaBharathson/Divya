package com.selenium.Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PassportForm {

	public static void main(String[] args) throws Throwable {
		
		//Ran successfully
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement location = driver.findElement(By.id("cpvLocationPO"));
		location.click();
		Thread.sleep(2000);
		
		WebElement city = driver.findElement(By.id("dcdrLocation"));
		Select s=new Select(city);
		System.out.println(s.isMultiple());
		s.selectByValue("26");
		System.out.println("the Selected city is ");
		System.out.println();
		
		WebElement givenName = driver.findElement(By.id("givenName"));
		givenName.sendKeys("Divya");
		
		WebElement surName = driver.findElement(By.name("surname"));
		surName.sendKeys("Bharath");
		
		WebElement dob = driver.findElement(By.id("dob"));
		dob.sendKeys("12/12/1988");
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("divya.madhan@gmail.com");
		
		WebElement emailRadio = driver.findElement(By.id("emailloginSameyes"));
		emailRadio.click();
		
		WebElement loginId = driver.findElement(By.id("loginId"));
		loginId.sendKeys("DivyaBharath");
		
		WebElement pwd = driver.findElement(By.id("pwd"));
		pwd.sendKeys("123!@#QWEqwe");
		
		WebElement confirmPwd = driver.findElement(By.id("confirmPwd"));
		confirmPwd.sendKeys("123!@#QWEqwe");
		
		WebElement Hint = driver.findElement(By.id("hintQues"));
		Select s1=new Select(Hint);
		s1.selectByVisibleText("Birth City");
		
		WebElement hintAns = driver.findElement(By.name("hintAns"));
		hintAns.sendKeys("Kanyakumari");
		
		WebElement reg = driver.findElement(By.id("frmSample_register"));
		reg.click();
		
		Thread.sleep(2000);
		
		
		driver.quit();
		
		
	
	}
	
	
}
