package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class radioButton {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "D:\\CODE\\WebDriver\\ChromeDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://demo.guru99.com/test/newtours/reservation.php");
	
	
	
	//click vào 1 radio button
	WebElement type = driver.findElement(By.xpath("//input[2]"));
	type.click();
	
	
	//hoặc có thể viết gọn hơn (cách này vào thẳng Element rồi thực hiện lệnh click)
	driver.findElement(By.xpath("//font/font/input")).click();
	
	
	
	
	
	}

}
