package test.script2;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import page.AdminPage;
import page.LoginPage;
import page.MakeOrderPage;
import page.RegisterPage;
import page.SearchByToolPage;
import utilities.Constants_Data;
import utilities.ExcelUtilities;

public class OrderWithScript2 extends BaseTest {
	MakeOrderPage makeOrderPg;
	LoginPage loginPg;
	SearchByToolPage searchByToolPg;
	RegisterPage registerPg;
	ExcelUtilities excelUtilities;
	AdminPage adminPg;
	String product = "HTC Desire 820S";
	String user_script2 = "duyen2@mail.com";


//User login registered account
@Test (priority = 1)
	public void loginCustomerRole() throws InterruptedException, IOException, AWTException {
		loginPg = new LoginPage(driver);
		excelUtilities = new ExcelUtilities();
		excelUtilities.setExcelFile(Constants_Data.PATH_TO_EXCEL, "Register Data Pass");
		loginPg.login(excelUtilities.getExcelFile(1, 1), excelUtilities.getExcelFile(1, 3));
		Thread.sleep(2000);
		Assert.assertFalse(loginPg.getNameAccount().contains("�?ăng Nhập"));
		System.out.println("Login Customer Role Thread Number Is: " + Thread.currentThread().getId());
}

//User search product and move to product detail page
@Test (priority = 2)
public void searchProductByTool() throws InterruptedException {
	searchByToolPg = new SearchByToolPage(driver);
	searchByToolPg.searchItems(product);
	Assert.assertEquals(searchByToolPg.getSearchProductName(product), product);
	searchByToolPg.cickOnProduct(product);
	System.out.println("Search product by tool Thread Number Is: " + Thread.currentThread().getId());
}

//Check that user make order successful or not when admin deleted account	
@Test (priority = 3)
public void checkUSerCannotMakeOrder() throws InterruptedException {
	makeOrderPg = new MakeOrderPage(driver);
	Thread.sleep(2000);
	makeOrderPg.addProductToCart();
	Thread.sleep(5000);
	makeOrderPg.clickOnOrderBtn();
	makeOrderPg.makeOrder("abc123","123 Le Dai Hanh");
	Thread.sleep(2000);
	Assert.assertTrue(makeOrderPg.errorMessDisplayInOrderPopup());
	System.out.println("Order Success Thread Number Is: " + Thread.currentThread().getId());	
}

		


}

