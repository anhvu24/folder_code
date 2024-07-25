package TestNG_P;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Booking {
	WebDriver driver;
	String hotelURL = "http://14.176.232.213:8084/";
	
  @Test(priority = 1)
  public void searchRoom() {
	  	WebElement CI = driver.findElement(By.cssSelector("#check-in"));
	  		CI.sendKeys("2021/08/31");
	  	WebElement CO = driver.findElement(By.cssSelector("#check-out"));
	  		CO.sendKeys("2021/09/02");
	  	WebElement adult = driver.findElement(By.name("adult"));
	  		adult.sendKeys("2");
	  	WebElement children = driver.findElement(By.name("children"));
	  		children.sendKeys("1");
	  	WebElement search_btn = driver.findElement(By.cssSelector(".btn-block"));
	  		search_btn.click();
  }
  
  @Test(priority = 2)
  public void bookRoom() {
	  	WebElement view_btn = driver.findElement(By.cssSelector(".col-lg-4:nth-child(6) .btn"));
	  		view_btn.click();
 
	  	WebElement bookNow_btn = driver.findElement(By.cssSelector(".btn:nth-child(7)"));
	  		bookNow_btn.click();
 
	  	//Add Your Informations:
	  	WebElement name = driver.findElement(By.cssSelector("#name"));
	  		name.sendKeys("JOHN DOE");
		WebElement email = driver.findElement(By.cssSelector("#email"));
			email.sendKeys("john@gmail.com");
		WebElement phone = driver.findElement(By.cssSelector("#phone"));
			phone.sendKeys("111222");
		WebElement address = driver.findElement(By.cssSelector("#address"));
			address.sendKeys("Viet Nam");
		WebElement term = driver.findElement(By.xpath("//*[@id=\"user\"]/div/div[1]/div[5]"));
		 if (term.isSelected() == false) {
             System.out.println("Button chua duoc chon");
             term.click();
         }
			
		WebElement submit_btn = driver.findElement(By.cssSelector(".col-lg-6 > .btn"));
			submit_btn.click();
		
		//Payment 
		WebElement cardNumber = driver.findElement(By.cssSelector("#cardNumber"));
			cardNumber.sendKeys("1234 4567 7890 1111");
		WebElement nameOnCard = driver.findElement(By.cssSelector("#ownerName"));
			nameOnCard.sendKeys("JOHN DOE");
		WebElement expiryDate = driver.findElement(By.name("expiry"));
			expiryDate.sendKeys("12/35");
		WebElement cvvNumber = driver.findElement(By.cssSelector("#cvvcode"));
			cvvNumber.sendKeys("123");
		WebElement payNow = driver.findElement(By.cssSelector("input:nth-child(3)"));
			payNow.click();
}
	  
	  
  @BeforeClass
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "D:\\CODE\\WebDriver\\ChromeDriver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get(hotelURL);
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  }

  
  @AfterClass
  public void afterMethod() {
	  driver.close();
  }

}
