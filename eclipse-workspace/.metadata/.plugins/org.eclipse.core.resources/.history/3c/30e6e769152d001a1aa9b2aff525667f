package com.cucumber.testrunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "com.cucumber.listener.ExtentCucumberFormatter:src\\test\\resource\\com\\cucumber\\reports\\extent.html",

		features = "src\\test\\java\\com\\cucumber\\feature", glue = "com.cucumber.stepdefinition", dryRun = false, tags = {
				"~@Ignore" })
public class TestRunner {

	@AfterClass
	public static void driverQuit() {
		Reporter.loadXMLConfig(new File(
				System.getProperty("user.dir") + "\\src\\test\\resource\\com\\cucumber\\prop\\extent-config.xml"));
	}
}
