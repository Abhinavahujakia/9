package Appiumpractise.Appiumpro;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AppLoad {
	AndroidDriver<AndroidElement> driver;
	@Test
	public void launch() throws MalformedURLException, FileNotFoundException
	{
		driver=BaseSetup.setCapabilities("generalStore");
		
	}
}
