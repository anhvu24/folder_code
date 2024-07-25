package TestNG_P;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class FinalExam {
	
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception {	 
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);	       
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);	          
		File DestFile=new File(fileWithPath);	               
		FileUtils.copyFile(SrcFile, DestFile);
		}

	WebDriver driver;
	By loca_logInBtn = By.cssSelector(".col-6 li:nth-child(2) > a");
	By loca_userName = By.cssSelector(".input-group:nth-child(2) > .form-control");
	By loca_passWord = By.cssSelector("#password");
	By loca_signInBtn = By.cssSelector(".text-right:nth-child(5) > .btn");
	
	By loca_checkIn = By.cssSelector("#check-in");
	By loca_checkOut = By.cssSelector("#check-out");
	By loca_adult = By.cssSelector(".col-sm-4:nth-child(1) .fancy_fild");
	By loca_children = By.cssSelector(".col-sm-4:nth-child(2) .fancy_fild");
	By loca_searchBtn = By.cssSelector(".btn-block");
	
	By loca_viewDetailBtn = By.cssSelector(".col-lg-4:nth-child(1) .btn");
	By loca_bookNowBtn = By.cssSelector(".btn:nth-child(7)");
	
	By loca_name = By.cssSelector("#name");
	By loca_email = By.cssSelector("#email");
	By loca_phone = By.cssSelector("#phone");
	By loca_address = By.cssSelector("#address");
	By loca_term = By.cssSelector(".col-lg-6 .custom-control-description");
	By loca_submitBtn = By.cssSelector(".col-lg-6 > .btn");		
	
	By loca_cardNumber = By.id("cardNumber");			
	By loca_nameOnCard = By.id("ownerName"); 						
	By loca_expiryDate = By.name("expiry"); 							
	By loca_cvvNumber = By.id("cvvcode"); 						
	By loca_payBtn = By.cssSelector("input:nth-child(3)"); 				
	
	public void logIn(String userName, String passWord) {
		driver.findElement(loca_userName).sendKeys(userName);
		driver.findElement(loca_passWord).sendKeys(passWord);
		driver.findElement(loca_signInBtn).click();	
	}
	
	public void search(String checkIn, String checkOut, String adult, String children) {
		driver.findElement(loca_checkIn).sendKeys(checkIn);
		driver.findElement(loca_checkOut).sendKeys(checkOut);
		driver.findElement(loca_adult).sendKeys(adult);
		driver.findElement(loca_children).sendKeys(children);
		driver.findElement(loca_searchBtn).click();
	}
	
	public void selectRoomPage() {
		driver.findElement(loca_viewDetailBtn).click();
		driver.findElement(loca_bookNowBtn).click();		
	}
	
	public void addInfo(String name, String email, String phone, String address) {
		driver.findElement(loca_name).clear();
		driver.findElement(loca_name).sendKeys(name);
		driver.findElement(loca_email).clear();
		driver.findElement(loca_email).sendKeys(email);
		driver.findElement(loca_phone).sendKeys(phone);
		driver.findElement(loca_address).sendKeys(address);		
	}
	
	public void bookingRoom(String cardNumber, String nameOnCard, String expiryDate, String cvvNumber) {
		driver.findElement(loca_cardNumber).sendKeys(cardNumber);
		driver.findElement(loca_nameOnCard).sendKeys(nameOnCard);
		driver.findElement(loca_expiryDate).sendKeys(expiryDate);
		driver.findElement(loca_cvvNumber).sendKeys(cvvNumber);
		driver.findElement(loca_payBtn).click();
	}
	
	
	
  @Test (priority = 1, dataProvider = "account")
  public void logInAccount(String userName, String passWord) throws Exception {
	  driver.findElement(loca_logInBtn).click();
	  Thread.sleep(1000);
	  takeSnapShot(driver, "C:\\Users\\Hi\\Desktop\\capture\\logInPage.png"); 
	  logIn(userName, passWord);
	  Thread.sleep(1000);
	  takeSnapShot(driver, "C:\\Users\\Hi\\Desktop\\capture\\searchRoom.png"); 	  
  }
  
   
  //a. Verify that the user could search an “available” room with valid inf
  @Test (priority = 2)
  public void searchRoom() throws Exception {
	  search("2021/09/14", "2021/09/15", "2", "0");
	  Thread.sleep(1000);
	  takeSnapShot(driver, "C:\\Users\\Hi\\Desktop\\capture\\selectRoomPage.png"); 
	  
	  String actualText = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div/div/h2")).getText();
	  Assert.assertEquals(actualText, "Rooms");	  
  }

  
  @Test (priority = 3)
  public void bookRoom() {
	  selectRoomPage();
	  addInfo("Anh Vu", "vu.doan.vtp@gmail.com", "1234441231", "Viet Nam");
	  driver.findElement(loca_term).click();
	  driver.findElement(loca_submitBtn).click();
	  bookingRoom("1234 4567 7890 1111","JOHN DOE","12/35", "123");
	  
	  String actualText = driver.findElement(By.xpath("/html/body/section[2]/div/div[1]/div/div")).getText();
	  Assert.assertEquals(actualText, "Thank you! Your booking has been placed. We will contact you to confirm about the booking soon.");
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\CODE\\WebDriver\\ChromeDriver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://14.176.232.213:8084/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  
  @AfterTest
  public void afterTest() {
//	  driver.close();
  }

   
  @DataProvider
  public Object[][] account() {
    return new Object[][] {
      new Object[] { "doananhvu", "doananhvu123" },
    };
  }
}
