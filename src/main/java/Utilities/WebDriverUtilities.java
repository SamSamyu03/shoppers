package Utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtilities {

	public void takingScreenshotOfWebPage(WebDriver driver) throws IOException{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File tempfile = ts.getScreenshotAs(OutputType.FILE);
		String TimeStamp=LocalDateTime.now().toString().replace(':', '-');
		File parmentFile = new File("./Screenshots/"+TimeStamp+"WebPage.png");
		FileHandler.copy(tempfile, parmentFile);
	}
	
	public void takingScreenshotOfWebElelemnt(WebDriver driver,WebElement element) throws IOException {
		File tempfile =element.getScreenshotAs(OutputType.FILE);
		String TimeStamp=LocalDateTime.now().toString().replace(':', '-');
		File parmentFile = new File("./Screenshots/"+TimeStamp+"WebElelemnt.png");
		FileHandler.copy(tempfile, parmentFile);
	}
	
	public void waitTillElementVisible(WebDriver driver,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitTillAlertPopUpPresent(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public void waitTillElementToBeclickable(WebDriver driver,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitTillUrlToBeMatch(WebDriver driver,String Url) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlMatches(Url));
	}
	
	public void mouseOverOnElement(WebElement ele,WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(ele);
		action.build().perform();
	}
	
	public void DargAndDropOperation(WebDriver driver,WebElement dragelelemnt,WebElement dropElement) {
		Actions action = new Actions(driver);
		action.dragAndDrop(dragelelemnt, dropElement);
		action.build().perform();
	}
	
	public void verifySingleOrMultiSelectDropDown(WebElement SelectTagElelemnt) {
		Select select = new Select(SelectTagElelemnt);
		boolean Verify = select.isMultiple();
		if(Verify==true) {
			System.out.println("The drop down is multi select");
		}
		else {
			System.out.println("The drop down is single select");
		}
	}
	
	public void selectDropDownByVisibleText(WebElement SelectTagElelemnt,String Copletetext) {
		Select select = new Select(SelectTagElelemnt);
		select.selectByVisibleText(Copletetext);	
	}
	
	public void selectDropDownByIndex(WebElement SelectTagElelemnt,int index) {
		Select select = new Select(SelectTagElelemnt);
		select.selectByIndex(index);	
	}
	
	public void selectDropDownByValue(WebElement SelectTagElelemnt,String valueOfValueAttribute) {
		Select select = new Select(SelectTagElelemnt);
		select.selectByValue(valueOfValueAttribute);	
	}
	
	public void keyBordPressAndRelease(WebDriver driver,WebElement ele, Keys button) {
		
		Actions action = new Actions(driver);
		action.keyDown(button).click(ele).keyUp(button).build().perform();
	}
	
	public void mouseCoordinateClick(WebDriver driver,int Xcoordinate,int Ycoordinate) {
		Actions action = new Actions(driver);
		action.moveByOffset(Xcoordinate, Ycoordinate).click().build().perform();
	}
}
