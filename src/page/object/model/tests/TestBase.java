package page.object.model.tests;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import seleniumfiles.MyListener;

public class TestBase {

	WebDriver driver;
	WebDriverWait wait;

	@BeforeMethod
	public void initTest(Method method) {
		String path = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);

		/*
		 * EventFiringWebDriver eventHandler = new EventFiringWebDriver(driver);
		 * MyListener eCapture = new MyListener(); // Registering with
		 * EventFiringWebDriver // Register method allows to register our
		 * implementation of // WebDriverEventListner to listen to the WebDriver
		 * events eventHandler.register(eCapture); driver = eventHandler;
		 */

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000l, TimeUnit.SECONDS);

		driver.get("https://www.chewy.com/");

		wait = new WebDriverWait(driver, 30);

	}

	@AfterMethod
	public void quit() {

	//	driver.quit();

	}

}
