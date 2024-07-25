package TestNG_P;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Ebank {
	
	 WebDriver driver;
	
  @Test
  public void logIn() {
	  
	  WebElement user = driver.findElement(By.xpath("//p[3]/input"));
	  user.sendKeys("10000002");
	  
	  WebElement pass = driver.findElement(By.xpath("//p[5]/input"));
	  pass.sendKeys("abc12345");
	  
	  driver.findElement(By.xpath("//p[6]/input")).click();
	  
	  WebElement a = driver.findElement(By.cssSelector("h3:nth-child(3)"));
	  String b = a.getText();
	  if(b == "Trong mục này") {
		  System.out.println("Dang nhap thanh cong");
	  }
	  
  }	
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "D:\\CODE\\WebDriver\\ChromeDriver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
	  driver.get("http://14.176.232.213:8080/EBankingWebsite/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
  }


  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
