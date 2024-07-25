package TestNG_P;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E_Commerce {
	
	WebDriver driver;
	
	By loca_themVaoGioBtn = By.cssSelector(".col-md-2:nth-child(2) .btn");
	By loca_datHangNgayBtn = By.cssSelector("#order_product");
	By loca_email = By.cssSelector("#e_p_lg");
	By loca_matKhau = By.cssSelector("#pass_lg");
	By loca_dangNhapBtn = By.cssSelector("#submit_lg");
	By loca_clickDeDangNhapLink = By.xpath("//a[contains(text(),'Click vào đây để đăng nhập')]");
	By loca_gioHangBtn = By.xpath("//div[4]/div/button");
	By loca_matKhauAtDatHang = By.xpath("//input[@id='password_od']");
	By loca_thanhToanBtn = By.xpath("//button[@id='order_success']");
	
	By loca_giamGia = By.xpath("//*[@id=\"view_cart\"]/table/tbody/tr[1]/td[3]/label");	
	By loca_soLuong = By.xpath("//*[@id=\"2\"]");
	By loca_donGia = By.xpath("//*[@id=\"view_cart\"]/table/tbody/tr[1]/td[5]/label");
	By loca_thanhTien = By.xpath("//*[@id=\"view_cart\"]/table/tbody/tr[1]/td[6]/label");
	By loca_tongTien = By.xpath("//*[@id=\"view_cart\"]/table/tbody/tr[2]/td/label/span");
	
	
	
	//Ham Dang Nhap
	public void logIn(String email, String matKhau) {
		driver.findElement(loca_email).sendKeys(email);
		driver.findElement(loca_matKhau).sendKeys(matKhau);
		driver.findElement(loca_dangNhapBtn).click();
		driver.findElement(loca_dangNhapBtn).click();
	}
	
	
  @Test (priority = 1)
  public void ORDER_001() {
	  driver.findElement(loca_themVaoGioBtn).click();
	  driver.findElement(loca_datHangNgayBtn).click();		
	  String requestLoginText = driver.findElement(By.xpath("//div[@id='error_cart']/p")).getText(); 
	  Assert.assertTrue(requestLoginText.contains("Vui lòng đăng nhập mới có thể đặt hàng"));	  
  }
  
  
  @Test (priority = 2)
  public void ORDER_002() {
	  driver.findElement(loca_clickDeDangNhapLink).click();
	  logIn("ktracty2@gmail.com", "abc123");
	  String textAtUserIcon = driver.findElement(By.xpath("/html/body/header/div/div/div/div[4]/div/div/button/span")).getText();	
	  Assert.assertNotEquals(textAtUserIcon, "Đăng Nhập");
  }
    
  
  @Test (priority = 3)
  public void ORDER_003() throws InterruptedException {
	  driver.findElement(loca_gioHangBtn).click();
	  Thread.sleep(3000);

	  int giamGia = Integer.parseInt(driver.findElement(loca_giamGia).getText().replaceAll("[^0-9]",""));
	  int soLuong = Integer.parseInt(driver.findElement(loca_soLuong).getAttribute("value").replaceAll("[^0-9]",""));
	  int donGia = Integer.parseInt(driver.findElement(loca_donGia).getText().replaceAll("[^0-9]",""));
	  int thanhTien = Integer.parseInt(driver.findElement(loca_thanhTien).getText().replaceAll("[^0-9]",""));
	  Assert.assertEquals(thanhTien, (donGia * soLuong - (donGia * giamGia/100) * soLuong));
  }
  
 
  @Test (priority = 4)
  public void ORDER_004() {
	  int soLuong = Integer.parseInt(driver.findElement(loca_soLuong).getAttribute("value").replaceAll("[^0-9]",""));
	  int thanhTien = Integer.parseInt(driver.findElement(loca_thanhTien).getText().replaceAll("[^0-9]",""));
	  int tongTien = Integer.parseInt(driver.findElement(loca_tongTien).getText().replaceAll("[^0-9]",""));	  	  	  
	  Assert.assertEquals(tongTien, thanhTien*soLuong);
  }
 
  
  @Test (priority = 5)
  public void ORDER_005() throws InterruptedException {
	  driver.findElement(loca_datHangNgayBtn).click();		
	  driver.findElement(loca_matKhauAtDatHang).sendKeys("abc123");
	  driver.findElement(loca_thanhToanBtn).click();
	  driver.findElement(loca_thanhToanBtn).click();
	  driver.findElement(loca_thanhToanBtn).click();
	  	  	  
	  Thread.sleep(3000);
	  String orderSuccessMess = driver.findElement(By.xpath("//*[@id=\"success_modal\"]/div/div/div/div/div[1]/h1")).getText();
	  Assert.assertEquals(orderSuccessMess, "Đặt hàng thành công");	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\CODE\\WebDriver\\ChromeDriver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://103.95.199.151/mobilevn/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  
  @AfterTest
  public void afterTest() {
	  driver.close();
  }
  
}
