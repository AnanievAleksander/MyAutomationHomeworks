package ananiev.alex.MyFirstAppiumTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.activation.MailcapCommandMap;

import org.openqa.selenium.remote.DesiredCapabilities;

public class AndroidDriver {
	
	public AndroidDriver driver;
	
	public AndroidDriver(URL url, DesiredCapabilities capabilities) {
		// TODO Auto-generated constructor stub
	}

	public void prepareAndroidForAppium() throws MalformedURLException {
        File appDir = new File("/Users/nishant/Development/AppiumDemo/apps");
        File app = new File(appDir, "Flipkart.3.0.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("device","Android");

        //mandatory capabilities
        capabilities.setCapability("deviceName","Android");
        capabilities.setCapability("platformName","Android");

        //other caps
        capabilities.setCapability("app", app.getAbsolutePath());
        driver =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
	

}
