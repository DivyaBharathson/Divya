package com.maven.MavenPractise;

import org.junit.AfterClass;
import org.junit.runners.Suite.SuiteClasses;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGSample {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");

	}
	@BeforeGroups
	public void beforeGroups() {
		System.out.println("Before Groups");

	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");

	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");

	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");

	}
	@Test
	public void test1() {
		System.out.println("Test1");

	}
	@Test
	public void test2() {
		System.out.println("Test2");

	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");

	}
	@AfterGroups
	public void afterGroups() {
		System.out.println("After Groups");

	}
	@AfterClass
	public void afterClass() {
		System.out.println("after Class");

	}
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");

	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");

	}
	
}
