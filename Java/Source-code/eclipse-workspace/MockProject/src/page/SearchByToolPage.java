package page;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchByToolPage {
	
	@FindBy (css = "#search_show div.col-xs-6.col-sm-6.col-md-7.search_col label a")
	List<WebElement> name_items;
	
	@FindBy (xpath = "//*[@id=\"serch-hiden\"]/input") WebElement search_area;
	@FindBy (xpath = "//*[@id=\"search_modal\"]/div/div") WebElement search_popup;
	@FindBy (xpath = "//*[@id=\"search\"]") WebElement search_textbox;	
	@FindBy (xpath = "//*[@id=\"search_modal\"]/div/div/div[2]/div/div[1]/span") WebElement go_btn;
	@FindBy (css = "#search_show div.col-xs-6.col-sm-3.col-md-3.search_col label span")
	List<WebElement> price_list;	
	@FindBy (xpath = "//*[@id=\"search_show\"]/div/div[3]/label/span") WebElement price_check;
	@FindBy (css = "#search_show .row.search_main label a")
	@CacheLookup 
	WebElement search_product;
	@FindBy (xpath = "//*[@id=\"search_modal\"]/div/div/div[1]/button") WebElement close_btn;

	WebDriver driver;
	WebDriverWait wait;
	
	public SearchByToolPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver,10);
	}
	
	public void searchItems(String item) {
		search_area.click();
		wait.until(ExpectedConditions.visibilityOf(search_popup));
		search_textbox.sendKeys(item);
	}
	
	public String getSearchProductName(String productText) throws InterruptedException {
		Thread.sleep(1000);
		return search_product.getText();
	}
	
	public void closeSearchPopup() {
		close_btn.click();;
	}
	
	public void cickOnProduct(String product) {
		wait.until(ExpectedConditions.elementToBeClickable(search_product));
		if (search_product.getText().equals(product)) {
		search_product.click();
		}else {
			System.out.println("Cannot found this product or cannot click on product");
		}
	}
	
	public boolean hasKeywords(String keyword) {
		for (int i=0; i < name_items.size(); i++) {
			 String name = name_items.get(i).getText().toLowerCase();
			 if (!(name.contains(keyword.toLowerCase()))){
				 return false;
			 }
		} 
		return true;
	}
	
	public boolean notDisplayTwiceTime() {
		for (int i=0; i<name_items.size(); i++) {
			for(int j = i+1; j < name_items.size(); j++) {
				String name1 = name_items.get(i).getText().toLowerCase();
				String name2 = name_items.get(j).getText().toLowerCase();
				if (name1.equals(name2.toLowerCase())) {
					return false;
			}
		}
	}
		return true;
	}
	
	public boolean hasSortByPrice() {
		try {
			for (int i=0; i<price_list.size(); i++) {
			for (int j=i+1; j<price_list.size(); j++) {
				int price1 = Integer.parseInt(price_list.get(i).getText().replaceAll("[^0-9]",""));
				int price2 = Integer.parseInt(price_list.get(j).getText().replaceAll("[^0-9]",""));
				System.out.println("gia 1: " + price1 + "va" + price2);
				if (price1 > price2) {
					return false;
					}
				}
			}
		}catch (NumberFormatException nef) {
				nef.getMessage();
	}return true;
}
	
	public boolean checkPriceAfterEdit(String price) {
		String priceAfterEdit = price_check.getText().replaceAll("[^0-9]", "");
		if (priceAfterEdit.equals(price)) {
			System.out.println("Price after edit " + price_check.getText().replaceAll("[^0-9]", ""));
			return true;
		}
		return false;
	}
	
	public void printPriceDisplayOnSearchResult() {
		System.out.println("Price of product display on search result " + price_check.getText());
	}

}