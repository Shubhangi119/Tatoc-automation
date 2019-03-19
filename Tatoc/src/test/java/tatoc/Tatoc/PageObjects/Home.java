package tatoc.Tatoc.PageObjects;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
public class Home extends AppTest{
	private WebElement logoimg;
	private WebElement heading;
	private WebElement basic;
	private WebElement basiclinks;
	private static String title;
	private static WebElement form;
	private static WebElement endpage;
	private static WebElement advancedlink;
	
	
	
	
	public boolean verifyHomePageLoaded() {
		 logoimg = driver.findElement(By.cssSelector(".header"));
		return logoimg.isDisplayed();
		//return logoimg.isDisplayed();"
	}
	
	public boolean verifyHeading(){
		heading = driver.findElement(By.cssSelector(".title"));
		String s=heading.getText();
		if(s.equals("T.A.T.O.C"))
			return true;
		
		else return false;
	}
	
	public boolean checkbasic(){
		basic=driver.findElement(By.cssSelector("body:nth-child(2) div.wrapper div.page > a:nth-child(4)"));
		String b=basic.getText();
		if(b.equals("Basic Course"))
			return true;
		else return false;
	}
	public boolean verifyadvancedlink(){
		basic=driver.findElement(By.cssSelector("body:nth-child(2) div.wrapper div.page > a:nth-child(6)"));
		String g=basic.getText();
		if(g.equals("Advanced Course"))
			return true;
		else return false;
	}
	
	public boolean checkbasiclink(){
		basiclinks=driver.findElement(By.cssSelector(".page>h1"));
		String h=basiclinks.getText();
		 if(h.equals("Grid Gate"))
			 return true;
		 else return false;
		
	}
	
	public boolean endPage() {
		endpage =driver.findElement(By.cssSelector(".page>h1"));
		String q =endpage.getText();
		if (q.equals("End"))
			return true;
		else return false;
		
		
	}
	
	public static String checkadvancedlink() {
		advancedlink=driver.findElement(By.cssSelector("body:nth-child(2) div.wrapper div.page > h1:nth-child(1)"));
		String f=advancedlink.getText();
		return f; 
	}
	public boolean verifyframepage() {
		 WebElement FrameHeading =driver.findElement(By.xpath("//h1[contains(text(),'Frame Dungeon')]"));
		String d= FrameHeading.getText();
		if (d.equals("Frame Dungeon"))
			return true;
		else 
			return false;
	}
	public boolean checkins() {
		WebElement ins = driver.findElement(By.cssSelector("body:nth-child(2) div.wrapper div.page > h3:nth-child(5)"));
		String q=ins.getText();
		if(q.equals("Instructions"))
			return true;
		else
			return false;
	}
	public boolean verifyboxes() {
		WebElement box=driver.findElement(By.cssSelector(".white"));
		return box.isDisplayed();
	}
	public boolean errorpage() {
		WebElement err=driver.findElement(By.cssSelector("body:nth-child(2) div.wrapper div.page > h1.error:nth-child(1)"));
		String c= err.getText();
		if (c.equals("Error"))
		return true;
		else 
			return false;
	}
	public boolean taphead() {
		WebElement tap = driver.findElement(By.cssSelector("body:nth-child(2) div.wrapper div.footer > span:nth-child(1)"));
		  String v= tap.getText();
		 if(v.equals("TAP Group:"))
			 return true;
		 else return false;

	}
	public boolean sitehead() {
		WebElement tap = driver.findElement(By.cssSelector("body:nth-child(2) div.wrapper div.footer > span:nth-child(3)"));
		  String v= tap.getText();
		 if(v.equals("| Site Admin: Ramandeep"))
			 return true;
		 else return false;

	}
	public boolean checkpro() {
		WebElement pro =driver.findElement(By.cssSelector("body:nth-child(2) div.wrapper div.page > h1:nth-child(1)"));
		return pro.isDisplayed();
	}
	
	public boolean dragbox() {
		WebElement drg=driver.findElement(By.xpath("//div[contains(text(),'DROPBOX')]"));
		return drg.isDisplayed();
	}
	public boolean checkform(){
		
		 form=driver.findElement(By.id("name"));
		return form.isDisplayed();
	}
 public static void  clickrepaint(){
	 driver.switchTo().frame("main");
	 String b1 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]")).getAttribute("class");
	 
	 String b2;
 do {
	 driver.switchTo().frame("child");
	  b2 = driver.findElement(By.xpath("//div[contains(text(),'Box 2')]")).getAttribute("class");
	 driver.switchTo().parentFrame();
	 if(b1.equals(b2)) {
     driver.findElement(By.cssSelector("body:nth-child(2) center:nth-child(1) > a:nth-child(7)")).click();
	 }
	 else {
		 driver.findElement(By.xpath("//a[contains(text(),'Repaint Box 2')]")).click();
	 }
 } while(!(b1.equals(b2)));
	 
	 title =driver.getTitle();   
	
 }

	

}
