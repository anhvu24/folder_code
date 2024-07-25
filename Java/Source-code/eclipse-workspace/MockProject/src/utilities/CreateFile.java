package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateFile {

	public static void main(String[] args) throws IOException {
	int random2 = (int) Math.floor(((Math.random() * 899) + 100));
	int random = (int) Math.floor(((Math.random() * 899999999) + 100000000));
	String path = "E:\\Tester\\testData.xlsx";

	//Khoi tao workbook 
		XSSFWorkbook wb = new XSSFWorkbook();
		
	//Khoi tao sheet
		XSSFSheet sh = wb.createSheet("productData");
		Font headerFont = wb.createFont();  
		headerFont.setBold(true);  
		headerFont.setFontHeightInPoints((short) 14);  
		headerFont.setColor(IndexedColors.RED.getIndex());  
		
	//Du lieu duoc ghi xuong file excel
		Map<String, Object[]> data = new TreeMap<String, Object[]>();
		data.put("1", new Object[] {"NAME", "PRICE", "QUALITY","SALE","MANUAFACTORY", "IMAGE", "CONTENT"});
		data.put("2", new Object[] {"Sample 1", "100000", "10", "5", 1, "C:\\Users\\Administrator\\Downloads\\iphone_11_white_4_.jpg", "Hello! This is sample product 1"});
		data.put("3", new Object[] {"Sample 2", "100000", "10", "5", 1, "C:\\Users\\Administrator\\Downloads\\iphone_11_white_4_.jpg", "Hello! This is sample product 2"});
		data.put("4", new Object[] {"Sample 3", "100000", "10", "5", 2, "C:\\Users\\Administrator\\Downloads\\iphone_11_white_4_.jpg", "Hello! This is sample product 3"});
		data.put("5", new Object[] {"Sample 4", "100000", "10", "5", 2, "C:\\Users\\Administrator\\Downloads\\iphone_11_white_4_.jpg", "Hello! This is sample product 4"});
		data.put("6", new Object[] {"Sample 5", "100000", "10", "5", 2, "C:\\Users\\Administrator\\Downloads\\iphone_11_white_4_.jpg", "Hello! This is sample product 5"});
		data.put("7", new Object[] {"Sample 6", "100000", "10", "5", 4, "C:\\Users\\Administrator\\Downloads\\iphone_11_white_4_.jpg", "Hello! This is sample product 6"});
		data.put("8", new Object[] {"Sample 7", "100000", "10", "5", 4, "C:\\Users\\Administrator\\Downloads\\iphone_11_white_4_.jpg", "Hello! This is sample product 7"});
		data.put("9", new Object[] {"Sample 8", "100000", "10", "5", 5, "C:\\Users\\Administrator\\Downloads\\iphone_11_white_4_.jpg", "Hello! This is sample product 8"});
		data.put("10", new Object[] {"Sample 9", "100000", "10", "5", 5, "C:\\Users\\Administrator\\Downloads\\iphone_11_white_4_.jpg", "Hello! This is sample product 9"});
		data.put("11", new Object[] {"Sample 10", "100000", "10", "5", 0, "C:\\Users\\Administrator\\Downloads\\iphone_11_white_4_.jpg", "Hello! This is sample product 10"});
	
	//Duyet va them du lieu tung row
		Set<String> keyset = data.keySet();
		int rownum = 0;
		for (String key : keyset) {
			Row row = sh.createRow(rownum++);
			Object[] objArr = data.get(key);
			int cellnum = 0;
			for (Object obj : objArr) {
				Cell cell = row.createCell(cellnum++);
				if (obj instanceof String) {
					cell.setCellValue((String) obj);
				}else if (obj instanceof Integer)
					cell.setCellValue((Integer) obj); 	
			}
		}
		try {
			FileOutputStream out = new FileOutputStream(path);
			wb.write(out);
			out.close();
			wb.close();
			System.out.println("data.xlsx is written successful on disk");
		}catch (Exception e) {
			e.getStackTrace();
		}
	}
}
