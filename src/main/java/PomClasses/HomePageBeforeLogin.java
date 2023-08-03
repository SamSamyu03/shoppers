package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageBeforeLogin {

	WebDriver driver;
	
	public HomePageBeforeLogin(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="loginBtn")
	private WebElement loginMainButton;


	public WebElement getLoginMainButton() {
		return loginMainButton;
	}


	
}