package Basic;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;					//import để khai báo alert

public class alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\CODE\\WebDriver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
	
	//Lưu ý: Alert là 1 dạng popup
	//Dùng .switchTo() để switch từ màn hình chính của ứng dụng sang cái Alert để thực hiện thao tác trong alert
		
		
		Alert popup = driver.switchTo().alert();
		popup.dismiss();							//button Cancel
		
		submit.click();
		
		driver.switchTo().alert().getText();		//viết gộp (lấy nội dung alert)
		System.out.println(popup.getText());
		
		popup.accept();								//button Ok

		

	//Chỉ cần switch 1 lần qa alert, lúc này ta đang thao tác tiếp trên alert tiếp theo
		System.out.println(popup.getText());
		popup.accept();
		
	}

}
