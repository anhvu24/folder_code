package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
	@FindBy (xpath = "/html/body/header/div/div/div/div[4]/div/div")
	public WebElement login_link;
	
	@FindBy (xpath = "//*[@id=\"form_lg\"]/div[5]/a")
	public WebElement register_link;
	
	@FindBy (xpath = "//*[@id=\"name_rg\"]")
	WebElement name;
	
	@FindBy (xpath = "//*[@id=\"email_rg\"]")
	WebElement email;
	
	@FindBy (xpath = "//*[@id=\"phone_rg\"]")
	WebElement phone;
	
	@FindBy (xpath = "//*[@id=\"pass_rg\"]")
	WebElement pass;
	
	@FindBy (xpath = "//*[@id=\"c_pass_rg\"]")
	WebElement rePass;
	
	@FindBy (xpath = "//*[@id=\"submit_rg\"]")
	WebElement register_button;
	
	@FindBy (xpath = "//*[@id=\"register\"]/div/div")
	public WebElement register_popup;
	
	@FindBy (xpath = "//*[@id=\"login\"]/div/div")
	public WebElement login_popup;
	
	@FindBy (xpath = "//*[@id=\"error_cart\"]/p")
	public WebElement requestLogin_message;
	
	public String text = "Vui lòng đăng nhập mới có thể đặt hàng";
	
	@FindBy (xpath = "//*[@id=\"name_e_rg\"]/i")
	WebElement error_messName ;
	
	@FindBy (xpath = "//*[@id=\"email_e_rg\"]/i")
	WebElement error_messEmail;
	
	@FindBy (xpath = "//*[@id=\"phone_e_rg\"]/i") 
	WebElement error_messPhone;
	
	@FindBy (xpath = "//*[@id=\"pass_e_rg\"]/i")
	WebElement error_messPass;
	
	@FindBy (xpath = "//*[@id=\"c_pass_e_rg\"]/i")
	WebElement error_messRePass ;
	
	@FindBy (xpath = "//*[@id=\"register\"]/div/div/div[2]/div[2]/a")
	public WebElement loginNav_button;
	
	@FindBy (xpath = "//*[@id=\"register\"]/div/div/div[2]/div[3]/a")
	public WebElement forgotPassNav_button;
	
	@FindBy (xpath = "//*[@id=\"forgotpass\"]/div/div")
	public WebElement forgotPass_popup;
	
	@FindBy (xpath = "//*[@id=\"register\"]/div/div/div[1]/button")
	public WebElement close_icon;
	
	@FindBy (xpath = "//*[@id=\"form_rg\"]/input[2]")
	public WebElement close_button;
	
	@FindBys (@FindBy (css = "form#form_rg span i.text-danger")) List<WebElement> errorMess;
	
	WebDriver driver;
	WebDriverWait wait;

	public RegisterPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
		wait = new WebDriverWait(driver, 10);
	}
	
	public void register(String username, String userEmail, String userPhone, String userPass, String userRePass) {
		login_link.click();
		wait.until(ExpectedConditions.visibilityOf(login_popup));
		register_link.click();
		wait.until(ExpectedConditions.visibilityOf(register_popup));
		name.sendKeys(username);
		email.sendKeys(userEmail);
		phone.sendKeys(userPhone);
		pass.sendKeys(userPass);
		rePass.sendKeys(userRePass);
		register_button.click();
		register_button.click();
	}
	
	public void closeRegisterPopup() {
		driver.navigate().refresh();
	}
	
	public void openRegPopup() {
		login_link.click();
		register_link.click();
	}
	
	public String getTextPleaseLogin() {
		return requestLogin_message.getText();
	}
	
	public boolean checkErrorMessageIsDisplay() {
		if (errorMess.isEmpty()) {
			System.out.println("User can register with this data");
			return false;
		}else {
			for (WebElement text : errorMess) {
				System.out.println("Eror Message is: " + text.getText());
			}
			return true;
		}
	}
	
	public boolean registerPopupIsDisplay() {
		return register_popup.isDisplayed();
	}
}



