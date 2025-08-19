package testingframework;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class A_Order_Of_Execution {
	WebDriver driver=new ChromeDriver();
	@Test(priority=3)
	public void Zomato() throws InterruptedException {
		driver.get("https://www.Zomato.com");
		Thread.sleep(2000);
	}
	@Test(description="verify the swiggy URL")
	public void swiggy() throws InterruptedException {
		driver.get("https://www.swiggy.com");
		Thread.sleep(2000);
	}
	@Test(enabled=false)
	public void facebook() throws InterruptedException {

		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
	}
	@Test(priority=1)
	public void google() throws InterruptedException {
		driver.get("https://www.google.com");
		Thread.sleep(2000);
	}
	@Test(priority=2)
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
		driver.manage().window().maximize();
	}

}
