package automationFramework;

import org.testng.annotations.Test;

import utilities.ReadFile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataProviderTest {
	
	public static final String URL = "http://14.176.232.213/mobilevn/";
	WebDriver driver;
	By loca_dangNhapLink = By.xpath("/html/body/header/div/div/div/div[4]/div/div");
	By loca_email = By.xpath("//input[@id='e_p_lg']");
	By loca_matKhau = By.xpath("//input[@id='pass_lg']");
	By loca_dangNhapButton = By.xpath("//input[@id='submit_lg']");
	
  @Test(dataProvider = "Authentication")
  public void f(String username, String password ) {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\CODE\\WebDriver\\ChromeDriver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get(URL);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  driver.findElement(loca_dangNhapLink).click();
	  driver.findElement(loca_email).sendKeys(username);
	  driver.findElement(loca_matKhau).sendKeys(password);
	  driver.findElement(loca_dangNhapButton).click();
	  driver.findElement(loca_dangNhapButton).click();
	  
	  driver.quit();
  }

  
  
  
  @DataProvider(name = "loginData")
  public Object[][] dataProvider() throws Exception {
      ReadFile.setExcelFile(Links.PATH_TO_EXCEL, "LoginTest");
      Object[][] testData = ReadFile.getTestData("invalid");
      return testData;
  }
  
  
  
}
