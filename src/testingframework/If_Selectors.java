package testingframework;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class If_Selectors {
	WebDriver driver;
	@Test
	public void isdisplayed() {
		driver.get("https://www.techlearn.in/admin");
		boolean lostpass=driver.findElement(By.xpath("//a[@class='wp-login-lost-password']")).isDisplayed();
		if(lostpass==true)
		{
			System.out.println("Lost your password is visible");
			driver.findElement(By.xpath("//a[@class='wp-login-lost-password']")).click();
		}
		else
		{
			System.out.println("lost your password is not visible");

		}

	}
	@Test
	public void isenabled() {
		driver.get("https://www.techlearn.in/admin");
		boolean userid=driver.findElement(By.xpath("//input[@id='user_login']")).isEnabled();
		if(userid==true)
		{
			System.out.println("user name is enabled");
			driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("chandrika");
		}
		else
		{
			System.out.println("user name is not enabled");

		}

	}
	@Test
	public void isselected() {
		driver.get("https://www.techlearn.in/admin");
		driver.findElement(By.xpath("//input[@id='rememberme']")).click();
		boolean checkbox=driver.findElement(By.xpath("//input[@id='rememberme']")).isSelected();
		if(checkbox==true)
		{
			System.out.println("checkbox is selected");
		}
		else
		{
			System.out.println("checkbox  is not selected");

		}

	}
	@BeforeTest
	public void beforeTest() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();  }

}
