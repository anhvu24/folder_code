package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class sendKey {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\CODE\\WebDriver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//mo trinh duyet
		driver.get("http://www.demo.guru99.com/");
		
		
		//sendKey
		WebElement email = driver.findElement(By.name("emailid"));
		email.sendKeys("anhvu@gmail.com");
		
		
		//viet gop
//		driver.findElement(By.name("emailid")).sendKeys("vu.doan.vtp@gmail.com");
		
		
		
		
	}

}
