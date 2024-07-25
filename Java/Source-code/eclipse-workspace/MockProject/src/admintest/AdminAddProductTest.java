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

public class AdminAddProductTest extends Before_After {
	By searchField = By.cssSelector("#serch-hiden > input");
	By searchFieldInner = By.xpath("//*[@id=\"search\"]");
	
	
  @Test	(description = "Verify that user can add product with correct data successfully", priority = 1)
  public void AddProduct_Passed() throws IOException, InterruptedException {
	  LogInPage loginpage = new LogInPage(driver);
	  AddProductPage addproductpage = new AddProductPage(driver);
	  ReadExcel readExcel = new ReadExcel();
	  readExcel.setExcelFile("C:\\Users\\Hi\\Desktop\\dataProduct.xlsx", "PASSED");
	  
	  loginpage.LogIn("tranthang212@gmail.com", "123123");
	  loginpage.NavigateToAdmin();
	  
	  //Transfer to second tab (index = 1)
	  ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	  driver.switchTo().window(tabs.get(1));
	    
	  for(int i = 1; i <= readExcel.numOfRow(); i++) {
		  addproductpage.addProduct_Passed("C:\\Users\\Hi\\Desktop\\dataProduct.xlsx", "PASSED", i);
		  String actualResult = driver.findElement(By.cssSelector("body section.content div.box-body > p")).getText();
		  Assert.assertTrue(actualResult.contains("Cập nhật thành công"));
	  }
	  
  }
  
  
  @Test (description = "Verify that the added products will be shown after searching", priority = 2)
  public void CheckProduct() throws IOException, InterruptedException {
	  ReadExcel readExcel = new ReadExcel();
	  readExcel.setExcelFile("C:\\Users\\Hi\\Desktop\\dataProduct.xlsx", "PASSED");
	  	  
	  for(int i = 1; i <= readExcel.numOfRow(); i++) {
		  driver.findElement(searchField).click();
		  driver.findElement(searchFieldInner).sendKeys(readExcel.getDataInCell(i, 1));		
		  Thread.sleep(2000);
		   		  
		  String actualResult = driver.findElement(By.cssSelector("div:nth-child(1) > .col-xs-6 a")).getText();
		  Assert.assertEquals(actualResult, readExcel.getDataInCell(i, 1));				  
		  driver.navigate().refresh();
	  }  
  }
}
