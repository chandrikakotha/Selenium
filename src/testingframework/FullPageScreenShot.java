package testingframework;

import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class FullPageScreenShot {
	WebDriver driver;
  @Test
  public void completeScreenShot() throws InterruptedException, IOException {
	  driver.get("https://mvnrepository.com/");
	  Thread.sleep(2000);
	  Screenshot s=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	  ImageIO.write(s.getImage(), "PNG", new File("E:\\sreen shots\\New folder\\fullpagescreenshot.png"));
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();  }

}
