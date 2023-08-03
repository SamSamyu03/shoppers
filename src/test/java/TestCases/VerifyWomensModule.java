package TestCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PomClasses.CartPage;
import PomClasses.HomePageAfterLogin;
import PomClasses.Womens;
import Utilities.BaseClass;

public class VerifyWomensModule extends BaseClass{
	
	@Test
	public void Tc_Women_003() {
		HomePageAfterLogin HPAL = new HomePageAfterLogin(driver);
		HPAL.getWomenMenuLink().click();
		
		Womens womensPom=new Womens(driver);
		womensPom.getwomenKurthiAddToButton().click();
		
		
		HPAL.getMainCartIcon().click();
		
		
		CartPage CartPom =new CartPage(driver);
		
		String actualResult=CartPom.getRayYonSleeveLength().getText();
		
//		SoftAssert assr =new SoftAssert();
//		assr.assertEquals(actualResult, "IndianClothings");
//		assr.assertAll();
//		System.out.println("by");
		
		System.out.println("Done");
		
		if(actualResult.contains("Fabric : Rayon")) {
			
			System.out.println("The test case is pass");
			
		}
		else {
			System.out.println("test case fails");
		}
		
	}

}
