package sikuli;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class FileUpload {
	WebDriver driver;
  @Test
  public void ploadingafile() {
	  driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
	  driver.findElement(By.xpath("//input[@id='myFile']")).sendKeys("C:\\Users\\CSC\\Pictures\\Screenshots\\Screenshot.PNG");
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();  }
  

}
