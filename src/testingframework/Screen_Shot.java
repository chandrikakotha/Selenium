package testingframework;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Screen_Shot  {
	public void GetScreenshot() throws IOException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MMM_dd HH_mm_ss");
		Date date = new Date();
		String time = dateFormat.format(date);
		System.out.println(time);

		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("E:\\sreen shots\\New folder\\timewise "+ time +".png"));
	}	
	WebDriver driver;
  @Test
  public void screenshotlinebyline() throws InterruptedException, IOException {
	  driver.get("https://www.techlearn.in/admin");
	  driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("chandrika");
	  Thread.sleep(1000);
		GetScreenshot();
		driver.findElement(By.name("pwd")).sendKeys("Hello@123");
		Thread.sleep(1000);
		GetScreenshot();
		driver.findElement(By.id("rememberme")).click();
		Thread.sleep(1000);
		GetScreenshot();
		driver.findElement(By.name("wp-submit")).click();
		Thread.sleep(1000);
		GetScreenshot();
		driver.findElement(By.className("wp-login-lost-password")).click();
		Thread.sleep(1000);		
		GetScreenshot();
	}
	  
	  
  
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
