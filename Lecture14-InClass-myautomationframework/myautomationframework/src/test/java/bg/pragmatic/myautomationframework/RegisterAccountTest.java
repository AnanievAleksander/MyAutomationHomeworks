package bg.pragmatic.myautomationframework;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import bg.pragmatic.myautomationframework.frontend.RegisterAccount;
import bg.pragmatic.myautomationframework.utils.Browser;
import bg.pragmatic.myautomationframework.utils.enums.Email;
import bg.pragmatic.myautomationframework.utils.enums.FirstName;
import bg.pragmatic.myautomationframework.utils.enums.LastName;
import bg.pragmatic.myautomationframework.utils.enums.Telephone;

public class RegisterAccountTest {

	@Before
	public void init() {
		Browser.setup();
	}

	@Test
	public void correctUserData() {
		RegisterAccount.openRegisterAcountPage();
		Assert.assertEquals("Register Account", Browser.driver.getTitle());
		bg.pragmatic.myautomationframework.frontend.RegisterAccount.enterYourPersonalData(FirstName.ALEX,
				LastName.ALEXLASTNAME, Email.ALEXEMAIL, Telephone.ALEXTELEPHONE);
		RegisterAccount.enterYourAddress();
		RegisterAccount.enterYourPassword();
		RegisterAccount.areYouWantNewsletter(true);
		RegisterAccount.checkPrivacyPolicy();
		RegisterAccount.pushContinueButton();

	}

	// @Test
	// public void enterYourAddress() {
	// this.enterYouPersonalData();
	// RegisterAccount.enterYourAddress();
	//
	// }
	//
	// @Test
	// public void enterYourPassword() {
	// this.enterYouPersonalData();
	// this.enterYourAddress();
	// RegisterAccount.enterYourPassword();
	// }
	//
	// @Test
	// public void areYouWantNewsletter() {
	// RegisterAccount.areYouWantNewsletter();
	// }
	//
	// @Test
	// public void areYouConfirmPrivacyPolicy() {
	// RegisterAccount.areYouConfirmPrivacyPolicy();
	// }

	// @After
	// public void quit(){
	// Browser.quit();
	//
	// }

}
