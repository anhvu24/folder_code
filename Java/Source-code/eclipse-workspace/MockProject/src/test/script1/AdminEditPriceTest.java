package test.script1;

import org.testng.annotations.Test;

import base.BaseTest;

import org.testng.Assert;
import page.AdminPage;
import page.LoginPage;
import page.MakeOrderPage;
import page.SearchByToolPage;

public class AdminEditPriceTest extends BaseTest{
	LoginPage loginPg;
	AdminPage adminPg;
	SearchByToolPage searchByToolPg;
	MakeOrderPage makeOrderPg;
	String price_edit = "14300001";
	String product_edit = "HTC Desire 820S";
	String user_script1 = "phanduyen@gmail.com";

@Test (priority = 1, description = "Login by Admin account and move to Admin page")
	public void loginWithAdminRole() throws InterruptedException {
		loginPg = new LoginPage(driver);
		adminPg = new AdminPage(driver);
		loginPg.login("tranthang212@gmail.com", "123123");
		adminPg.openAdminPage();
		switchToWindownHandle();
		//Assert.assertEquals(adminPg.getTittle(), "Trần Hữu Thắng - AdminLTE 2");
		System.out.println("Login and Navigate to AdminLTE Thread Number Is: " + Thread.currentThread().getId());
}


@Test (priority = 2, description = "Verify that user can edit product's price in Product page")
	public void editPrice() throws InterruptedException {
		adminPg = new AdminPage(driver);
		searchByToolPg = new SearchByToolPage(driver);
		adminPg.editProduct(product_edit, price_edit);
}	
		
@Test (priority = 3, description = "Verify that the price will display correctly in system after edit")
	public void checkPriceAfterEdit() throws InterruptedException {
		adminPg = new AdminPage(driver);	
		switchBackToFirstWindown();
		searchByToolPg.searchItems(product_edit);
		Thread.sleep(800);
		Assert.assertTrue(searchByToolPg.checkPriceAfterEdit(price_edit));
		System.out.println("Edit Price Thread Number Is: " + Thread.currentThread().getId());
	
}

}
