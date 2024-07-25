package page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Email {
//	@FindBy (xpath = "//*[@id=\"signin-main\"]/div[1]/a") WebElement email_link;
//	@FindBy (xpath = "//*[@id=\"login-username\"]") WebElement email;
//	@FindBy (xpath = "//*[@id=\"login-signin\"]") WebElement login_btn;
//	@FindBy (xpath = "//*[@id=\"login-passwd\"]") WebElement password;
//	@FindBy (xpath = "//*[@id=\"login-signin\"]") WebElement continue_btn;
	public WebDriver driver;
	
//	public Email (WebDriver driver) {
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
//	}
@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "E:\\Tester\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://mail.yahoo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
}	

@Test
	public void login() {
		driver.findElement(By.xpath("//*[@id=\"signin-main\"]/div[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys("phanduyen111@yahoo.com");
		driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"login-passwd\"]")).sendKeys("Rachel123@");
		driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
}
}

