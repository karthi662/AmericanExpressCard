package org.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

	public static WebDriver driver;
	public static ChromeOptions options;
	public static Select select;

	public static void browerLaunch() {
		WebDriverManager.chromedriver().setup();
		options = new ChromeOptions();
		options.addArguments("--disable-cookies");
		driver = new ChromeDriver(options);

	}

	public static void maximize() {
		driver.manage().window().maximize();

	}

	public static WebElement element(By locator) {
		return driver.findElement(locator);

	}

	public static void url(String url) {
		driver.get(url);

	}

	public static String Title() {
		String title = driver.getTitle();
		return title;

	}

	public static void geturl() {
		System.out.println(driver.getCurrentUrl());

	}

	public static void fill(By ele, String name) {
		driver.findElement(ele).sendKeys(name);

	}

	public static void click(By id) {
		driver.findElement(id).click();

	}

	public static void close() {
		driver.close();

	}

	public static void quit() {
		driver.quit();

	}

	public static void click(WebElement element) {
		element.click();

	}

	public static WebElement waitForElementToBePresent(By element, long timeoutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
		return wait.until(ExpectedConditions.presenceOfElementLocated(element));
	}

	public static WebElement waitForElementToBeClickable(By element, long timeoutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void jsClick(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);

	}

	public static void selectByValue(WebElement ele, String value) {

		select = new Select(ele);
		select.selectByValue(value);

	}

	public static void selectByInedex(WebElement ele, int index) {

		select = new Select(ele);
		select.selectByIndex(index);

	}

	public static void selectByVisibleText(WebElement ele, String text) {

		select = new Select(ele);
		select.selectByVisibleText(text);

	}

}
