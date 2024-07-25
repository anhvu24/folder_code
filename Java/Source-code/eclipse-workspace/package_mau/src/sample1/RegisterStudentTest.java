package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.ExcelUtils;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class RegisterStudentTest {
    
	//creating object of ExcelUtils class
    static ExcelUtils excelUtils = new ExcelUtils();
    
    //For win
    static String excelFilePath = "C:\\Users\\Hi\\eclipse-workspace\\MockProject\\data\\TestData.xlsx";
    
    public static  void main(String args[]) throws IOException {
    	             
        //Creating an object of Safari 
        System.setProperty("webdriver.chrome.driver", "D:\\CODE\\WebDriver\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        //launching the specified URL
        driver.get("http://14.176.232.213/mobilevn/");
        
        //Identify the WebElements for the student registration form
        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement lastName = driver.findElement(By.id("lastName"));
        WebElement email = driver.findElement(By.id("userEmail"));
        WebElement gender1 = driver.findElement(By.id("gender-radio-1"));
        WebElement gender2 = driver.findElement(By.id("gender-radio-2"));
        WebElement gender3 = driver.findElement(By.id("gender-radio-3"));
        WebElement mobile = driver.findElement(By.id("userNumber"));
        WebElement address = driver.findElement(By.id("currentAddress"));
        WebElement submitBtn = driver.findElement(By.id("submit"));
       // gender1.isElementDisplayed();
        String fileGen;
        //calling the ExcelUtils class method to initialise the workbook and sheet
        excelUtils.setExcelFile(excelFilePath,"STUDENT_DATA");

        //iterate over all the row to print the data present in each cell.
        for(int i = 1; i <= excelUtils.getRowCountInSheet(); i++)
        {
        	//Enter the values read from Excel in firstname,lastname,mobile,email,address System.setProperty("webdriver.gecko.driver",Path_of_Firefox_Driver");
        	firstName.sendKeys(excelUtils.getCellData(i,0));
        	lastName.sendKeys(excelUtils.getCellData(i,1));
        	email.sendKeys(excelUtils.getCellData(i,2));
        	
        	fileGen = excelUtils.getCellData(i, 3);
        	
            
        	//Click on the gender radio button using javascript
        	JavascriptExecutor js = (JavascriptExecutor) driver;
        	switch (fileGen) {
        	case "Male":
        		js.executeScript("arguments[0].click();", gender1);
        		break;
        	case "Female":
        		js.executeScript("arguments[0].click();", gender2);
        		break;
        	default:
        		js.executeScript("arguments[0].click();", gender3);
        	}
         
        	
        	mobile.sendKeys(excelUtils.getCellData(i,4));
        	address.sendKeys(excelUtils.getCellData(i,5));
        	
        	//Get value gender from file
        	
       
        	//Click on submit button
        	submitBtn.click();
        
        	//Verify the confirmation message
            WebElement confirmationMessage = driver.findElement(By.xpath("//div[text()='Thanks for submitting the form']"));
            
            //check if confirmation message is displayed
            if (confirmationMessage.isDisplayed()) {
            	// if the message is displayed , write PASS in the excel sheet using the method of ExcelUtils
            	excelUtils.setCellValue(i,6,"PASS",excelFilePath);
            } else {
                //if the message is not displayed , write FAIL in the excel sheet using the method of ExcelUtils
                excelUtils.setCellValue(i,6,"FAIL",excelFilePath);
            }

            //close the confirmation popup
            WebElement closebtn=driver.findElement(By.id("closeLargeModal"));
            closebtn.click();
         
            //wait for page to come back to registration page after close button is clicked
            driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
        }
        //closing the driver
        driver.quit(); 
    }
}
