package seleniumfiles;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_Options {
	// pre requisites - careful with chrome version
	// logs
	// Notifications, info bars and maximized
	// page load strategy
	// binary
	// PROXY
	// Profiling
	// certificate
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();

		// Setting new download directory path
		Map<String, Object> prefs = new HashMap<String, Object>();

		// Use File.separator as it will work on any OS
		prefs.put("download.default_directory", System.getProperty("user.dir") + File.separator + "externalFiles");

		ops.setExperimentalOption("prefs", prefs);

	

		// ops.addArguments("--disable-notifications");
		// ops.addArguments("disable-infobars");
		ops.addArguments("--start-maximized");
		// ops.setHeadless(true);
		// ops.addArguments("--proxy-server=http://83.209.94.87:8123");
		// ops.addArguments("user-data-dir=C:\\Users\\lenovo\\AppData\\Local\\Google\\Chrome\\User
		// Data\\Profile 1\\");// Dont give default folder

		// ops.setPageLoadStrategy(PageLoadStrategy.EAGER);
		// ops.setBinary("PATH TO EXE");

		// System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY,
		// "D://chrome.log");
		// System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,
		// "true");

		WebDriver driver = new ChromeDriver(ops);

		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());

		//
		// a[starts-with(@title,'Li')]
		// ends-with(., '') -not supported
		// https://stackoverflow.com/questions/26217002/how-to-use-starts-with-contains-and-ends-with-in-xpath-to-find-the-xml-n

		// a[contains(@title,'Li')]

		// u[contains(text(),'rediffmail')]

	}

}
