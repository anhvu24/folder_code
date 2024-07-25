package base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	public static final String url = "http://14.176.232.213/mobilevn/";
	public Random rd;
	public WebDriverWait wait;
	public int random = (int) Math.floor(((Math.random() * 899999999) + 100000000));
	public WebDriver driver;
	public String firstWindown;
	
	public void switchToWindownHandle() {
		firstWindown = driver.getWindowHandle();
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
	}
	
	public void switchBackToFirstWindown() {
		driver.switchTo().window(firstWindown);
	}
	
	public void openNewTab() throws AWTException {
		Robot robot = new Robot();                      	
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyRelease(KeyEvent.VK_N);
	}
	
	public void openLink() {
		driver.get(url);
	}
	
	@BeforeClass
	public void setup() {
			System.setProperty("webdriver.chrome.driver", "D:\\CODE\\WebDriver\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		}
	
	@AfterClass
	public void quit() throws Exception {
		driver.quit();
	}
}
