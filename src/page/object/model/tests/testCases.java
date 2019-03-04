package page.object.model.tests;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

import page.object.model.chewy.pages.landingPage;
import page.object.model.chewy.pages.loggedInHomePage;

public class testCases extends TestBase {

	// @Test
	public void verifyLandingpagefeatures() {

		landingPage lp = new landingPage(driver, wait);

		Assert.assertTrue(
				lp.gettitle().equals("Pet Food, Products, Supplies at Low Prices - Free Shipping | Chewy.com"));

		org.testng.Assert.assertEquals(10, lp.getdefaultSugesstionCount());
	}

	@Test(dataProvider = "getDatafromexcel")
	public void verifyLoginfunctionality(String runMode, String username, String password, String user) {

		if (runMode.equals("Y")) {
			landingPage lp = new landingPage(driver, wait);
			loggedInHomePage lhp = new loggedInHomePage(driver, wait);

			// lp.login("Cignitiracqa@gmail.com", "India@123");

			lp.login(username, password);
			Assert.assertEquals("Welcome back, " + user + "!", lhp.getWelcomeText());
		} else {
			throw new SkipException(currentTestCase + "Skipped with username  " + username);
		}
	}

}
