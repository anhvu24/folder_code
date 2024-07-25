package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {
	WebDriver driver;
	
@FindBy (xpath = "/html/body/div[1]/aside/section/ul/li[4]/a") WebElement product_link;

@FindBy (xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[1]/a") WebElement add_productBtn;

@FindBy (css= "body  div:nth-child(1) input") WebElement name_textbox;

@FindBy (css = "div.box-body form div:nth-child(2) div input") WebElement price_textbox;

@FindBy (css = "div.box-body form div:nth-child(3) div input") WebElement quality_textbox;

@FindBy (css = "div.box-body form div:nth-child(4) div input") WebElement sale_textbox;

@FindBy (css = "div.box-body form div:nth-child(5) select") WebElement manufactory_textbox;

@FindBy (css = "div.box-body form  div:nth-child(6) input[type=file]") WebElement upload_img;

@FindBy (css = "#cke_1_contents iframe") WebElement content_frame;

@FindBy (css = ".cke_editable.cke_editable_themed.cke_contents_ltr.cke_show_borders") WebElement text;

@FindBy (css = ".btn.btn-success") WebElement save_btn;

@FindBy (xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[2]/p") WebElement success_mess;


	public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void moveToAddProductPage() {
		product_link.click();
		add_productBtn.click();
	}
	public void addProduct(String name, String price, String quality, String sale, int index, String image, String content) throws InterruptedException {
		name_textbox.sendKeys(name);
		price_textbox.sendKeys(price);
		quality_textbox.sendKeys(quality);
		sale_textbox.sendKeys(sale);
		Select select = new Select(manufactory_textbox);
		select.selectByIndex(index);
		upload_img.sendKeys(image);
		Thread.sleep(5000);
		driver.switchTo().frame(content_frame);
		text.sendKeys(content);
		driver.switchTo().defaultContent();
		save_btn.click();
	}
	
	public String successMessIsDisplay() {
		return success_mess.getText();
	}
	

}
