package testingframework;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Tab_To_New_Window {
	WebDriver driver;
	@Test
	public void tabnewwindow() throws InterruptedException {
		driver.get("https://www.techlearn.in");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Downloads']")).click();
		Thread.sleep(3000);
		/*WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Download Eclipse']']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);*/
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0,500)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"post-57\"]/div/div/div/div/div/div/section/div[1]/a")).click();
		Thread.sleep(5000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.findElement(By.xpath("//a[@href='https://www.eclipse.org/projects/']")).click();
		Thread.sleep(2000);
		driver.switchTo().window(tabs.get(0));
		driver.findElement(By.xpath("//a[normalize-space()='Jobs']"));
	}
	@Test
	public void tabnewtabs() throws InterruptedException {
		driver.get("https://www.techlearn.in");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(2000);
		driver.get("https:www.google.com");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(2000);
		Set<String>obj=driver.getWindowHandles();
		Object s[]=obj.toArray();
		driver.switchTo().window(s[0].toString());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mega-menu-item-18\"]/a")).click();
	}
	@BeforeTest
	public void beforeTest() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}

}
