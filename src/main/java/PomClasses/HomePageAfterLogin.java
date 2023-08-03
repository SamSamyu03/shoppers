package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WebDriverUtilities;

public class HomePageAfterLogin {

	public WebDriver driver;
	
	public HomePageAfterLogin(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="men")
	private WebElement MenMenuLink;
	
	@FindBy(xpath="//*[name()='svg' and @data-testid='SettingsIcon']")
	private WebElement AccountSettingIcon;
	
	@FindBy(xpath="//*[name()='svg' and @data-testid='LogoutIcon']")
	private WebElement LogoutIcon;
	
	@FindBy(id="women")
	private WebElement WomenMenuLink;
	
	@FindBy(id="kids")
	private WebElement KidsMenuLink;
	
	@FindBy(id="electronics")
	private WebElement ElectronicMenuLink;
	
	@FindBy(id="beautyProducts")
	private WebElement BeautyMenuLink;
	
	@FindBy(xpath="//*[name()='svg' and @id='cartIcon']")
	private WebElement MainCartIcon;
	
	public WebElement getBeautyMenuLink() {
		return BeautyMenuLink;
	}
	
	public WebElement getMainCartIcon() {
		return MainCartIcon;
	}
	public WebElement getElectronicMenuLink() {
		return ElectronicMenuLink;
	}
	
	public WebElement getKidsMenuLinks() {
		return KidsMenuLink;
	}
	
	public WebElement getAccountSettingIcon() {
		return AccountSettingIcon;
	}
	
	public WebElement getLogoutIcon() {
		return LogoutIcon;
	}
	
	public WebElement getMenMenuLink() {
		return MenMenuLink;
	}
	public WebElement getWomenMenuLink() {
		return WomenMenuLink;
	}
}