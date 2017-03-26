package bg.pragmatic.myautomationframework.frontend;

import java.sql.Driver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import bg.pragmatic.myautomationframework.utils.Browser;
import bg.pragmatic.myautomationframework.utils.enums.Email;
import bg.pragmatic.myautomationframework.utils.enums.FirstName;
import bg.pragmatic.myautomationframework.utils.enums.LastName;
import bg.pragmatic.myautomationframework.utils.enums.Telephone;

public class RegisterAccount {

	public static void openRegisterAcountPage() {
		Browser.driver.get("http://shop.pragmatic.bg/index.php?route=account/register");

	}

	// Enter personal data for user
	public static void enterYourPersonalData(FirstName firstName, LastName lastName, Email eMail, Telephone telephone) {
		Browser.driver.findElement(By.name("firstname")).sendKeys(firstName.getFirstName());
		Browser.driver.findElement(By.name("lastname")).sendKeys(lastName.getLastName());
		Browser.driver.findElement(By.name("email")).sendKeys(eMail.geteMail());
		Browser.driver.findElement(By.name("telephone")).sendKeys(telephone.getTelephone());
		Browser.driver.findElement(By.name("fax")).sendKeys("");
	}

	// Enter user Address
	public static void enterYourAddress() {
		// Fields
		Browser.driver.findElement(By.name("company")).sendKeys("madafaka");
		Browser.driver.findElement(By.name("company_id")).sendKeys("asdfg");
		Browser.driver.findElement(By.name("address_1")).sendKeys("qwerty");
		Browser.driver.findElement(By.name("address_2"));
		Browser.driver.findElement(By.name("city"));
		Browser.driver.findElement(By.name("postcode"));
		// Select elements
		Browser.driver.findElement(By.name("country_id"));
		Browser.driver.findElement(By.name("zone_id"));

	}

	public static void enterYourPassword() {
		// TODO Auto-generated method stub

	}

	public static void areYouWantNewsletter(Boolean newsleter) {
		if (newsleter == true) {
			WebElement yes = Browser.driver
					.findElement(By.xpath("//input[contains(@name,'newsletter')and(contains(@value,'1'))]"));
			yes.click();
			Assert.assertTrue(yes.isSelected());
		} else {
			WebElement no = Browser.driver
					.findElement(By.xpath("//input[contains(@name,'newsletter')and(contains(@value,'0'))]"));
			no.click();
			Assert.assertTrue(no.isSelected());
		}

	}

	public static void checkPrivacyPolicy() {
		WebElement checkBox = Browser.driver.findElement(By.name("agree"));
		if (!checkBox.isSelected())
			checkBox.click();
		Assert.assertTrue(checkBox.isSelected());

	}

	public static void pushContinueButton() {
		Browser.driver.findElement(By.xpath("//input[contains(@value,'Continue')]")).click();

	}

	// public static void viewPrivacyPolicy() {
	//
	//
	// }

}
