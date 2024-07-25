package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class nhap {

	public static void main(String[] args) {
		//mo trang ,phong to, 
		System.setProperty("webdriver.chrome.driver", "D:\\CODE\\WebDriver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement user = driver.findElement(By.name("userName"));
			user.sendKeys("anhvu");
		WebElement pass = driver.findElement(By.name("password"));
			pass.sendKeys("anhvu123");
		WebElement submit = driver.findElement(By.name("submit"));
			submit.click();
		
		driver.navigate().back();
		
		WebElement flight = driver.findElement(By.linkText("Flights"));
			flight.click();
			
		WebElement oneWay = driver.findElement(By.xpath("//input[2]"));
		if(oneWay.isSelected() == false) {
			System.out.println("One Way is not clicked");
			oneWay.click();
		}
		else
			System.out.println("One Way is clicked");
		
		WebElement passenger = driver.findElement(By.xpath("//select"));
		Select passenger_drop = new Select(passenger);
		passenger_drop.selectByVisibleText("4");
		
		WebElement depart = driver.findElement(By.name("fromPort"));
		Select depart_drop = new Select(depart);
		depart_drop.selectByVisibleText("London");
		
		WebElement month = driver.findElement(By.name("fromMonth"));
		Select month_drop = new Select(month);
		month_drop.selectByVisibleText("June");
		
		WebElement day = driver.findElement(By.name("fromDay"));
		Select day_drop = new Select(day);
		day_drop.selectByVisibleText("30");
		
		WebElement arriving = driver.findElement(By.name("toPort"));
		Select arriving_drop = new Select(arriving);
		arriving_drop.selectByVisibleText("Paris");
		
		WebElement monthReturn = driver.findElement(By.name("toMonth"));
		Select monthReturn_drop = new Select(monthReturn);
		monthReturn_drop.selectByVisibleText("October");
		
		WebElement dayReturn = driver.findElement(By.name("toDay"));
		Select dayReturn_drop = new Select(dayReturn);
		dayReturn_drop.selectByVisibleText("22");
			
		
		WebElement firstClass = driver.findElement(By.cssSelector("input:nth-child(4)"));
		if(firstClass.isSelected() == false) {
			System.out.println("First Class is not selected");
			firstClass.click();
		}
		
		WebElement airline = driver.findElement(By.name("airline"));
		Select airline_drop = new Select(airline);
		airline_drop.selectByIndex(3);
		
		WebElement findFlight = driver.findElement(By.name("findFlights"));
		findFlight.click();
		
	
		driver.close();
		
			
			
			
		
		
	}

}
