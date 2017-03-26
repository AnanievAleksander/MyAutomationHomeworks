package bg.pragmatic.myautomationframework;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import bg.pragmatic.myautomationframework.backend.AdminLogin;
import bg.pragmatic.myautomationframework.backend.AdminLogout;
import bg.pragmatic.myautomationframework.utils.Browser;
import bg.pragmatic.myautomationframework.utils.enums.Password;
import bg.pragmatic.myautomationframework.utils.enums.Username;

public class AdminLogoutTest {
		
	
	@Before
	public void init(){
	Browser.setup();
	
	}
	
	@Test
	public void adminLogout(){
		AdminLogout.logout();
		
	}

	@After
	public void quit(){
	Browser.driver.quit();
	}
}
