package utilities;


import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddProductPage {
	WebDriver driver;
	
	//Constructor
	public AddProductPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Locator
	By loca_productsLink = By.linkText("Products");
	By loca_addProductsButton = By.linkText("Add Products");
	By loca_name = By.name("name");
	By loca_price = By.name("price");
	By loca_quality = By.name("quality");
	By loca_sale = By.name("sale");
	By loca_manufactures = By.name("manufactures");
	By loca_chooseFileButton = By.cssSelector("div.box-body form  div:nth-child(6) input[type=file]");
	By loca_contentFrame = By.cssSelector("#cke_1_contents iframe");
	By loca_specification = By.cssSelector(".cke_editable.cke_editable_themed.cke_contents_ltr.cke_show_borders");
	By loca_saveButton = By.cssSelector(".btn-success");
	
	By loca_nameError = By.cssSelector("section.content div:nth-child(1) > label > span:nth-child(2)");
	By loca_priceError = By.cssSelector("section.content div:nth-child(2) > label > span:nth-child(2)");
	By loca_qualityEror = By.cssSelector("section.content div:nth-child(3) > label > span:nth-child(2)");
	By loca_saleError = By.cssSelector("section.content div:nth-child(4) > label > span:nth-child(2)");
	By loca_manufacturesError = By.cssSelector("section.content div:nth-child(5) > label > span:nth-child(2)");
	By loca_imageError = By.cssSelector("section.content div:nth-child(6) > label > span:nth-child(2)");
	By loca_specificationError = By.cssSelector("section.content div:nth-child(7) > label > span:nth-child(2)");
	
	By loca_errorMess = By.cssSelector("body div.wrapper section.content div.box-body form label span:nth-child(2)");
	
	ReadExcel readExcel = new ReadExcel();
	
	//Add Products with correct Data
	public void addProduct_Passed(String fileExcelPath, String sheetName, int i) throws IOException, InterruptedException, NullPointerException {
		driver.findElement(loca_productsLink).click();
		driver.findElement(loca_addProductsButton).click();
		
		readExcel.setExcelFile(fileExcelPath, sheetName);
		
	 	driver.findElement(loca_name).sendKeys(readExcel.getDataInCell(i, 1));
		driver.findElement(loca_price).sendKeys(readExcel.getDataInCell(i, 2));
		driver.findElement(loca_quality).sendKeys(readExcel.getDataInCell(i, 3));
		driver.findElement(loca_sale).sendKeys(readExcel.getDataInCell(i, 4));

		Select Manufactures = new Select(driver.findElement(loca_manufactures));			
		if(readExcel.getDataInCell(i, 5).contains("Iphone")) {
			Manufactures.selectByValue("1");
		}else if(readExcel.getDataInCell(i, 5).contains("Samsung")) {
			Manufactures.selectByValue("2");
		}else if(readExcel.getDataInCell(i, 5).contains("Nokia")) {
			Manufactures.selectByValue("4");
		}else if(readExcel.getDataInCell(i, 5).contains("HTC")) {
			Manufactures.selectByValue("6");
		}else if(readExcel.getDataInCell(i, 5).contains("Sony")) {
			Manufactures.selectByValue("7");
		}else if(readExcel.getDataInCell(i, 5).contains("Asus")) {
			Manufactures.selectByValue("8");
		}		
		driver.findElement(loca_chooseFileButton).sendKeys(readExcel.getDataInCell(i, 6));
		
		WebElement contentFrame = driver.findElement(loca_contentFrame);
		driver.switchTo().frame(contentFrame);
		driver.findElement(loca_specification).sendKeys(readExcel.getDataInCell(i, 7));
		driver.switchTo().parentFrame();
		driver.findElement(loca_saveButton).click();
		Thread.sleep(2000);			
	}	
	
	

	//Add Products with incorrect Data
	public void addProduct_Failed(String fileExcelPath, String sheetName, int i) throws IOException, InterruptedException {
		driver.findElement(loca_productsLink).click();
		driver.findElement(loca_addProductsButton).click();
		
		readExcel.setExcelFile(fileExcelPath, sheetName);
		
		try {
			driver.findElement(loca_name).sendKeys(readExcel.getDataInCell(i, 1));
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		
		try {
			driver.findElement(loca_price).sendKeys(readExcel.getDataInCell(i, 2));
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		
		try {
			driver.findElement(loca_quality).sendKeys(readExcel.getDataInCell(i, 3));
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		
		try {
			driver.findElement(loca_sale).sendKeys(readExcel.getDataInCell(i, 4));
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		
		try {
			Select Manufactures = new Select(driver.findElement(loca_manufactures));			
			if(readExcel.getDataInCell(i, 5).contains("Iphone")) {
				Manufactures.selectByValue("1");
			}else if(readExcel.getDataInCell(i, 5).contains("Samsung")) {
				Manufactures.selectByValue("2");
			}else if(readExcel.getDataInCell(i, 5).contains("Nokia")) {
				Manufactures.selectByValue("4");
			}else if(readExcel.getDataInCell(i, 5).contains("HTC")) {
				Manufactures.selectByValue("6");
			}else if(readExcel.getDataInCell(i, 5).contains("Sony")) {
				Manufactures.selectByValue("7");
			}else if(readExcel.getDataInCell(i, 5).contains("Asus")) {
				Manufactures.selectByValue("8");
			}
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
					
		try {
			driver.findElement(loca_chooseFileButton).sendKeys(readExcel.getDataInCell(i, 6));
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
					
		WebElement contentFrame = driver.findElement(loca_contentFrame);
		driver.switchTo().frame(contentFrame);
		
		try {
			driver.findElement(loca_specification).sendKeys(readExcel.getDataInCell(i, 7));
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
				
		driver.switchTo().parentFrame();
		driver.findElement(loca_saveButton).click();
		Thread.sleep(2000);	
	
		List <WebElement> errorElement = driver.findElements(loca_errorMess);
		for(WebElement errorMess : errorElement) {
			System.out.println("Cannot add product No." + readExcel.getDataInCell(i, 0) + " - Error: " + errorMess.getText());
		}	
			
	}

}
