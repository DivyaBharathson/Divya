package com.cucumber.stepdefinition;

import java.io.File;

import org.openqa.selenium.TakesScreenshot;

import com.cucumber.baseclass.SeleniumBaseClass;
import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	
	@Before
	public void beforeHook(Scenario scenario) {
		Reporter.addScenarioLog(scenario.getName() + " author : Divya");
	}
	
	@After
	public void afterHook(Scenario scenario) throws Throwable {
		if (scenario.isFailed()) {
			File takeScreenShot = SeleniumBaseClass.takeScreenShot(scenario.getName());
			Reporter.addScreenCaptureFromPath(takeScreenShot.getAbsolutePath());
		}
	}
	
}
