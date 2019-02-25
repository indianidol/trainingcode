package page.object.model.tests;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import page.object.model.pages.landingPage;
import page.object.model.pages.loggedInHomePage;

public class testCases  extends TestBase{
	
	
	
	
	@Test
	public void verifyLandingpagefeatures(){
		
		landingPage lp= new landingPage(driver, wait);		
		
		  Assert.assertTrue(lp.gettitle().equals("Pet Food, Products, Supplies at Low Prices - Free Shipping | Chewy.com"));
		  
		  org.testng.Assert.assertEquals(10, lp.getdefaultSugesstionCount());
	}
	
	

	@Test
	public void verifyLoginfunctionality(){
		
		landingPage lp= new landingPage(driver, wait);		
		loggedInHomePage lhp = new loggedInHomePage(driver, wait);		 
		
		lp.login("Cignitiracqa@gmail.com", "India@123");
		
		Assert.assertEquals("Welcome back, cigniti!", 	lhp.getWelcomeText());			
	}


}
