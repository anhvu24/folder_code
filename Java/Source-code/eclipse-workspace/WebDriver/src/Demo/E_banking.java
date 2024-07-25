package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;
import java.util.concurrent.TimeUnit;


public class E_banking {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\CODE\\WebDriver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://14.176.232.213:8080/EBankingWebsite/faces/registry.xhtml");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Random rd = new Random();
		
		WebElement id = driver.findElement(By.id("j_idt9:soucre"));					
			id.sendKeys("anhvu" + rd.nextInt(1000));
		WebElement pw = driver.findElement(By.id("j_idt9:pwd1"));			
			pw.sendKeys("DoananhVu123");	
		WebElement pw2 = driver.findElement(By.id("j_idt9:pwd2"));			
			pw2.sendKeys("DoananhVu123");
		WebElement name = driver.findElement(By.id("j_idt9:key"));		
			name.sendKeys("Đoàn Anh Vũ");
		WebElement sdt = driver.findElement(By.id("j_idt9:phone"));	
			sdt.sendKeys("0123456789");		
		WebElement date = driver.findElement(By.id("j_idt9:mask_input"));	
			date.sendKeys("24/07/1997");	
		WebElement sex_male = driver.findElement(By.xpath("//div[2]/span"));					
		if(sex_male.isSelected() == false) {
			System.out.println("gioi tinh nam chua duoc chon");
			sex_male.click();
		}
		else
			System.out.println("gioi tinh nam da duoc chon");
		
		WebElement city = driver.findElement(By.id("j_idt9:country_label"));			//city, cái này là list, KO phải drop
			city.click();
		
		driver.findElement(By.cssSelector(".ui-selectonemenu-item:nth-child(2)")).click();	

		WebElement cmnd = driver.findElement(By.id("j_idt9:cmnd"));				
			cmnd.sendKeys("123456789");	
		WebElement mail = driver.findElement(By.id("j_idt9:email"));			
			mail.sendKeys("vu123@gmail.com");
			
		driver.findElement(By.cssSelector(".ui-c:nth-child(2)")).click();	
		
		driver.manage().window().maximize();
	
		driver.findElement(By.name("j_idt9:j_idt30")).click();
		
//		driver.findElement(By.xpath("//table/tbody/tr[12]/td[1]/table/tbody/tr[2]/td[1]")).click();
	}

}
