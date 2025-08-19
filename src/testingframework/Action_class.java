package testingframework;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;

public class Action_class {
	WebDriver driver;
	@Test
	public void actionrightclick() throws InterruptedException {
		driver.get("https://www.techlearn.in");
		Thread.sleep(2000);
		Actions act= new Actions(driver);
		act.contextClick(driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]"))).build().perform();
	}
	@Test
	public void actiondoubleclick() throws InterruptedException {
		driver.get("https://www.techlearn.in/code/double-tap/");
		Thread.sleep(2000);
		Actions act= new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//button[@ondblclick='handleDoubleTap()']"))).doubleClick().build().perform();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

	}
	@Test
	public void actiondraganddrop() throws InterruptedException {
		driver.get("https://www.techlearn.in/code/drag-and-drop/");
		Thread.sleep(2000);
		Actions act= new Actions(driver);
		WebElement source=driver.findElement(By.xpath("//img[@id='drag1']"));
		WebElement target=driver.findElement(By.xpath("//div[@id='div1']"));
		act.dragAndDrop(source, target).build().perform();
	}
	@Test
	public void actionmouseover() throws InterruptedException {
		driver.get("https://www.techlearn.in");
		Thread.sleep(2000);
		Actions act= new Actions(driver);
		act.contextClick(driver.findElement(By.xpath("//a[normalize-space()='Tutorials']"))).build().perform();
		driver.findElement(By.xpath("//a[normalize-space()='Sikuli']")).click();
	}
	@Test
	public void actionkeyboardfunction() throws InterruptedException {
		driver.get("https://www.techlearn.in/wp-login.php?");
		Thread.sleep(2000);
		Actions act= new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();
	}
	@Test
	public void actionkeyboard2() throws InterruptedException {
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("tirupathi:"+Keys.ENTER);

	}
	@BeforeClass
	public void beforeClass() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

}
