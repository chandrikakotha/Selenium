package testingframework;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.testng.annotations.BeforeTest;

public class ScrollOptions {
	WebDriver driver;
  @Test
  public void scrolldown() throws InterruptedException {
	driver.get("https://www.techlearn.in"); 
	driver.findElement(By.xpath("//a[@class='mega-menu-link'][normalize-space()='Code']")).click();
	Thread.sleep(3000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("scroll(0,500)");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[normalize-space()='Registration']")).click();
	
  }
	 @Test
	  public void scrollwithwebelement() throws InterruptedException {
		driver.get("https://www.techlearn.in");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='mega-menu-link'][normalize-space()='Code']")).click();
		Thread.sleep(3000);
		WebElement ele=(WebElement)driver.findElement(By.xpath("//a[normalize-space()='Registration']"));
		Thread.sleep(3000);
		Coordinates cordinate=((Locatable)ele).getCoordinates();
		cordinate.onPage();
		cordinate.inViewPort();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Registration']")).click();
	
	
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage() .window().maximize();
	  }

}
