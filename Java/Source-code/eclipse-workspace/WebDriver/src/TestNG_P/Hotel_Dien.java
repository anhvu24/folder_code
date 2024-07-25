package TestNG_P;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.*;

public class Hotel_Dien {
	WebDriver driver;
	String url = "http://14.176.232.213:8084/";
	String check_In = "//*[@id=\"check-in\"]";
	String check_Out = "//*[@id=\"check-out\"]";
	String locator_adult = "/html/body/section[1]/div/div/div/div/div/div/form/div[2]/div[1]/div/input";
	String locator_children = "/html/body/section[1]/div/div/div/div/div/div/form/div[2]/div[2]/div/input";
	String search_button = "/html/body/section[1]/div/div/div/div/div/div/form/div[2]/div[3]/div/input";
	String detailRoom = "/html/body/section[2]/div/div/div[1]/div/div[2]/div/a";
	String book_button = "//*[@id=\"booking\"]/input";
	String book_name = "//*[@id=\"name\"]";
	String book_email = "//*[@id=\"email\"]";
	String book_phone = "//*[@id=\"phone\"]";
	String book_address = "//*[@id=\"address\"]";
	String submit_button = "//*[@id=\"user\"]/div/div[1]/div[6]/input";
	String card_number = "//*[@id=\"cardNumber\"]";
	String card_name = "//*[@id=\"ownerName\"]";
	String card_date = "//*[@id=\"cardForm\"]/div[4]/input";
	String card_cvv = "//*[@id=\"cvvcode\"]";
	String card_book = "//*[@id=\"cardForm\"]/div[6]/input[2]";
	
	public void search(String checkIn, String checkOut, String adult, String children) throws InterruptedException {
		driver.findElement(By.xpath(check_In)).sendKeys(checkIn);
		driver.findElement(By.xpath(check_Out)).sendKeys(checkOut);
		driver.findElement(By.xpath(locator_adult)).sendKeys(adult);
		driver.findElement(By.xpath(locator_children)).sendKeys(children);
		driver.findElement(By.xpath(search_button)).click();
	}
	
	public void booking (String name, String email, String phone, String address) throws InterruptedException {
		driver.findElement(By.xpath(detailRoom)).click();
		driver.findElement(By.xpath(book_button)).click();
		driver.findElement(By.xpath(book_name)).sendKeys(name);
		driver.findElement(By.xpath(book_email)).sendKeys(email);
		driver.findElement(By.xpath(book_phone)).sendKeys(phone);
		driver.findElement(By.xpath(book_address)).sendKeys(address);
		WebElement agree_button = driver.findElement(By.xpath("//*[@id=\"user\"]/div/div[1]/div[5]"));
		

		
			if (agree_button.isSelected() == false) {
				System.out.println("Button chua duoc chon");
				agree_button.click();
			}

		driver.findElement(By.xpath(submit_button)).click();	
	}
	
	@BeforeClass
	public void before() {
		System.setProperty("webdriver.chrome.driver", "D:\\CODE\\WebDriver\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@DataProvider (name = "creditInfo")
	public static Object [][] info() {
		return new Object [][]{{"1234 4567 7890 1111","JOHN DOE","12/35", "123"}};
		}
	
	@Test
	public void TC_01_SearchRoom() throws InterruptedException {
		search("2021/12/24", "2021/12/26", "1", "0");
		String resultSearch = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div/div/h2")).getText();
		Assert.assertEquals(resultSearch, "Rooms");
	}
	
	@Test (dataProvider = "creditInfo")
	public void TC_02_BookRoom(String cardNumber, String cardName, String cardDate, String cardCvv) throws InterruptedException {
		booking ("Phan Duyen", "abc@gmail.com", "0771233123", "123 dia chi");
		driver.findElement(By.xpath(card_number)).sendKeys(cardNumber);
		driver.findElement(By.xpath(card_name)).sendKeys(cardName);
		driver.findElement(By.xpath(card_date)).sendKeys(cardDate);
		driver.findElement(By.xpath(card_cvv)).sendKeys(cardCvv);
		driver.findElement(By.xpath(card_book)).click();
		String confirmMess = driver.findElement(By.xpath("/html/body/section[2]/div/div[1]/div/div")).getText();
		Assert.assertEquals(confirmMess, "Thank you! Your booking has been placed. We will contact you to confirm about the booking soon.");
	}
	
	@AfterClass
	public void after() {
		driver.close();
	}
}