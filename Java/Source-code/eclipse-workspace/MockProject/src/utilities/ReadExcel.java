package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	private static XSSFWorkbook workbook;
	private static XSSFSheet sheet;
	private static XSSFRow row;
	private static XSSFCell cell;
	
	//Open Excel
	public void setExcelFile(String excelFilePath, String sheetName) throws IOException {
		FileInputStream inputStream = new FileInputStream(excelFilePath);
		workbook = new XSSFWorkbook(inputStream);
		sheet = workbook.getSheet(sheetName);		
	}
	
	//Get data in cell
	public String getDataInCell(int rowNum, int cellNum) {
		row = sheet.getRow(rowNum);
		cell = row.getCell(cellNum);
		String cellData ;
		
		if(cell.getCellType() == CellType.NUMERIC) {
			return cellData = String.valueOf((long) cell.getNumericCellValue()); //ép kiểu qa long
		}else {
			return cellData = cell.getStringCellValue();
		}		
	}

	//Number of Row
	public int numOfRow() {
		int rowCount = sheet.getLastRowNum();	
		return rowCount;
	}
	
}
