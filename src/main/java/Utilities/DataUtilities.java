package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class DataUtilities {
	
	
public String dataFromExcel(String filepath ,String sheetName,int rowNumber, int coloumnNumber) throws Throwable, IOException {
	File file = new File(filepath);      
	FileInputStream fileInput = new FileInputStream(file);
    Workbook wookbook = WorkbookFactory.create(fileInput);
   Sheet sheet = wookbook.getSheet(sheetName);   
   Row row = sheet.getRow(rowNumber);
   Cell cell = row.getCell(coloumnNumber);
   String value=cell.getStringCellValue();
    return value;

}

public String dataFromPropertiesFile(String filePath,String key) throws Throwable {	
	File file = new File(filePath);   
	FileInputStream fileInput = new FileInputStream(file);
	Properties pro = new Properties();
	pro.load(fileInput);
	String value = pro.getProperty(key);	
	return value;
}
}