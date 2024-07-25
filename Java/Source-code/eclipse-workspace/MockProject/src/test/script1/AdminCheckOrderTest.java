package test.script1;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import page.AdminPage;
import page.LoginPage;

public class AdminCheckOrderTest extends BaseTest {
	AdminPage adminPg;
	LoginPage loginPg;
	String user_script1 = "phanduyen@gmail.com";
	String pass_script1 = "123123";
	String price_edit = "14300001";
	
	
@Test (description = "Check the price of order is equals price before edit or after edit")
	public void checkPriceOfOrder() throws InterruptedException {
		adminPg = new AdminPage(driver);
		loginPg = new LoginPage(driver);
		loginPg.login("tranthang212@gmail.com", "123123");
		adminPg.openAdminPage();
		switchToWindownHandle();
		adminPg.searchUserOrder(user_script1);
		adminPg.printAllPriceInOrder();
		Assert.assertTrue(adminPg.checkPriceInOrderPage(user_script1).equals(price_edit));
		System.out.println("Check Order Thread Number Is: " + Thread.currentThread().getId());
}
	

}
