package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select; 		//phải import để select



public class dropdownList {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\CODE\\WebDriver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/reservation.php");
		
		
		//select City, ByIndex
		WebElement city = driver.findElement(By.name("fromPort"));
		Select dropCity = new Select(city);						// chọn vào dropdown
		dropCity.selectByIndex(3);								// chọn giá trị bên trong
		
		
		//select month, ByVisibleText
		WebElement month = driver.findElement(By.name("fromMonth"));
		Select dropMonth = new Select(month);
		dropMonth.selectByVisibleText("May");
		

		//select day, ByValue (bằng cách gộp)
		Select dropDay = new Select(driver.findElement(By.name("fromDay")));		
		dropDay.selectByValue("6");
		
		
		//Kiểm tra dropdown Day có bao nhiêu giá trị
		int a = dropDay.getOptions().size();
		System.out.println("dropDay có: " + a);
		

		 
	}
}
