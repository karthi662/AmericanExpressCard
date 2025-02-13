package org.com.runner;

import org.com.pages.BasePage;
import org.com.stepdefinition.JVMReport;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/userRequestCard.feature", plugin = { "pretty",
		"junit:target/cucumber-html-report/cucumber.xml",
		"json:target/cucumber-html-report/cucumber.json" }, glue = "org.com.stepdefinition", dryRun = false, monochrome = true)
public class TestRunner extends BasePage {

	@BeforeClass

	public static void setup() {

		browerLaunch();
		maximize();

	}

	@AfterClass
	public static void tearDown() {
		System.out.println(System.getProperty("user.dir") + "/target/cucumber-html-report/cucumber.json");
		JVMReport.generateReport(System.getProperty("user.dir") + "/target/cucumber-html-report/cucumber.json");
		quit();

	}

}
