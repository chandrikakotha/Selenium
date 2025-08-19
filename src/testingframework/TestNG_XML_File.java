package testingframework;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_XML_File {
	WebDriver driver;
	@Test
	public void Zomato()  {
		driver.get("https://www.Zomato.com");

	}
	@Test
	public void swiggy() throws InterruptedException {
		driver.get("https://www.swiggy.com");
		Thread.sleep(2000);
	}
	@Test
	public void facebook() throws InterruptedException {

		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
	}
	@Test
	public void google() throws InterruptedException {
		driver.get("https://www.google.com");
		Thread.sleep(2000);
	}
	@Test
	public void selenium() throws InterruptedException {
		driver.get("https://www.selenium.dev");
		Thread.sleep(2000);
	}
	@Test
	public void twitter() throws InterruptedException {
		driver.get("https://www.X.com");
		Thread.sleep(2000);



	}

	@BeforeTest
	public void beforeTest() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();		  			  
	}

}
