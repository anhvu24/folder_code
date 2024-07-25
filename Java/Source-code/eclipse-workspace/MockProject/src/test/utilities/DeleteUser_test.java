package test.utilities;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import page.AdminPage;
import page.LoginPage;
import utilities.Constants_Data;

public class DeleteUser_test extends BaseTest{
	AdminPage adminPg;
	LoginPage loginPg;

@Test (priority = 0)
	public void loginAdmin() throws InterruptedException {
		loginPg = new LoginPage(driver);
		loginPg.login("tranthang212@gmail.com", "123123");
}

@Test (priority = 1, dataProvider = "registerData", dataProviderClass = Constants_Data.class)
	public void deleteUser(String name, String email, String phone, String pass, String repass) {
		adminPg = new AdminPage(driver);
		adminPg.searchUser(email);
		adminPg.deleteUser(email);
		Assert.assertEquals(adminPg.noRecordUserResult(email), "No matching records found");
}
}
