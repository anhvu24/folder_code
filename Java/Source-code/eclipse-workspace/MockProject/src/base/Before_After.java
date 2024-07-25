package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Before_After {
	
	public static final String URL = "http://14.176.232.213/mobilevn/";
	protected WebDriver driver;
	
	
  @BeforeMethod
  public void openBrowser() {
	  System.setProperty("webdriver.chrome.driver", "D:\\CODE\\WebDriver\\ChromeDriver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get(URL);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
  }

  @AfterMethod
  public void closeBrowser() {
	  driver.quit();
	  
  }

}
