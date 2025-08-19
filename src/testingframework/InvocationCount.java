package testingframework;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class InvocationCount {
	WebDriver driver;
  @Test
  public void method1() {
	  driver.get("https://www.techlearn.in/admin");
	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("chandrika");
	  driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("vinod3323");
	  driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
	  driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
  }
	  @Test(invocationCount=5)
	  public void method2() {
		  driver.get("https://www.techlearn.in/admin");
		  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("chandrika");
		  driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("vinod3323");
		  driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
		  driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
		  	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
