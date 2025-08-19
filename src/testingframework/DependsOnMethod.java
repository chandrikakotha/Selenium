package testingframework;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class DependsOnMethod {
   WebDriver driver;
  @Test(dependsOnMethods="method2")
  public void method1() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("chandrika.k15@gmail.com");
	   Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("vinod3323");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
	   Thread.sleep(2000);
	   
  }
  @Test
  public void method2() {
  driver.get("https://www.facebook.com");
  }
  
  
  @BeforeTest
  public void beforeClass() {
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
  }
  

}
