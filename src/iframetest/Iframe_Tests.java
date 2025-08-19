package iframetest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Iframe_Tests {
	WebDriver driver;
	@Test
	public void iframes() throws InterruptedException {
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		Thread.sleep(2000);
		WebElement obj= driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
		driver.switchTo().frame(obj);
		//driver.switchTo().frame(5);
		//driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//span[@class='w3-hide-medium']")).click();	
	}
	@Test
	public void noframes() throws InterruptedException {
		driver.get("https://www.techlearn.in/");
		Thread.sleep(1000);
		
		WebElement obj = driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
		driver.switchTo().frame(obj); 
		
	//	driver.switchTo().frame(5);
		
		driver.switchTo().frame("iframeResult");
		
	
		
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
