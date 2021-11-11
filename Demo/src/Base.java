import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Base {

	public static AndroidDriver capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
		
		//Appium code
	File f = new File("src");
	File fs = new File(f,"ApiDemos-debug.apk");

	DesiredCapabilities  cap = new DesiredCapabilities();
	//cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
	//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Google Pixel3");
	
	cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
	//cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
	
	
	// Set URL of the application under test
	 cap.setCapability("app", "bs://14da055760edba1535ca1b4860bd8b5699cf2a1e");
     
    
    // Specify device and os_version for testing
    cap.setCapability("device", "Google Pixel 3");
    cap.setCapability("os_version", "9.0");
      
    // Set other BrowserStack capabilities
    cap.setCapability("project", "First Java Project");
    cap.setCapability("build", "Java Android");
    cap.setCapability("name", "first_test");
	 cap.setCapability("browserstack.user", "rajyalakshmi3");
     cap.setCapability("browserstack.key", "FZ8nyvtp5xQ7JY8ALnU8");
	
	AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://hub.browserstack.com/wd/hub"), cap);
	
	
	return driver;
	}
	

}
