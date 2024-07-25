package practiceTestCases;

import org.testng.annotations.Test;
import a.ExcelUtils;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class DataProviderWithExcel_001 {
	
	public static final String URL = "http://14.176.232.213/mobilevn/";
	WebDriver driver;
	By loca_dangNhapLink = By.xpath("/html/body/header/div/div/div/div[4]/div/div");
	By loca_email = By.xpath("//input[@id='e_p_lg']");
	By loca_matKhau = By.xpath("//input[@id='pass_lg']");
	By loca_dangNhapButton = By.xpath("//input[@id='submit_lg']");
	
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "D:\\CODE\\WebDriver\\ChromeDriver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get(URL);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @Test(dataProvider = "Authentication")
  public void f(String username, String password) {
	  driver.findElement(loca_dangNhapLink).click();
	  driver.findElement(loca_email).sendKeys(username);
	  driver.findElement(loca_matKhau).sendKeys(password);
	  driver.findElement(loca_dangNhapButton).click();
	  driver.findElement(loca_dangNhapButton).click();
  }

  @DataProvider
  public Object[][] Authentication() throws Exception {
      Object[][] testObjArray = ExcelUtils.getTableArray("C:\\Users\\Hi\\eclipse-workspace\\DocGhi\\src\\TestData\\TestData.xlsx","Sheet1");
      return (testObjArray);
  }
  
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }
}
