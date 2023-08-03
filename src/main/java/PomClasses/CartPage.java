package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	public WebDriver driver;
	
	
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//h3[text()='indianclothings']/..//p[2]")
	private WebElement rayYonSleeveLength;


	public WebElement getRayYonSleeveLength() {
		return rayYonSleeveLength;
	}
	
	
	
}
