package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminPage {
	
	@FindBy (xpath = "/html/body/div[1]/aside/section/ul/li[4]/a") WebElement product_link;	
	@FindBy (xpath = "//*[@id=\"view_filter\"]/label/input") WebElement search_textbox;	
	@FindBy (xpath = "//*[@id=\"view\"]/tbody/tr/td[7]/a/button") WebElement edit_btn;	
	@FindBy (xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[2]/form/div[2]/div/input") WebElement price;	
	@FindBy (xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[2]/form/div[4]/div/input") WebElement discount;	
	@FindBy (xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[2]/form/button") WebElement save_btn;	
	@FindBy (xpath = "//*[@id=\"search_order_key\"]") WebElement search_box;
	@FindBy (css = ".fa.fa-remove") List<WebElement> delete_btn;
	@FindBy (xpath = "/html/body/div[1]/aside/section/ul/li[5]/a/i") WebElement order_link;
	@FindBy (css = ".fa.fa-search-plus") WebElement view_btn;
	@FindBy (css = "#view td:nth-child(3)") WebElement price_order;
	@FindBy (xpath = "/html/body/header/div/div/div/div[4]/div/div") WebElement name_account;
	@FindBy (xpath = "/html/body/header/div/div/div/div[4]/div/div/ul/li[1]/a") WebElement admin_page;
	@FindBy (xpath = "//*[@id=\"search_modal\"]/div/div/div[1]/button") WebElement close_btn;
	@FindBy (xpath = "/html/body/div[1]/aside/section/ul/li[3]/a") WebElement user_link;
	@FindBy (xpath = "//*[@id=\"view_filter\"]/label/input") WebElement search_user;
	@FindBy (css = ".btn.btn-danger.delete_user span") WebElement delete_user;
	@FindBy (css = ".odd td") WebElement no_result;
	@FindBy (css = "#view td:nth-child(3)") WebElement email_record;
	@FindBy (css= "div.wrapper  section.content div.box-body p") WebElement update_error;
	@FindBys (@FindBy (css = "#view tbody tr td")) List<WebElement> price_list;
	@FindBys (@FindBy (css = "#view  thead  tr th")) List<WebElement> attribute_list;
	
	WebDriver driver;
	WebDriverWait wait;

	
	public AdminPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver,10);
		PageFactory.initElements(driver, this);
	}
	
	public void editProduct(String product, String value) throws InterruptedException {
		product_link.click();
		search_textbox.sendKeys(product);
		edit_btn.click();
		price.clear();
		price.sendKeys(value);
		save_btn.submit();
		
	}
	
	public void openAdminPage() throws InterruptedException {
		Thread.sleep(2000);
		name_account.click();
		admin_page.click();
	}
	
	public void alertDelete() {
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	}
	
	public void searchUserOrder(String user) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(order_link));
		order_link.click();
		search_box.sendKeys(user);
		Thread.sleep(1000);
		view_btn.click();
	}
	
	public String checkPriceInOrderPage(String user) throws InterruptedException {
		return price_order.getText().replaceAll("[^0-9]", "");
	}
	
	public String getTittle() {
		return driver.getTitle();
	}
	
	public String noRecordUserResult(String user) {
		searchUser(user);
		return no_result.getText();
	}
	
	public void deleteUser(String user) {
		delete_user.click();
		alertDelete();
		alertDelete();
	}
	
	public void moveToUserPage() {
		user_link.click();
	}
	
	public void searchUser(String user) {
		search_user.sendKeys(user);
	}
	
	public String checkUserRecord(String user) {
		return email_record.getText();
	}
	
	public void clearSearchInput() {
		search_user.clear();
	}
	
	public void printAllPriceInOrder() {
		for (int i=1; i < attribute_list.size() - 1; i++) {
			System.out.print(attribute_list.get(i).getText());
			System.out.print("\t" + "\t");
		}
		System.out.println("\n");
		for (int i=1; i < price_list.size() - 1; i++) {

			System.out.print(price_list.get(i).getText());
			System.out.print("\t");
		}
		System.out.println("\n");
	}
}
