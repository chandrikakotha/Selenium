package testingframework;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class IsDisplayedIenabledIsselected {
	WebDriver driver;
  @Test
  public void isDisplayed() {
	  driver.get("httgps://www.techlearn.in.admin");
	  boolean lyp = driver.findElement(By.xpath("//a[@class='wp-login-lost-password']")).isDisplayed();
		
	  if(lyp==true)
	  {
		  System.out.println("lost your pass word text is visible");
		  driver.findElement(By.xpath("//a[@class='wp-login-lost-password']"));
	  }
	  else
	  {
		  System.out.println("lost your pass word is not displayed");
	  }
  }
  @Test
	public void verifytextfieldorlinkenabled() {
		driver.get("https://www.techlearn.in/admin");
		
		boolean useremial = driver.findElement(By.xpath("//input[@id='user_login']")).isEnabled();
		
		if(useremial==true)
		{
			System.out.println("Username or Email text field is enabled to the enter username");
			driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("Sindhu");
		}
		
		else
		{
			System.out.println("Username or Email text field is disabled to the enter username");
		
		}
	
	}
	
	
	@Test
	public void verifyradiobuttonsandcheckbox() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
		
		boolean checkbox = driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).isSelected();
		
		if(checkbox==true)
		{
			System.out.println("Remember me check box is Selected");
		}
		
		else
		{
			System.out.println("Remember me check box is Not Selected");
		
		}
	}
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
