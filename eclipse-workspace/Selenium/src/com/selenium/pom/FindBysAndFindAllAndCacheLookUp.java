package com.selenium.pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class FindBysAndFindAllAndCacheLookUp {
	@CacheLookup
	@FindBy(xpath = "//input[@title='Search for products, brands and more' and @name='q']")
	private WebElement searchFeild;

	@CacheLookup
	@FindBys({ @FindBy(xpath = "//input[@title='Search for products, brands and more']"),
			@FindBy(xpath = "//input[@name='q']") })

	private List<WebElement> search_Bys;

	@CacheLookup
	@FindAll({ @FindBy(xpath = "//input[@title='Search for products, brands and more']"),
			@FindBy(xpath = "//input[@name='q']") })
	private List<WebElement> search_ALL;
	
	

}
