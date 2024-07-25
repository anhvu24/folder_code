package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy (xpath = "/html/body/header/div/div/div/div[4]/div/div") WebElement login_link;
	@FindBy (xpath = "//*[@id=\"e_p_lg\"]") WebElement username;
	@FindBy (xpath = "//*[@id=\"pass_lg\"]") WebElement password;
	@FindBy (xpath = "//*[@id=\"tick_lg\"]") WebElement remember_checkbox;	
	@FindBy (xpath = "//*[@id=\"submit_lg\"]") WebElement login_button;	
	@FindBy (xpath = "//*[@id=\"form_lg\"]/input[2]") WebElement close_button;
	@FindBy (xpath = "/html/body/header/div/div/div/div[4]/div/div/ul/li[1]/a") WebElement admin_link;
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void login(String user, String pass) {
		login_link.click();
		username.sendKeys(user);
		password.sendKeys(pass);
		login_button.click();
		login_button.click();
		login_button.click();
	}
	

	public String getNameAccount() {
		return login_link.getText();
	}
}
