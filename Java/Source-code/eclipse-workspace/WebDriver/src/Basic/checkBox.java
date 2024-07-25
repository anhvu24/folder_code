package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class checkBox {

	 public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
	        //Convert web driver object to TakeScreenshot
	        TakesScreenshot scrShot = ((TakesScreenshot)webdriver);
	        //Call getScreenshotAs method to create image file
	                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	            //Move image file to new destination
	                File DestFile=new File(fileWithPath);
	                //Copy file at destination
	                FileUtils.copyFile(SrcFile, DestFile);
	    }
	
	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "D:\\CODE\\WebDriver\\ChromeDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://demo.guru99.com/test/radio.html");
	
	
	//lấy Element và tương tác (click) vào nó - chon checkbox1
	WebElement checkBox1 = driver.findElement(By.id("vfb-6-0"));		//lấy element
	checkBox1.click();
	
	
	//cách gon hơn - chonn checkbox2
	driver.findElement(By.id("vfb-6-1")).click();
	
	
	//xét xem đã chon checkbox2 chưa, nếu rồi thì bo chon và in ra màn hình trạng thái hiện tại
	WebElement checkBox2 = driver.findElement(By.id("vfb-6-1"));
	if (checkBox2.isSelected() == true) {
		System.out.println("Checkbox 2 da duoc chon");
		checkBox2.click();
	}
	System.out.println("Ket qa sau cung: " + checkBox2.isSelected());

	takeSnapShot(driver, "C:\\Users\\Hi\\Desktop\\New folder\\hinh.png") ; 
	
	}

}
