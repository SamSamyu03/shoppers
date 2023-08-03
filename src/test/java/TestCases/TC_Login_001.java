package TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.BaseClass;
import Utilities.WebDriverUtilities;

public class TC_Login_001 extends BaseClass { 

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file= new File("C:\\dataExcel");
		FileInputStream fileInput=new FileInputStream (file);
		
		Workbook WookBook=WorkbookFactory.create(fileInput);
		Sheet sheet = WookBook.getSheet("Sheet1");
		
		String PASS =sheet.getRow(1).getCell(2).getStringCellValue();
		System.out.println(PASS);
		
		
		
		

		 
		
	}

}
///ShopperStack/src/main/resources/data.properties

//System.setProperty("webdriver.chrome.driver","./src/main/resources/drivers/chromedriver.exe");
//WebDriver driver = new ChromeDriver();
//driver.get("https://shoppersstack.com/");
///WebDriverUtilities util = new WebDriverUtilities();
//util.takingScreenshotOfWebPage(driver);
//driver.close();

//*********************************************************************

//File file= new File("./src/main/resources/data.properties");
//FileInputStream fileInput=new FileInputStream (file);
// Properties Pro= new Properties();
// Pro.load(fileInput);
 
// String URL=Pro.getProperty("url");
 //String USERNAME=Pro.getProperty("username");
 //String PASSWORD=Pro.getProperty("password");
 
// System.out.println(URL);
 //System.out.println(USERNAME);
// System.out.println(PASSWORD);