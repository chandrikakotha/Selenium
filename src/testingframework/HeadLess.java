package testingframework;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class HeadLess {
	 WebDriver driver;

  @Test
  public void optoinheadless() {
	 
	  ChromeOptions co=new ChromeOptions();
	  co.addArguments("headless");
	  driver=new ChromeDriver(co);
	  driver.get("https:www.google.com");
	  
	  String exptab = "Google";
	  
	  String acttab = driver.getTitle();
	  
	  Assert.assertEquals(acttab, exptab);
  }
}
	  
   
 
	