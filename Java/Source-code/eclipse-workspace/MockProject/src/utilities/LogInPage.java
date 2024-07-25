package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {
	
	WebDriver driver;
	
	//Constructor
	public LogInPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By loca_dangNhapLink = By.xpath("/html/body/header/div/div/div/div[4]/div/div");
	By loca_email = By.xpath("//input[@id='e_p_lg']");
	By loca_matKhau = By.xpath("//input[@id='pass_lg']");
	By loca_dangNhapButton = By.xpath("//input[@id='submit_lg']");

	By loca_userLink = By.xpath("/html/body/header/div/div/div/div[4]/div/div/button");
	By loca_adminControlLink = By.xpath("/html/body/header/div/div/div/div[4]/div/div/ul/li[1]/a");
	
	By loca_productsLink = By.xpath("/html/body/div/aside/section/ul/li[4]/a/span");
	By loca_productsButton = By.xpath("/html/body/div/div/section[2]/div/div/div/div[1]/a");
	
	public void LogIn(String username, String password) {
		driver.findElement(loca_dangNhapLink).click();
		driver.findElement(loca_email).sendKeys(username);
		driver.findElement(loca_matKhau).sendKeys(password);
		driver.findElement(loca_dangNhapButton).click();
		driver.findElement(loca_dangNhapButton).click();	
	}
	
	
	public void NavigateToAdmin() {
		driver.findElement(loca_userLink).click();
		driver.findElement(loca_adminControlLink).click();	
	}
	
	
}
