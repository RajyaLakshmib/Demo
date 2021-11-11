import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Gestures extends Base {
	@Test
	public void gesturemethod() throws MalformedURLException, InterruptedException {
		
		
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		Thread.sleep(5000);
		
		//tap
		
		
		WebElement t1 = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		TouchActions action = new TouchActions(driver);
		action.singleTap(t1);
		action.perform();


//		
		// driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']").click();
		 
		
		
	}

	
}
