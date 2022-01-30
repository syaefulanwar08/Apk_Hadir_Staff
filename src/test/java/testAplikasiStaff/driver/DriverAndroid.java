package testAplikasiStaff.driver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DriverAndroid {

	private static AndroidDriver<MobileElement> driver;

	public static AndroidDriver<MobileElement> getDriver() throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("uuid", "Z5L7NJT45PHADYNJ");
		capabilities.setCapability("platform", "Android");
		capabilities.setCapability("automationName", "UiAutomator2");
		capabilities.setCapability("appPackage", "com.example.attend_app");
		capabilities.setCapability("appActivity", "com.example.attend_app.MainActivity");
		capabilities.setCapability("autoGrantPermissions", true);
		capabilities.setCapability("unicodeKeyboard", true);
//		capabilities.setCapability("resetKeyboard", true);
			
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AndroidDriver<MobileElement>(url, capabilities);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}
	
}
