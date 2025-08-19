package testingframework;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class DropDown_options {
	WebDriver driver;
  @Test
  public void dropdown() {
	  driver.get("https://www.redmine.org");
	  driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[2]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"user_mail\"]")).sendKeys("chandrika.k15@gmail.com");
	  Select l=new Select(driver.findElement(By.xpath("//*[@id=\"user_language\"]")));
	  l.selectByContainsVisibleText("Kor");
	 // l.selectByIndex(10);
     // l.selectByValue("hr");
	 // l.selectByVisibleText("Bulgarian (Български)");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
