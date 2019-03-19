package tatoc.Tatoc.Stepdef;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import tatoc.Tatoc.PageObjects.AppTest;
import tatoc.Tatoc.PageObjects.Home;
public class HomePageStepDef extends AppTest {
	 
	public static String title2;
	static ArrayList <String>tabs2;
	
	public static String title; //	public static WebDriver driver;
//	public static String driverpath="ChromeDriver/chromedriver";
	Home hp= new Home();

//	@BeforeClass
//	public void setup()  {
//		System.setProperty("webdriver.chrome.driver",driverpath);
//		driver=new ChromeDriver();
//		driver.get("http://10.0.1.86/tatoc");
//		
//	}
	
	@Before
		public void webgeturl() {
		driver.get("http://10.0.1.86/tatoc");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	
	@Given("^We are in homepage of website$")
	public void verifyhomepage() {
		Assert.assertEquals(true, hp.verifyHomePageLoaded()); 
	}
	
	@Given("^we are in cookie handling page$")
	public void getcookie() {
		driver.get("http://10.0.1.86/tatoc/basic/cookie#");
	}
	
	@When("^we create token cookie and click on proceed$")
	public void getcookiecreated() {
		driver.findElement(By.xpath("//a[contains(text(),'Generate Token')]")).click(); 
		String cookie = driver.findElement(By.id("token")).getText();
		String[] cookiesplit = cookie.split(": ");

		Cookie newcookie = new Cookie("Token", cookiesplit[1]);

		driver.manage().addCookie(newcookie);
		driver.findElement(By.xpath("//a[contains(text(),'Proceed')]")).click();
	}
	
	@When("^we click the basic course option$")
	public void verifybasicclick() {
	 WebElement basicclick=driver.findElement(By.cssSelector("body:nth-child(2) div.wrapper div.page > a:nth-child(4)"));
		basicclick.click();
	}
	
	@Then("^We see a heading in the top left of the screen$")
	public void verifyheading() {
		Assert.assertEquals(true, hp.verifyHeading());
			
		}
	
	@Then("^We see a option of basic course in the page$")
	public void verifybasiclink() {
		Assert.assertEquals(true, hp.checkbasic());
	}
	@Then("^we are redirected to a new page with heading Grid Gate$")
	public void verifybasiclinkredirection() {
		Assert.assertEquals(true, hp.checkbasiclink());
	}
	
	@Then("^We see a option of advanced course in the page$")
	public void verifyadvancedlink() {
		Assert.assertEquals(true, hp.verifyadvancedlink());
	}
	@When("^we click the advanced course option$")
	public void verifyadvancedclick() {
		WebElement advancedclick=driver.findElement(By.xpath("//a[contains(@href,'/tatoc/advanced')]"));
		advancedclick.click();
	}
	@Then("^we are redirected to a new page with heading Hover menu$")
	public boolean verifyadvancedlinkredirection() {
		String d=Home.checkadvancedlink();
		if (d.equals("Hover Menu"))
			return true;
		else 
			return false;
		
	}
	@Given("^We are in Grid Gate page$")
	public void verifygridgate() {
		driver.get("http://10.0.1.86/tatoc/basic/grid/gate");
		
	}
	@When("^we click the green box$")
	public void clickgreen() {
	 WebElement  greenb= driver.findElement(By.xpath("//div[@class='greenbox']"));
		greenb.click();
	}
	
	
	@Then("^we are redirected to a new page with heading Frame Dungeon$")
	public void checkframeheading() {
		Assert.assertEquals(true, hp.verifyframepage());
	}
	
	@Given("^We are in the frame Dungeon Page$")
	public  void checkframedungeon() {
		driver.get("http://10.0.1.86/tatoc/basic/frame/dungeon");
	}
	@Then("^we see different coloured boxes$")
	public void checkboxes() {
		Assert.assertEquals(true, hp.verifyboxes());
	}
	@When("^we click the red box$")
	public void redbox() {
		WebElement redb=driver.findElement(By.xpath("//div[@class='redbox']"));
	    redb.click();
	}
	@And("^we click on proceed link afterwards to proceed$")
	public void clickproceed() {
		WebElement proc=driver.findElement(By.className("body:nth-child(2) center:nth-child(1) > a:nth-child(9)"));
		proc.click();
	}
	
	
	@Then("^we are redirected to a error page$")
	public void errorp() {
		Assert.assertEquals(true, hp.errorpage());
	}
	
	@Then("^we see different instructions at the page$")
	public void instruc() {
		Assert.assertEquals(true, hp.checkins());
	}
	
	@Then("^We see a heading of Tap Group$")
	public void tapheading() {
		Assert.assertEquals(true, hp.taphead()); 
				 
	}
	@Then("^We see a heading of Site Admin$")
	public void checksiteheading() {
		Assert.assertEquals(true, hp.sitehead());
	}
	
	
	@When("^we click on repaint link till both boxes have same colour$")
	public  void rep() { 
//	//hp.clickrepaint();
//		 driver.switchTo().frame("main");
//		 String b1 = driver.findElement(By.xpath("//div[contains(text(),'Box 1')]")).getAttribute("class");
//		 
//		 String b2;
//	 do {
//		 driver.switchTo().frame("child");
//		  b2 = driver.findElement(By.xpath("//div[contains(text(),'Box 2')]")).getAttribute("class");
//		 driver.switchTo().parentFrame();
//		 if(b1.equals(b2)) {
//	     driver.findElement(By.cssSelector("//a[contains[text(),'Proceed')]")).click();
//		 }
//		 else {
//			 driver.findElement(By.xpath("//a[contains(text(),'Repaint Box 2')]")).click();
//		 }
//	 } while(!(b1.equals(b2)));
//		 
//		 title =driver.getTitle();   
//		
//	 }
		driver.switchTo().frame("main");
		String color = driver.findElement(By.xpath("//div[contains(text(),'Box 1')]")).getAttribute("class");

		String color2;
		do {
		driver.switchTo().frame("child");
		color2 = driver.findElement(By.xpath("//div[contains(text(),'Box 2')]")).getAttribute("class");
		driver.switchTo().parentFrame();
		if(color.equals(color2)) {

		driver.findElement(By.xpath("//a[contains(text(),'Proceed')]")).click();

		}
		else {

		driver.findElement(By.xpath("//a[contains(text(),'Repaint Box 2')]")).click();

		}

		}while(!(color.equals(color2)));

		title = driver.getTitle();
	
	}
	@Then("^end page is displayed$")
	public void endpage() {
		Assert.assertEquals(true, hp.endPage());
	}
	
	@Then("^we are redirected on drag page$")
	public void Checkdrag() {
		//if (title.equals("Drag - Basic Course - T.A.T.O.C")) 
		Assert.assertEquals(title, "Drag - Basic Course - T.A.T.O.C");
	}
	
	@When("^we drag the divisions$")
	
	public void dragdop() {
		Actions act=new Actions(driver);
		WebElement drg1=driver.findElement(By.xpath("//div[contains(text(),'DROPBOX')]"));
		WebElement drg2=driver.findElement(By.xpath("//div[contains(text(),'DRAG ME')]"));
		act.dragAndDrop(drg2, drg1).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'Proceed')]")).click();
	}
	
	@When("^We click on proceed link$")
	public void clickpr() {
		
		driver.findElement(By.xpath("//a[contains(text(),'Proceed')]")).click();
		//pro.click();
	}
	
	
	@Given("^We are in the drag page$")
	public void drag() {
		driver.get("http://10.0.1.86/tatoc/basic/drag");
	}
	@Then("^we see a dropbox in the page$")
	public void dragdrop() {
		Assert.assertEquals(true,hp.dragbox());
	}
	@Given("^we are in PopUp windows page$")
	public void win() {
	driver.get("http://10.0.1.86/tatoc/basic/windows");
	}  
	@When("^we click the Launch window link$")
	public void launchclick() {
		WebElement launch =driver.findElement(By.cssSelector("body:nth-child(2) div.wrapper div.page > a:nth-child(4)"));
		launch.click();
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		title2= driver.getTitle();
	}

	@Then("^we are redirected to a form page$")
	public void checkred() {
		Assert.assertEquals(true, hp.checkform());
	}
	@Then("^we click to proceed for getting redirected to new page$")
	public void clickpro() {
		Assert.assertEquals(true, hp.checkpro());
	}
}

	
	
	

