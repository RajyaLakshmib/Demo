package ios;

import org.openqa.selenium.Dimension;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class IOSTest extends Baseios {
	
	public void method() {
	
	IOSDriver<IOSElement> driver1 = capabilities();
driver1.findElementByAccessibilityId("").click();

Dimension size = driver1.manage().window().getSize();

int x = size.getWidth()/2;
int starty = (int)(size.getHeight()*0.60);
int endy = (int)(size.getHeight()*0.10);
//driver1.swipe(x,starty,x,endy,2000);
driver.findElementByAccessibilityId("Steppers").click();
	}
	
	

}
