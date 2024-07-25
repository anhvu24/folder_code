package test.utilities;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import page.AdminPage;
import page.LoginPage;
import utilities.Constants_Data;


public class CheckUserInAdminLTE_test extends BaseTest {
	AdminPage adminPg;
	LoginPage loginPg;

@Test (priority = 0)
	public void loginAdmin() throws InterruptedException {
		loginPg = new LoginPage(driver);
		adminPg = new AdminPage(driver);
		loginPg.login("tranthang212@gmail.com", "123123");
		adminPg.openAdminPage();
}
	
@Test (dataProvider = "registerData", dataProviderClass = Constants_Data.class, priority = 1)
	public void checkUserInAdminLTE(String name, String email, String phone, String pass, String repass) throws InterruptedException {
		adminPg = new AdminPage(driver);
		adminPg.searchUser(email);
		Assert.assertEquals(adminPg.checkUserRecord(email), email);
		adminPg.clearSearchInput();
}
	
}
