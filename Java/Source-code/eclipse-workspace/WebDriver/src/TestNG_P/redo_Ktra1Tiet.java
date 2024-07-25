package TestNG_P;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class redo_Ktra1Tiet {
	
	WebDriver driver;

	By loca_username = By.cssSelector("#username");
	By loca_password = By.cssSelector("#password");
	By loca_logInBtn = By.cssSelector("#login");
	
	By loca_location = By.cssSelector("#location");
	By loca_hotels = By.cssSelector("#hotels");
	By loca_roomType = By.cssSelector("#room_type");
	By loca_numberOfRoom = By.cssSelector("#room_nos");
	By loca_ciDate = By.cssSelector("#datepick_in");
	By loca_coDate = By.cssSelector("#datepick_out");
	By loca_adultPerRooom = By.cssSelector("#adult_room");
	By loca_childPerRoom = By.cssSelector("#child_room");
	By loca_searchBtn = By.cssSelector("#Submit");
	
	By loca_selectBtn = By.cssSelector("#radiobutton_0");
	By loca_continueBtn = By.cssSelector("#continue");
	
	By loca_firstName = By.cssSelector("#first_name");
	By loca_lastName = By.cssSelector("#last_name");
	By loca_address = By.cssSelector("#address");
	By loca_creditNo = By.cssSelector("#cc_num");
	By loca_creditType = By.cssSelector("#cc_type");
	By loca_expiryMonth = By.cssSelector("#cc_exp_month");
	By loca_expiryYear = By.cssSelector("#cc_exp_year");
	By loca_cvvNumber = By.cssSelector("#cc_cvv");
	By loca_bookNowBtn = By.cssSelector("#book_now");
	
	By loca_orderNo = By.xpath("//*[@id=\"order_no\"]"); 
	
	
  @Test (priority = 1)
  public void logIn() {
	 driver.findElement(loca_username).sendKeys("softwaretesting");
	 driver.findElement(loca_password).sendKeys("abc123");
	 driver.findElement(loca_logInBtn).click();
	 
	 String actualText = driver.findElement(By.cssSelector(".login_title")).getText();
	 Assert.assertEquals(actualText, "Search Hotel (Fields marked with Red asterix (*) are mandatory)");
  }

  @Test (priority = 2)
  public void searchHotel() {
	  Select drop_location = new Select(driver.findElement(loca_location));
	  	drop_location.selectByValue("New York");
	  Select drop_hotels = new Select(driver.findElement(loca_hotels));
	  	drop_hotels.selectByValue("Hotel Creek");
	  Select drop_roomType = new Select(driver.findElement(loca_roomType));
	  	drop_roomType.selectByValue("Standard");
	  Select drop_numberOfRoom = new Select(driver.findElement(loca_numberOfRoom));
	  	drop_numberOfRoom.selectByValue("2");
	  driver.findElement(loca_ciDate).sendKeys("10/09/2021");
	  driver.findElement(loca_coDate).sendKeys("11/09/2021");
	  Select drop_adultPerRooom = new Select(driver.findElement(loca_adultPerRooom));
	  	drop_adultPerRooom.selectByValue("2");
	  Select drop_childPerRoom = new Select(driver.findElement(loca_childPerRoom));
	  	drop_childPerRoom.selectByValue("1");
	  driver.findElement(loca_searchBtn).click();
	  
	  String actualText = driver.findElement(By.cssSelector(".login_title")).getText();
	  Assert.assertEquals(actualText, "Select Hotel");
  }
  
  @Test (priority = 3)
  public void selectHotel() {
	  driver.findElement(loca_selectBtn).click();
	  driver.findElement(loca_continueBtn).click();
	  String actualText = driver.findElement(By.cssSelector("tr:nth-child(2) > .login_title")).getText();
	  Assert.assertEquals(actualText, "Book A Hotel");
  }
  
  @Test (priority = 4)
  public void bookHotel() {
	  driver.findElement(loca_firstName).sendKeys("John");
	  driver.findElement(loca_lastName).sendKeys("John");
	  driver.findElement(loca_address).sendKeys("address 224th, NY, Usa");
	  driver.findElement(loca_creditNo).sendKeys("1234456778901230");
	  Select drop_creditType = new Select(driver.findElement(loca_creditType));
	  	drop_creditType.selectByValue("VISA");
	  Select drop_expiryMonth = new Select(driver.findElement(loca_expiryMonth));
	  	drop_expiryMonth.selectByValue("10");
	  Select drop_expiryYear = new Select(driver.findElement(loca_expiryYear));
	  	drop_expiryYear.selectByValue("2022");
	  driver.findElement(loca_cvvNumber).sendKeys("123");
	  driver.findElement(loca_bookNowBtn).click();
	  
	  String orderNo = driver.findElement(loca_orderNo).getAttribute("value");	//Dùng getAttribute để lấy giá trị của thuộc tính trong Locator
	  Assert.assertNotEquals(orderNo, "");	

	  	
	  	
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\CODE\\WebDriver\\ChromeDriver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://adactinhotelapp.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

 
}
