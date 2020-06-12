package typesofLocators.Locators;

import java.util.List;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jdk.internal.util.xml.impl.Input;

public class locatorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium_exe_file\\chromedriver_win32 (11)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
		
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("document.getElementsByName('email').value='123'");
	

		
	}

}
