package test.script3;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import page.AdminPage;
import page.LoginPage;
import utilities.Constants_Data;
import utilities.ExcelUtilities;

public class AdminDeleteUserTest extends BaseTest{
	LoginPage loginPg;
	AdminPage adminPg;
	String user_script2 = "duyen2@mail.com";
	
//Login with Admin account	
@Test (priority = 1)
	public void loginAndOpenAdminPage() throws InterruptedException {
		loginPg = new LoginPage(driver);
		adminPg = new AdminPage(driver);
		loginPg.login("tranthang212@gmail.com", "123123");
		adminPg.openAdminPage();
		switchToWindownHandle();
		Assert.assertEquals(adminPg.getTittle(), "Trần Hữu Thắng - AdminLTE 2");
		System.out.println("Login and Navigate to AdminLTE Thread Number Is: " + Thread.currentThread().getId());
}

//Admin delete User
@Test (priority = 2)
	public void deleteUser() throws InterruptedException, IOException {
		adminPg = new AdminPage(driver);
		//adminPg.searchUser(user_script2);
		adminPg.moveToUserPage();
		adminPg.searchUser(user_script2);
		adminPg.deleteUser(user_script2);
		adminPg.searchUser(user_script2);
		Assert.assertEquals(adminPg.noRecordUserResult(user_script2), "No matching records found");
		System.out.println("Delete user Thread Number Is: " + Thread.currentThread().getId());
}
}
