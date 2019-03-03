package page.object.model.tests;

import org.testng.annotations.Test;

import page.object.model.espncricinfo.pages.*;

public class dynamicXpathTest  extends TestBase{
	
	@Test
	public void verifyLandingpagefeatures(){
		
		System.out.println("test are run on "+ currentUrl);
		landingPage lp= new landingPage(driver, wait);
		lp.getplayersinfoToMatchdata();
		
	}

}
