package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\CODE\\WebDriver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Lưu ý: "navigate().to() AND get() do exactly the same thing" => coi cho biết thôi =)))
		driver.navigate().to("http://demo.guru99.com/test/newtours/");
		
		WebElement flight = driver.findElement(By.linkText("Flights"));
		flight.click();
		
		
		//REFRESH trang
		driver.navigate().refresh();
		
		//LUI về trang New Tour
		driver.navigate().back();
		
		//ĐẾN lại trang Flights
		driver.navigate().forward();
		
	
		
	}

}
