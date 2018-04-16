package de.taxfix;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.appium.java_client.remote.MobileCapabilityType;

public class SampleTest {
	
	@Test
	public  void  pureThoughts() throws MalformedURLException {
		
		 DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "");
	    capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.7.2");
	    capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.2");
	    capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ios");
	    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
	    capabilities.setCapability(MobileCapabilityType.APP, "/Users/sakthiganesharumugasami/Documents/appbuild/Taxfix.app");
		    WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
		    driver.findElement(By.xpath("//*[@text='Start your tax return']")).click();
//		    MobileElement element = (MobileElement) driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"Start your tax return\"])[2]"));
//		    element.click();
//			driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"Not now\"]")).click();
//			driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"2015 Begin\"])[2]")).click();

	}

}
