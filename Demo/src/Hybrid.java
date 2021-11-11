import java.net.MalformedURLException;
import java.util.Set;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Hybrid extends Base {
	@Test
	public void hybrisMethod() throws MalformedURLException {
	
		AndroidDriver<AndroidElement> driver = capabilities();
		System.out.println(driver.getContext());
		driver.findElementById("").sendKeys("https://www.google.com");
		driver.findElementById("").click();
		
		Set<String> li = driver.getContextHandles();
		for(String s:li) {
			System.out.println(s);
		}
		
		driver.context("");
		//static method setWebcontentDebuggingEnabled
		
	}

}
