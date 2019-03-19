package seleniumgrid.seleniumgrid;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.*;
import java.net.MalformedURLException;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Sgrid {
	
	RemoteWebDriver driver;
	String baseUrl, nodeUrl;
	public static String driverpath="Driver/chromedriver";
	@BeforeTest
	public void setup() throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver",driverpath);
		//ChromeOptions options = new ChromeOptions();
		// options.addArguments( "--headless","window-size=1024,768", "--no-sandbox");;
//		driver=new ChromeDriver();
		baseUrl ="http://newtours.demoaut.com/";
		nodeUrl="http://10.0.13.121:5556/wd/hub";
		DesiredCapabilities capability=DesiredCapabilities.chrome();
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.LINUX);
	     driver = new RemoteWebDriver(new URL(nodeUrl),capability);
	    
	}
	


@Test
public void simpleTest() {
	
		driver.get(baseUrl);
    Assert.assertEquals("Welcome: Mercury Tours",driver.getTitle());		
	}

@AfterTest
public void aftertest() {
	driver.quit();
}
	
}

