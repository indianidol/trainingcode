package seleniumfiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser extends commonv{
	
	String url="http://www.facebook.com";
// this can be executed using xml only 
	@Test
	@Parameters("Browser")
	public void openBrowser(String browser) {

		if (browser.equalsIgnoreCase("FF")) {
			System.out.println("Starting geckodriver ");
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
			System.out.println("FF "+driver.getWindowHandle());
		

		} else if (browser.equalsIgnoreCase("IE")) {
System.out.println("Starting IEDriverServer ");
			System.setProperty("webdriver.ie.driver",  System.getProperty("user.dir")+"\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.get(url);
			System.out.println("IE "+driver.getWindowHandle());
		}else if (browser.equalsIgnoreCase("Chrome")) {
			System.out.println("Starting chromedriver ");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
			driver	 = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			System.out.println("Chrome "+driver.getWindowHandle());
		
		}
	}
/*	@Test
	public void zgetdata() x{
		System.out.println("Driver "+driver.getWindowHandle());
	}
*/
}