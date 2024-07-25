package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class frame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\CODE\\WebDriver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/selenium/deprecated.html");
		
		
	//Lưu ý: trong frame là name / id / index
	//switch vào frame có name = classFrame
		driver.switchTo().frame("classFrame");
		
		
	//sau khi switch vào frame đó rồi thì thao tác như bình thường, chỉ thao tác được những element trong frame đó
		driver.findElement(By.xpath("//tr[8]/td/a")).click();
		
		
	//phải thực hiện quay trở ra ngoài để có thể tiếp tục thực hiện các thao tác tiếp theo
		driver.switchTo().parentFrame();
		
		
	//switch vào frame có name = packageFrame và thao tác
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("Actions")).click();
		

	}

}
