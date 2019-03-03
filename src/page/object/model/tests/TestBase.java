package page.object.model.tests;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import page.object.model.commons.CommonVariables;
import page.object.model.commons.Readprop;
import seleniumfiles.MyListener;

public class TestBase extends CommonVariables {

	@BeforeSuite
	public void initSuite() {
		rp = new Readprop();
		rp.getproperties();
	}

	@BeforeMethod
	public void initTest(Method method) {
		
		
		switch	(configProp.getProperty("browser").toUpperCase()){		
		
		case  "CHROME":
			
			String path = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);

		/*
		 * EventFiringWebDriver eventHandler = new EventFiringWebDriver(driver);
		 * MyListener eCapture = new MyListener(); // Registering with
		 * EventFiringWebDriver // Register method allows to register our implementation
		 * of // WebDriverEventListner to listen to the WebDriver events
		 * eventHandler.register(eCapture); driver = eventHandler;
		 */

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000l, TimeUnit.SECONDS);
		driver.get(configProp.getProperty("url"));
		// driver.get(currentUrl);
		wait = new WebDriverWait(driver, 30);
		
		case "FIREFOX":
			
			
			System.out.println("Firefox");
			
		case "IE":
		
			System.out.println("Firefox");
			
		}

	}

	@AfterMethod
	public void quit() throws IOException {
		driver.quit();
		Runtime.getRuntime().exec("taskkill /im chromedriver.exe /f");
		

	}

}
