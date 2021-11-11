import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;

public class Misellelanious extends Base{
	@Test
	public void mismethod() throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = capabilities();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println(driver.currentActivity()); //App info
//		System.out.println(driver.getContext());//native,web, hybrid
//		System.out.println(driver.getOrientation());//potrait or landscape
//		System.out.println(driver.isDeviceLocked());
		//driver.hideKeyboard();
		
		//driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		//driver.pressKey(AndroidKeyCode.BACK);
		
		
		
		
	}

}
