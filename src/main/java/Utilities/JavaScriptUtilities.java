package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtilities {

	public void javaScriptClick(WebDriver driver, WebElement ele) {
		JavascriptExecutor jse	=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ele);
	}
	
	public void javaScriptSendData(WebDriver driver, WebElement ele,String dataToSend) {
		JavascriptExecutor jse	=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='"+dataToSend+"';", ele);
	}
	
	public void javaScriptHighLigthElement(WebDriver driver, WebElement ele) {
		JavascriptExecutor jse	=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].style.border='4px solid blue';", ele);
	}
	
	public void javaScriptNormalScroll(WebDriver driver) {
		JavascriptExecutor jse	=(JavascriptExecutor)driver;
		jse.executeScript("scrollBy(0,300);");
	}
	
	public void javaScriptVerifyTitle(WebDriver driver,String expectedTitle) {
		JavascriptExecutor jse	=(JavascriptExecutor)driver;
		String actualTitle=(String) jse.executeScript("return document.title;");
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("The  Title is same");
		}
		else {
			System.out.println("The Title is not same");
		}
	}
	
	public void javaScriptVerifyUrl(WebDriver driver,String expectedUrl) {
		JavascriptExecutor jse	=(JavascriptExecutor)driver;
		String actualUrl=(String) jse.executeScript("return document.URL;");
		if(actualUrl.equals(expectedUrl)) {
			System.out.println("The  Url is same");
		}
		else {
			System.out.println("The Url is not same");
		}
	}
	
	
	
	
}