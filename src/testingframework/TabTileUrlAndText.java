package testingframework;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class TabTileUrlAndText {
	WebDriver driver;
	@Test
	public void tab() {
		driver.get("https://www.google.com");
		String expcUrl="Google";
		String actualUrl=driver.getTitle();
		Assert.assertEquals(expcUrl, actualUrl);
	}
	@Test
	public void taburl() {
		driver.get("https://www.google.com");
		String expcUr="https://www.google.com/";
		String actualUr=driver.getCurrentUrl();
		Assert.assertEquals(expcUr, actualUr);
	}
	@Test
	public void tabapplication() {
		driver.get("https://swiggy.com");
		String expctext="Swiggy Corporate";
		String actualtex= driver.findElement(By.xpath("//a[contains(text(),'Swiggy Corporate')]")).getText();
		Assert.assertEquals(expctext, actualtex);

	}
	@BeforeTest
	public void beforeTest() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

}
