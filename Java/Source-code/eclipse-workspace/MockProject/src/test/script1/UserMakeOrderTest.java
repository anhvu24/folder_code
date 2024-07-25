package test.script1;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import page.LoginPage;
import page.MakeOrderPage;
import page.SearchByToolPage;


public class UserMakeOrderTest extends BaseTest {
	MakeOrderPage makeOrderPg;
	LoginPage loginPg;
	SearchByToolPage searchByToolPg;
	String product = "HTC Desire 820S";
	String user_script1 = "phanduyen@gmail.com";
	String pass_script1 = "123123";

//Login User account
@Test (priority = 1)
	public void loginCustomerRole() throws InterruptedException {
		loginPg = new LoginPage(driver);
		loginPg.login(user_script1, pass_script1);
		Thread.sleep(1000);
		//Assert.assertFalse(loginPg.getNameAccount().contains("�?ăng Nhập"));
		System.out.println("Login Customer Role Thread Number Is: " + Thread.currentThread().getId());
}

//Search product by Tool, get price display in search result
@Test (priority = 2, dependsOnMethods = "loginCustomerRole")
	public void searchProductByTool() throws InterruptedException {
		searchByToolPg = new SearchByToolPage(driver);
		searchByToolPg.searchItems(product);
		Thread.sleep(1000);
		searchByToolPg.printPriceDisplayOnSearchResult();
		searchByToolPg.cickOnProduct(product);
		System.out.println("Search product by tool Thread Number Is: " + Thread.currentThread().getId());
}


//Add product to Cart and check that price is generated correctly in Cart
@Test (priority = 3, dependsOnMethods = "searchProductByTool")
	public void checkPriceBeforeMakeOrder() throws InterruptedException {
		makeOrderPg = new MakeOrderPage(driver);
		makeOrderPg.addProductToCart();
		Thread.sleep(2000);
		Assert.assertTrue(makeOrderPg.check_discount());
		makeOrderPg.waitAlertIsDisplay();
		System.out.println("Check Price Thread Number Is: " + Thread.currentThread().getId());	
}

//User make order
@Test (priority = 4, dependsOnMethods = "checkPriceBeforeMakeOrder")
	public void makeOrderWithSearchProduct() throws InterruptedException {
		makeOrderPg = new MakeOrderPage(driver);
		makeOrderPg.clickOnOrderBtn();
		Thread.sleep(1000);
		makeOrderPg.printPriceInBillingInformation();
		makeOrderPg.makeOrder(pass_script1, "123 Le Dai Hanh");
		Thread.sleep(2000);
		Assert.assertEquals(makeOrderPg.successMessIsDisplayed(), "Đặt hàng thành công");
		System.out.println("Order Success Thread Number Is: " + Thread.currentThread().getId());	
}
}
