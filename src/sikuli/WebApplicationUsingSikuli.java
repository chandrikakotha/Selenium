package sikuli;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;

public class WebApplicationUsingSikuli {
	WebDriver driver;
	Screen s=new Screen();
  @Test
  public void sikuliweb() throws InterruptedException, FindFailed {
	  driver.get("https://www.google.com");
	  Thread.sleep(6000);
	  //driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).click();
	  s.click("E:\\screenshots\\silkuli\\gmail.PNG");
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
