package testing.simulator3;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class mai extends emulato {
	//public static AndroidDriver<AndroidElement> androidDriver;
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement>	driver= fun();
	    WebElement element1= driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']"));
      
	  TouchAction t=new TouchAction(driver);
	  t.tap(tapOptions().withElement(element(element1))).perform();
	  
	  
	  
	  // "(text(/"value/"))"
	  // new ui selector().clickable(true).size
	  
	}

	

}
