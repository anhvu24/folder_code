package TestNG_P;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HOTEL {
	
	WebDriver driver;
	
	//Locator
	String loca_checkIn = "check-in";							//id
	String loca_checkOut = "check-out";							//id
	String loca_adult = "adult";								//name
	String loca_children = "children";							//name
	String loca_searchBtn = ".btn-block";						//css
	String loca_viewDetailBtn = ".col-lg-4:nth-child(1) .btn";	//css
	String loca_bookNowBtn = ".btn:nth-child(7)";				//css
	String loca_name = "name";									//id
	String loca_email = "email";								//id
	String loca_phone = "phone";								//id
	String loca_address = "address";							//id
	String loca_term = ".col-lg-6 .custom-control-description";	//css
	String loca_submitBtn = ".col-lg-6 > .btn";					//css
	String loca_cardNumber = "cardNumber";						//id
	String loca_nameOnCard = "ownerName"; 						//id
	String loca_expiryDate = "expiry"; 							//name
	String loca_cvvNumber = "cvvcode"; 							//id
	String loca_payBtn = "input:nth-child(3)"; 					//css
	
	
	
	
	public void search(String checkIn, String checkOut, String adult, String children) {
		driver.findElement(By.id(loca_checkIn)).sendKeys(checkIn);
		driver.findElement(By.id(loca_checkOut)).sendKeys(checkOut);
		driver.findElement(By.name(loca_adult)).sendKeys(adult);
		driver.findElement(By.name(loca_children)).sendKeys(children);
		driver.findElement(By.cssSelector(loca_searchBtn)).click();
	}
	
	public void addInfo(String name, String email, String phone, String address) {
		driver.findElement(By.id(loca_name)).sendKeys(name);
		driver.findElement(By.id(loca_email)).sendKeys(email);
		driver.findElement(By.id(loca_phone)).sendKeys(phone);
		driver.findElement(By.id(loca_address)).sendKeys(address);
		driver.findElement(By.cssSelector(loca_term)).click();
		driver.findElement(By.cssSelector(loca_submitBtn)).click();
	}
	
	public void payment(String cardNumber, String nameOnCard, String expiryDate, String cvvNumber) {
		driver.findElement(By.id(loca_cardNumber)).sendKeys(cardNumber);
		driver.findElement(By.id(loca_nameOnCard)).sendKeys(nameOnCard);
		driver.findElement(By.name(loca_expiryDate)).sendKeys(expiryDate);
		driver.findElement(By.id(loca_cvvNumber)).sendKeys(cvvNumber);
		driver.findElement(By.cssSelector(loca_payBtn)).click();
	}
	
	
  @Test (priority = 1)
  public void searchRoom() {
	  search("2021/09/11", "2021/09/13", "2", "1");
  }
  
  
  @Test (priority = 2)
  public void bookRoom() {
	  driver.findElement(By.cssSelector(loca_viewDetailBtn)).click();
	  driver.findElement(By.cssSelector(loca_bookNowBtn)).click();
	  addInfo("anh vu", "vu@gamil.com", "1223343434", "VietNam");
	  payment("1234 4567 7890 1111","JOHN DOE","12/35", "123");
	  
	  String expectedMess = "Thank you! Your booking has been placed. We will contact you to confirm about the booking soon.";
	  WebElement confirmMess = driver.findElement(By.xpath("/html/body/section[2]/div/div[1]/div/div"));
	  Assert.assertEquals(expectedMess, confirmMess.getText());
  }
  
 
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "D:\\CODE\\WebDriver\\ChromeDriver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://14.176.232.213:8084/");
	  driver.navigate().forward();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  
  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
