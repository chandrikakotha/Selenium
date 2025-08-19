package datadrivenframework;

import org.testng.annotations.Test;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class Data_Driven {
	WebDriver driver;
  @Test
  public void login() throws JXLException, IOException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.techlearn.in/wp-login.php?redirect_to=https%3A%2F%2Fwww.techlearn.in%2Fwp-admin%2F&reauth=1");	
		

		FileInputStream fi=new FileInputStream("E:\\lib\\XL_ sheets\\UserDataValidation.xls");
		Workbook w = Workbook.getWorkbook(fi);
		Sheet s=w.getSheet(0);
		
		for(int i=1; i < s.getRows(); i++)
		{	
			driver.findElement(By.id("user_login")).clear();
			driver.findElement(By.id("user_login")).sendKeys(s.getCell(0, i).getContents());
			driver.findElement(By.id("user_pass")).sendKeys(s.getCell(1, i).getContents());
			driver.findElement(By.id("wp-submit")).click();
			Thread.sleep(3000);
			try
			{
				Thread.sleep(2000);
				
			/*	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log out"))); */
				Actions act = new Actions(driver);
				act.moveToElement(driver.findElement(By.xpath("//*[@id=\"wp-admin-bar-my-account\"]/a"))).build().perform();
				driver.findElement(By.linkText("Log Out")).click();
				System.out.println("PASS");
			}
			catch(Exception e)
			{
				System.out.println("FAIL");
			}
		}    
	}


	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
  
 
