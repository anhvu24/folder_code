package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtilities {
	public static XSSFSheet excelSheet;
	public static XSSFCell cell;

	public void setExcelFile(String Path, String SheetName) throws IOException {
	try {
		FileInputStream ExcelFile = new FileInputStream(Path);
		XSSFWorkbook wb = new XSSFWorkbook (ExcelFile);
		excelSheet = wb.getSheet(SheetName);
		wb.close();
	}catch (Exception e) {
		e.getStackTrace();
	}
}
	
	public String getExcelFile(int rowNum, int cellNum) {
		DataFormatter formatter = new DataFormatter();
		return formatter.formatCellValue(excelSheet.getRow(rowNum).getCell(cellNum));
	}

}