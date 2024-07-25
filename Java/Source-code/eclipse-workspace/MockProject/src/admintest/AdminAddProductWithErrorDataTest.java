package admintest;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Before_After;
import utilities.AddProductPage;
import utilities.LogInPage;
import utilities.ReadExcel;

public class AdminAddProductWithErrorDataTest extends Before_After {
	By searchField = By.cssSelector("#serch-hiden > input");
	By searchFieldInner = By.xpath("//*[@id=\"search\"]");
	
  
  @Test	(description = "Verify that user cannot add product with incorrect data")
  public void AddProduct_Failed() throws IOException, InterruptedException {
	  LogInPage loginpage = new LogInPage(driver);
	  AddProductPage addproductpage = new AddProductPage(driver);
	  ReadExcel readExcel = new ReadExcel();
	  readExcel.setExcelFile("C:\\Users\\Hi\\Desktop\\dataProduct.xlsx", "FAILED");
	
	  loginpage.LogIn("tranthang212@gmail.com", "123123");
	  loginpage.NavigateToAdmin();
	  
	  //Transfer to second tab (index = 1)
	  ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	  driver.switchTo().window(tabs.get(1));

	  for(int i = 1; i <= readExcel.numOfRow(); i++) {
		  addproductpage.addProduct_Failed("C:\\Users\\Hi\\Desktop\\dataProduct.xlsx", "FAILED", i);
		  String actualResult = driver.findElement(By.cssSelector("section.content div.box-body")).getText();
		  Assert.assertTrue(actualResult.contains("ko thành cong"));		  
	  }
  }
  
}
