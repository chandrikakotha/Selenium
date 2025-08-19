package testingframework;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ErrorPageScreenShot {
	WebDriver driver;
  @Test
  public void screenShotoferror() throws IOException {
	  File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("E:\\sreen shots\\New folder\\errorscreenshot.png"));
  }
		 @Test
		  public void techlearn() throws IOException  {
			  driver.get("https://www.techlearn.in/admin");
			  try
			  {
			  driver.findElement(By.id("user_login")).sendKeys("chandrika");
			  driver.findElement(By.xpath("//input[@id='user_passx']")).sendKeys("vinod");
			  driver.findElement(By.xpath("//input[@id='rememberme']")).click();
			  driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
			  driver.findElement(By.xpath("//a[@class='wp-login-lost-password']")).click();	
			  }
			  catch(Exception e)
			  {
				  System.out.println("Error due to:"+e );
				  screenShotoferror();
				  
			  }
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
