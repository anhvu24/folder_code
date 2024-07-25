package practiceTestCases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import utility.ExcelUtils;

public class DataProviderWithExcel_002 {

	private String sTestCaseName;
	private int iTestCaseRow;
	public static final String URL = "http://14.176.232.213/mobilevn/";
	WebDriver driver;
	By loca_dangNhapLink = By.xpath("/html/body/header/div/div/div/div[4]/div/div");
	By loca_email = By.xpath("//input[@id='e_p_lg']");
	By loca_matKhau = By.xpath("//input[@id='pass_lg']");
	By loca_dangNhapButton = By.xpath("//input[@id='submit_lg']");
	
  @BeforeMethod
  public void beforeMethod() throws Exception {
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

  @AfterMethod
  public void afterMethod() {
	   driver.close();
  }

  @DataProvider
  public Object[][] Authentication() throws Exception{

	    // Setting up the Test Data Excel file
	 	ExcelUtils.setExcelFile("D://ToolsQA//OnlineStore//src//testData//TestData.xlsx","Sheet1");
	 	sTestCaseName = this.toString();

	  	// From above method we get long test case name including package and class name etc.
	  	// The below method will refine your test case name, exactly the name use have used
	  	sTestCaseName = ExcelUtils.getTestCaseName(this.toString());

	    // Fetching the Test Case row number from the Test Data Sheet
	    // Getting the Test Case name to get the TestCase row from the Test Data Excel sheet
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	 	
	    Object[][] testObjArray = ExcelUtils.getTableArray("C:\\Users\\Hi\\eclipse-workspace\\DocGhi\\src\\TestData\\TestData.xlsx","Sheet1",iTestCaseRow);
	    	return (testObjArray);
		}

}