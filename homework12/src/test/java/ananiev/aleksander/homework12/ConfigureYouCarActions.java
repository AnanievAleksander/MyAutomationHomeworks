package ananiev.aleksander.homework12;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import bg.pragmatic.lecture13mvn.waits.utils.WaitTool;

public class ConfigureYouCarActions {

	private static WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "D:\\WebDrivers\\geckodriver.exe");
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.startup.homepage", "http://pragmatic.bg/automation/lecture13/Config.html");
		driver = new FirefoxDriver(profile);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void selectCheckBoxes() {
		WaitTool.waitForElementPresent(driver, By.id("helpbutton"), 10);
		WebElement airbagCheckBox = driver.findElement(By.xpath("//input[@value='Airbags']"));
		WebElement parkingSensorCheckBox = driver.findElement(By.xpath("//input[@value='ParkingSensor']"));
		if (!airbagCheckBox.isSelected())
			airbagCheckBox.click();
		Assert.assertTrue(airbagCheckBox.isSelected());
		if (!parkingSensorCheckBox.isSelected())
			parkingSensorCheckBox.click();
		Assert.assertTrue(parkingSensorCheckBox.isSelected());

	}

	@After
	public void tearDown() {

		driver.close();
		driver.quit();

	}
}
