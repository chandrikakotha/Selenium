package testingframework;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TimeOut {
	WebDriver driver;
  @Test
  public void method1() throws InterruptedException  {
	  driver.get("https://www.swiggy.com");
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/div/div/ul/li[2]/div/span[2]")).click();
	  Thread.sleep(4000);
  driver.findElement(By.xpath("//input[@id=\"mobile\"]")).sendKeys("9985803323");
  
  		
  }
  
  
	  @Test(timeOut=5000)
	  public void method2()  {
		  driver.get("https://www.swiggy.com");
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/div/div/ul/li[2]/div/span[2]")).click();
	  driver.findElement(By.xpath("//*[@id=\"mobile\"])")).sendKeys("8501019696");
	
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
