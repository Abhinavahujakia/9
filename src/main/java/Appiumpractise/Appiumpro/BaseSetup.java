package Appiumpractise.Appiumpro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseSetup {

	public static AndroidDriver<AndroidElement> androidDriver;

	public static AndroidDriver<AndroidElement> setCapabilities(String appName)
			throws MalformedURLException, FileNotFoundException {
		try {
			DesiredCapabilities cap = new DesiredCapabilities();
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\java\\resources\\global.Properties");
			Properties prop = new Properties();
			prop.load(fis);
			File appDir = new File("src");
			File app = new File(appDir, (String) prop.getProperty(appName));
			String device = (String) prop.get("device");
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, device);
			cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
			cap.setCapability(MobileCapabilityType.NO_RESET, "true");
			// "C:\\Users\\Avni\\eclipse-workspace3\\Appiumpro\\src\\GeneralStore_com.androidsample.generalstore.apk");
			androidDriver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
			androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return androidDriver;
	}
}
