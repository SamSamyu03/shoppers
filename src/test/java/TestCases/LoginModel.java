package TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PomClasses.HomePageAfterLogin;
import PomClasses.HomePageBeforeLogin;
import PomClasses.LoginPage;
import Utilities.BaseClass;
import Utilities.DataUtilities;

public class LoginModel extends BaseClass {
	
	
	
	@Test(groups= {"smokeTestCase","regrationTestcase"})
    public  void TC_Login_001() throws IOException, Throwable {		
		HomePageAfterLogin HmAL = new HomePageAfterLogin(driver);
	HmAL.getMenMenuLink().click();
	}
	
	
	@Test(groups={"smokeTestCase"})
	public void Tc_Login_002() {
		HomePageAfterLogin HmAL = new HomePageAfterLogin(driver);
		HmAL.getWomenMenuLink().click();	 
	}
}