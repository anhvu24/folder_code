package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit; 						// để dùng đổi thời gian trong implicit Wait
import org.openqa.selenium.support.ui.WebDriverWait;		// explicit wait
import org.openqa.selenium.support.ui.ExpectedConditions;	// explicit wait



public class wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\CODE\\WebDriver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
	
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement flight = driver.findElement(By.linkText("Flights"));
		flight.click();
		
		
		//Explicit wait
		WebDriverWait a = new WebDriverWait(driver, 10);	//10s
		a.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Hotels"))));	//đợi cho element có thể click rồi thực hiện lệnh dưới
		WebElement hotel = driver.findElement(By.linkText("Hotels"));
		hotel.click();
		
		
		//Sleep
//		Thread.sleep(5000);
		WebElement ruise = driver.findElement(By.linkText("Cruises"));
		ruise.click();
		
	}

}
