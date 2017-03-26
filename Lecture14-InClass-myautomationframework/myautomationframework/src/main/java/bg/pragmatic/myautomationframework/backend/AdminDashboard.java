package bg.pragmatic.myautomationframework.backend;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import bg.pragmatic.myautomationframework.utils.Browser;
import bg.pragmatic.myautomationframework.utils.WaitTool;


public class AdminDashboard {

	public static void verifyTitle(String failureMessage, String expectedTitle) {
		String actualTitle = Browser.driver.getTitle();
		
		Assert.assertEquals(failureMessage, expectedTitle, actualTitle);
	}

	public static void verifyIsAt(String failingMessage) {
		
		WebElement logoutElement = WaitTool.waitForElementPresent(Browser.driver, By.linkText("Logout"), 10);
		Assert.assertNotNull(failingMessage, logoutElement);
	}

}
