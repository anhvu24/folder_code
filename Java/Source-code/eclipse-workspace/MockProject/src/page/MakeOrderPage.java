package page;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeOrderPage {
	
	@FindBy (xpath = "//*[@id=\"order_product\"]") WebElement order_btn;
	@FindBy (xpath = "//*[@id=\"password_od\"]") WebElement password;
	@FindBy (xpath = "//*[@id=\"order_success\"]") WebElement pay_btn;
	@FindBy (xpath = "//*[@id=\"order_modal\"]/div/div") WebElement pay_popup;
	@FindBy (xpath = "//*[@id=\"cart_modal\"]/div/div") WebElement cart_popup;
	@FindBy (xpath = "//*[@id=\"success_modal\"]/div/div/div/div/div[1]/h1") WebElement success_mess;
	@FindBy (xpath = "/html/body/div[1]/div/div/div/div[2]/button") WebElement add_cart;
	@FindBy (css = "#view_cart tbody td:nth-child(5) label") WebElement don_gia;
	@FindBy (css = "#view_cart tbody td:nth-child(3) label") WebElement giam_gia;
	@FindBy (css = "#view_cart table tbody td:nth-child(6)") WebElement thanh_tien;
	@FindBy (css = "#view_cart tbody td:nth-child(4) select [selected = selected]") WebElement so_luong;
	@FindBy (xpath = "//*[@id=\"address_od\"]") WebElement address;
	@FindBys (@FindBy (css = "div#user_order span i.text-danger")) List<WebElement> errorMess_Order;
	@FindBy (xpath = "//*[@id=\"list_order\"]/div[2]/label/span") WebElement total_bill;
	@FindBy (xpath = "//*[@id=\"list_order\"]/div[1]/div[2]/span[1]") WebElement price_bill;
	
	
	WebDriver driver;
	WebDriverWait wait;
	
	public MakeOrderPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
		PageFactory.initElements(driver, this);
	}
	
	public void waitElementToDisplay(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void clickOnOrderBtn() {
		order_btn.click();
	}
	
	public void makeOrder(String pass, String add) throws InterruptedException {
		waitElementToDisplay(pay_popup);
		Thread.sleep(2000);
		address.clear();
		address.sendKeys(add);
		password.sendKeys(pass);
		pay_btn.click();
		Thread.sleep(3000);
		pay_btn.click();
	}
	
	public void addProductToCart() {
		try {
			assertTrue(add_cart.isDisplayed());
			add_cart.click();
		}catch (NoSuchElementException nsee) {
			System.out.println(nsee.getMessage());
		}
	}	
	
	public String successMessIsDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(success_mess));
		return success_mess.getText();
	}


public boolean check_discount() throws InterruptedException {
		int donGia = 0, thanhTien = 0, giamGia = 0, thanhTien_expected = 0, soLuong = 0;
		try {	
				giamGia = Integer.parseInt(giam_gia.getText().replaceAll("%",""));
				soLuong = Integer.parseInt(so_luong.getText());
				donGia = Integer.parseInt(don_gia.getText().replaceAll("[^0-9]",""));
				thanhTien = Integer.parseInt(thanh_tien.getText().replaceAll("[^0-9]",""));	
				
		}catch (NumberFormatException nef) {	
			nef.getMessage();
		}
				if (giamGia > 0 && giamGia <= 100) {
					System.out.println("PRICE IN CART: ");
					thanhTien_expected = (donGia - (giamGia * donGia)/100) * soLuong;
					System.out.println("Price: " + donGia);
					System.out.println("Discount: " + giamGia + "%");
					System.out.println("Total Expected: " + thanhTien_expected);
					System.out.println("Actual total in Cart: " + thanhTien);
					return thanhTien_expected == thanhTien;	
				}else if (giamGia == 0) {
					thanhTien_expected = donGia * soLuong;
					System.out.println("No discount for this product");
					return thanhTien_expected == thanhTien;
				}else {
					System.out.println("Discount is invalid " + giamGia);
					return false;
				}
	}
	
	public boolean errorMessDisplayInOrderPopup() {
		if(errorMess_Order.isEmpty()) {
			return false;
		}else {
			for (WebElement text : errorMess_Order) {
				System.out.println("User cannot make order cause: " + text.getText());
			}
			return true;
		}
	}
	
	public void printPriceInBillingInformation() {
			System.out.println("Price in Billing information: " + price_bill.getText());
			System.out.println("Total in Billing information: " + total_bill.getText());
	
	}
	public String waitAlertIsDisplay() {
		try {
			wait.until(ExpectedConditions.alertIsPresent());
				return driver.switchTo().alert().getText();
		}catch (TimeoutException toe) {
			System.out.println("FAILED: No alert display in Cart popup");
			return toe.toString();
		}
	}

}

