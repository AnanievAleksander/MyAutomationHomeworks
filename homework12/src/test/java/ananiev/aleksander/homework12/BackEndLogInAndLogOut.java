package ananiev.aleksander.homework12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import bg.pragmatic.lecture13mvn.waits.utils.WaitForSomeElementCondition;
import bg.pragmatic.lecture13mvn.waits.utils.WaitTool;

public class BackEndLogInAndLogOut {

	private static WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "D:\\WebDrivers\\geckodriver.exe");
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.startup.homepage", "http://shop.pragmatic.bg/admin");
		driver = new FirefoxDriver(profile);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	// Login in shop.pragmatic.bg backend
	@Test
	public void backEndLogin() {
		WaitTool.waitForElementPresent(driver, By.linkText("Login"), 10);
		Assert.assertEquals("Administration", driver.getTitle());
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("admin");
		Assert.assertEquals("Wrong Username", "admin", username.getAttribute("value"));
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("parola");
		Assert.assertEquals("Wrong Username", "parola", password.getAttribute("value"));
		WebElement loginButton = driver.findElement(By.linkText("Login"));
		loginButton.click();
		WaitTool.waitForElement(driver, By.id("dashboard"), 10);
		Assert.assertEquals("Dashboard", driver.getTitle());

	}

	@Test
	public void backEndLogOut() {
		this.backEndLogin();
		WebElement logOutButton = driver.findElement(By.linkText("Logout"));
		logOutButton.click();
		WaitTool.waitForElementPresent(driver, By.linkText("Login"), 10);
		Assert.assertEquals("Administration", driver.getTitle());

	}

	@Test

	public void wrongUserAndPass() {
		WaitTool.waitForElementPresent(driver, By.linkText("Login"), 10);
		Assert.assertEquals("Administration", driver.getTitle());
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("");
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("");
		WebElement loginButton = driver.findElement(By.linkText("Login"));
		loginButton.click();
		Assert.assertEquals("Security PROBLEM", "No match for Username and/or Password.",
				driver.findElement(By.className("warning")).getText());
	}

	@Test

	public void checkElementValues() {
		this.backEndLogin();
		Select rangeDropdown = new Select(driver.findElement(By.id("range")));
		// Get options
		List<String> exspected_options = Arrays
				.asList(new String[] { "Today", "This Week", "This Month", "This Year" });
		List<String> actual_options = new ArrayList<String>();
		for (WebElement option : rangeDropdown.getOptions()) {
			actual_options.add(option.getText());

		}
		System.out.println(actual_options);
		Assert.assertEquals(exspected_options, actual_options);

	}

	@After
	public void tearDown() {

		driver.quit();
		;
	}

}
