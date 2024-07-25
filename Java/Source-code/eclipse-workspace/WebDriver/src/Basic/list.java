package Basic;


//import java.util.List;						//dùng khai báo List<WebElement>

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class list {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\CODE\\WebDriver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/reservation.php");
		
//		Select monthDrop = new Select(driver.findElement(By.name("fromMonth"))); 
		
//		List<WebElement> month = driver.findElements(By.name("fromMonth"));
		
		
		WebElement day = driver.findElement(By.xpath("//select[2]"));
		System.out.println(day.getText());
		
// chua xong
		

				
		
		
	}

}
