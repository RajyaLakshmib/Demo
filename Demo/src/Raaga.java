import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Raaga extends Base  {

	
	@Test
	public void ragmethod() throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = capabilities();
		
		driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.TextView[@text= 'rajyalakshmi777@gmail.com']").click();
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(resourceId(\"\"))");
		
		
	}
}
