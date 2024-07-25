package utilities;

import java.io.File;

import org.testng.annotations.DataProvider;

public class Constants_Data {
	 public static final String PATH_TO_EXCEL = System.getProperty("user.dir") + File.separator + "resource" + File.separator + "data.xlsx";

@DataProvider (name = "registerData")
public Object[][] dataProvider() throws Exception {
	ReadFile.setExcelFile(Constants_Data.PATH_TO_EXCEL, "Register Data");
	Object[][] testData = ReadFile.getTestData("valid");
	return testData;
	}
}