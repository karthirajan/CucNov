package com.flipkart.stepdefinition;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resources//Features",
                     glue = "com.flipkart.stepdefinition",
                   plugin = "html:target",
               monochrome = true,
                   dryRun = false,
                     tags = {"@sanity","@Smoke"})

public class TestRunner {
	
	public static void main(String[] args) {
		
		System.out.println("start");
		Result runClasses = JUnitCore.runClasses(Cucumber.class);
		boolean wasSuccessful = runClasses.wasSuccessful();
		System.out.println(wasSuccessful);
		
	}

}
