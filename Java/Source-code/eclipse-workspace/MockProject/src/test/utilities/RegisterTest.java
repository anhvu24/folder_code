package test.utilities;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseTest;
import page.LoginPage;
import page.RegisterPage;
import utilities.Constants_Data;
import utilities.ExcelUtilities;

public class RegisterTest extends BaseTest {
	RegisterPage registerPg;
	LoginPage loginPg;
	ExcelUtilities excelUtilities;
	int i = 1;

//@Test(dataProvider = "registerData", dataProviderClass = Constants_Data.class)
//	public void registerWithData(String name, String email, String phone, String pass, String repass) throws InterruptedException {
//		registerPg = new RegisterPage(driver);
//		registerPg.register(name, email, phone, pass, repass);
//		Thread.sleep(5000);
//		Assert.assertFalse(registerPg.registerPopupIsNotDisplay());
//}
	
@Parameters ("sheetName")
@Test
	public void registerWithFailData(String sheetName) throws IOException, InterruptedException {
		if(sheetName.equalsIgnoreCase("register data pass")) {
			registerPg = new RegisterPage(driver);
			excelUtilities = new ExcelUtilities();
			excelUtilities.setExcelFile(Constants_Data.PATH_TO_EXCEL, "Register Data Pass");
			registerPg.register(excelUtilities.getExcelFile(1, 0), excelUtilities.getExcelFile(1, 1), excelUtilities.getExcelFile(1, 2), excelUtilities.getExcelFile(1, 3), excelUtilities.getExcelFile(1, 4));
			Thread.sleep(5000);
			Assert.assertFalse(registerPg.registerPopupIsDisplay());	
		} else {
			registerPg = new RegisterPage(driver);
			excelUtilities = new ExcelUtilities();
			excelUtilities.setExcelFile(Constants_Data.PATH_TO_EXCEL, "Register Data Fail");
			try {
				do {
					registerPg.register(excelUtilities.getExcelFile(i, 0), excelUtilities.getExcelFile(i, 1), excelUtilities.getExcelFile(i, 2), excelUtilities.getExcelFile(i, 3), excelUtilities.getExcelFile(i, 4));
					System.out.println("Register with data " + i);
					registerPg.checkErrorMessageIsDisplay();
					registerPg.closeRegisterPopup();
					i++;
				} while (!(excelUtilities.getExcelFile(i, 0).equals("") && excelUtilities.getExcelFile(i, 1).equals("")));
			}catch (NullPointerException ex) {
			    System.out.println("Exception in NPE1()" + ex);
			}
			
		}
	}
}
