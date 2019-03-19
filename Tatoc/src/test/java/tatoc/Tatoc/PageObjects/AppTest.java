package tatoc.Tatoc.PageObjects;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AppTest {

	

		public static WebDriver driver;
		public static String driverpath="ChromeDriver/chromedriver";
		
		
		
		static public void setup() {
			System.setProperty("webdriver.chrome.driver",driverpath);
			//ChromeOptions.addArguments("--headless", "window-size=1024,768", "--no-sandbox");
			driver=new ChromeDriver();
			driver.get("http://10.0.1.86/tatoc");
			 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		}
    
		static public void quitBrowser() {
			driver.quit();
		}
		
}
