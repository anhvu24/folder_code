package TestNG_P;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class redo_Practice_AUG31 {
	
	WebDriver driver;
	String loca_userName = "p:nth-child(4) > .contact_filed";		//css
	String loca_password = "p:nth-child(6) > .contact_filed";		//css
	String loca_registerBtn = "p:nth-child(7) > input";				//css
		
	//Hàm Log In
	public void logIn(String userName, String passWord) {
		driver.findElement(By.cssSelector(loca_userName)).sendKeys(userName);
		driver.findElement(By.cssSelector(loca_password)).sendKeys(passWord);
		driver.findElement(By.cssSelector(loca_registerBtn)).click();
	}	
	
	//Cau a:	
	//LogIn OK
  @Test(description = "log in with valid account", dataProvider = "valid_account", priority = 0)
  public void LOGIN_005(String userName, String passWord) {
	  logIn(userName, passWord);
	  
	  String accInfo = driver.findElement(By.cssSelector("#j_idt25_header > .ui-panel-title")).getText();
	  Assert.assertEquals(accInfo, "THÔNG TIN TÀI KHOẢN");	  
  }

  @DataProvider (name = "valid_account")
  public Object[][] valid_account() {
    return new Object[][] {
      new Object[] { "anhvutest1", "anhvutest1" },
      new Object[] { "anhvutest2", "anhvutest2" },
    };
  }
  
  //LogIn NOT OK
  @Test(description = "log in without username", priority = 0)
  public void LOGIN_001() {
	  logIn("", "anhvutest1");
	  String errorNoUser = driver.findElement(By.cssSelector(".ui-growl-message > p")).getText();
	  Assert.assertEquals(errorNoUser, "Bạn chưa nhập tài khoản");
  }
  
  @Test(description = "log in without password", priority = 0)
  public void LOGIN_002() {
	  logIn("anhvutest1", "");
	  String errorNoPass = driver.findElement(By.cssSelector(".ui-growl-message > p")).getText();
	  Assert.assertEquals(errorNoPass, "Bạn chưa nhập mật khẩu");
  }
  
  @Test(description = "log in with incorrect username", dataProvider = "incorrectUser", priority = 0)
  public void LOGIN_003(String userName, String passWord) {
	  logIn(userName, passWord);
	  
//	  System.out.println(driver.switchTo().alert().getText());  chỗ ni để hỏi thầy
	  
	  String errorIncorrectUser = driver.findElement(By.cssSelector(".ui-growl-message > p")).getText();		//các locator error_mess giống nhau -> hỏi thầy
	  Assert.assertEquals(errorIncorrectUser, "Tài khoản không tồn tại");
  }
  
  @DataProvider (name = "incorrectUser")
  public Object[][] incorrectUser(){
	  return new Object[][] {
		  new Object[] {"userSai", "anhvutest1"},
		  new Object[] {"userSai", "anhvutest1"},
	  };
  }
  
  @Test(description = "log in with incorrect password", dataProvider = "incorrectPass", priority = 0)
  public void LOGIN_004(String userName, String passWord ) {
	  logIn(userName, passWord);
	  String errorIncorrectPass = driver.findElement(By.cssSelector(".ui-growl-message > p")).getText();
	  Assert.assertEquals(errorIncorrectPass, "Tài khoản không tồn tại");
  }
  
  @DataProvider (name = "incorrectPass")
  public Object[][] incorrectPass(){
	  return new Object[][] {
		  new Object[] {"anhvutest1", "passSai"},
		  new Object[] {"anhvutest2", "passSai"},
	  };
  }
  
  //Cau b:
  @Test(priority = 1)
  public void CauB() {
	  logIn("anhvutest1", "anhvutest1");
	  String accInfo = driver.findElement(By.cssSelector("#j_idt25_header > .ui-panel-title")).getText();
	  Assert.assertEquals(accInfo, "THÔNG TIN TÀI KHOẢN");
  }
  
  //Cau c:
  @Test(priority = 2)
  public void CauC() {
	  logIn("anhvutest1", "anhvutest1");
	  String user = driver.findElement(By.linkText("anh vu")).getText();
	  Assert.assertEquals(user, "anh vu");
  }
  
  @BeforeMethod
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", "D:\\CODE\\WebDriver\\ChromeDriver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://14.176.232.213:8080/EBankingWebsite/faces/infocustomer.xhtml#");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

  
}
