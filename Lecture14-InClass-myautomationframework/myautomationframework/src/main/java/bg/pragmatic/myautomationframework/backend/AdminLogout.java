package bg.pragmatic.myautomationframework.backend;


import org.openqa.selenium.By;

import bg.pragmatic.myautomationframework.utils.Browser;
import bg.pragmatic.myautomationframework.utils.WaitTool;
import bg.pragmatic.myautomationframework.utils.enums.Password;
import bg.pragmatic.myautomationframework.utils.enums.Username;

public class AdminLogout {

	public static void logout (){
		
		AdminLogin.open();
		AdminLogin.login(Username.ADMIN, Password.ADMINPASS);
		WaitTool.waitForElement(Browser.driver, By.id("dashboard"), 10);
		Browser.driver.findElement(By.linkText("Logout")).click();
		
	}
}
