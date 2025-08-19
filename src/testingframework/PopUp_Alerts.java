package testingframework;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class PopUp_Alerts {
	WebDriver driver;
  @Test
  public void accept() throws InterruptedException {
		driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"post-725\"]/div/div/div/div/div/div/div/button")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();

	}
	
	
	@Test
	public void cancel() throws InterruptedException {
		driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"post-725\"]/div/div/div/div/div/div/div/button")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().dismiss();
	}
	
	@Test
	public void acceptname() throws InterruptedException {
		driver.get("https://www.techlearn.in/code/prompt-dialog-box/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"post-748\"]/div/div/div/div/div/div/div/button")).click();
		Thread.sleep(3000);
		
		Alert c = driver.switchTo().alert();
		c.sendKeys("Chandrika");
		c.accept();
		
	
	}
	
	
	@Test
	public void noalert() throws InterruptedException {
		driver.get("https://www.techlearn.in/");
		Thread.sleep(3000);		
		
	}

	


  @BeforeClass
  public void beforeClass() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
