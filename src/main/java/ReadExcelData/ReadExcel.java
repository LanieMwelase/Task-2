package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
	//Loading an excel sheet
	File src= new File("C:\\Users\\User\\Desktop\\Thobelani Khanyi\\users");
	FileInputStream fis= new FileInputStream(src);
    
	XSSFWorkbook wb= new XSSFWorkbook(fis); 
	
	XSSFSheet sheet1=wb.getSheetAt(0);
	String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
	
	System.out.println("Data is" + data0);
	}

}
