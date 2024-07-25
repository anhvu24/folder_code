package page;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePasswordPage {
	
	@FindBy (xpath = "/html/body/header/div/div/div/div[4]/div/div") WebElement name_account;
	@FindBy (xpath = "/html/body/header/div/div/div/div[4]/div/div/ul/li[3]/a") WebElement change_password;
	@FindBy (xpath = "/html/body/div[1]/div/div/div[2]/form/div[1]/div/input") WebElement old_Pass;
	@FindBy (xpath = "/html/body/div[1]/div/div/div[2]/form/div[2]/div/input") WebElement new_Pass;
	@FindBy (xpath = "/html/body/div[1]/div/div/div[2]/form/div[3]/div/input") WebElement reEnter_Pass;
	@FindBy (xpath = "/html/body/div[1]/div/div/div[2]/form/input") WebElement update_btn;
	@FindBy (xpath = "/html/body/div[1]/div/div/div[2]/form/p") WebElement success_mess;
	
	WebDriver driver;
	
	
	public ChangePasswordPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void moveToChangePasswordPage() {
		name_account.click();
		change_password.click();
	}

	public void changePassword(String oldPass, String newPass, String reEnterPass) {
		old_Pass.sendKeys(oldPass);
		new_Pass.sendKeys(newPass);
		reEnter_Pass.sendKeys(reEnterPass);
		update_btn.click();
	}
	
	public String getSuccessMess() {
		return success_mess.getText();
	}
	public boolean successMessageIsDisplayed() {
		try {
			success_mess.isDisplayed();
			System.out.println(success_mess.getText());
		}catch (NoSuchElementException nsee){
			nsee.toString();
			System.out.println("Successful message is not display");
			System.out.println(driver.getTitle());
			return false;
		}
		return true;
	}
	
}
