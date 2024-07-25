package test.script3;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import page.ChangePasswordPage;
import page.LoginPage;
import utilities.Constants_Data;
import utilities.ExcelUtilities;

public class ChangePasswordTest extends BaseTest {
	
	ChangePasswordPage changePassPg;
	LoginPage loginPg;
	ExcelUtilities excelUtilities;
	
//Login with registered account	
@Test(priority = 1)
	public void userLogin() throws IOException, InterruptedException {
		loginPg = new LoginPage(driver);
		excelUtilities = new ExcelUtilities();
		excelUtilities.setExcelFile(Constants_Data.PATH_TO_EXCEL, "Register Data Pass");
		loginPg.login(excelUtilities.getExcelFile(1, 1), excelUtilities.getExcelFile(1, 3));
		Thread.sleep(2000);
		Assert.assertFalse(loginPg.getNameAccount().contains("�?ăng Nhập"));
		System.out.println("Login Customer Role Thread Number Is: " + Thread.currentThread().getId());
}

//Change password
@Test (priority = 2)
	public void changePassword() throws IOException, InterruptedException {
		changePassPg = new ChangePasswordPage(driver);
		changePassPg.moveToChangePasswordPage();
		Thread.sleep(10000);
		excelUtilities = new ExcelUtilities();
		excelUtilities.setExcelFile(Constants_Data.PATH_TO_EXCEL, "Register Data Pass");
		changePassPg.changePassword(excelUtilities.getExcelFile(1, 3), "123123", "123123");
		Assert.assertTrue(changePassPg.successMessageIsDisplayed());
}
}
	


