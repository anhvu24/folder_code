package utilities;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreen {
	public void takeSnapShot(WebDriver driver,String fileWithPath) throws Exception{
		
//Convert web driver object to TakeScreenshot            
		TakesScreenshot scrShot = ((TakesScreenshot)driver);
		
//Call getScreenshotAs method to create image file                   
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		
//Move image file to new destination                  
		File DestFile = new File(fileWithPath);
		
 //Copy file at destination                   
		FileUtils.copyFile(SrcFile, DestFile);
	}
	
	public void take_screen() throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/libs/chromedriver.exe");
		driver = new ChromeDriver();
//goto url      
		driver.get("http://google.com");
		
//Call take screenshot function  
		takeSnapShot(driver,"D:\\Saved Pictures\\screenshor113.png");
		driver.close();
		
	}
	}

