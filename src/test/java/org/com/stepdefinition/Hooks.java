package org.com.stepdefinition;

import org.com.pages.BasePage;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.Scenario;

public class Hooks extends BasePage {

	@After
	public void screenshotOnFailure(Scenario sc) {
		if (sc.isFailed()) {
			TakesScreenshot screenShot = (TakesScreenshot) driver;
			byte[] screenshotAs = screenShot.getScreenshotAs(OutputType.BYTES);
			sc.attach(screenshotAs, "image/png", sc.getName());
		}

	}
	
}
