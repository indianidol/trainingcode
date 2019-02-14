package seleniumfiles;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class uploadDownLoad {
	public static void main(String[] args) throws InterruptedException {
	//	 uploadFiles();
		downLoadchrome();
	}

	private static void uploadFiles() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		String baseUrl = "http://demo.guru99.com/test/upload/";
		WebDriver driver = new ChromeDriver();

		driver.get(baseUrl);
		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

		// enter the file path onto the file-selection input field
		uploadElement.sendKeys(System.getProperty("user.dir") + "\\files\\test.txt");

		// check the "I accept the terms of service" check box
		driver.findElement(By.id("terms")).click();

		// click the "UploadFile" button
		driver.findElement(By.name("send")).click();
	}

	private static void downLoadFF() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
		String baseUrl ="https://templates.office.com/en-us/Loan-calculator-TM03986985";
				//"http://file-examples.com/index.php/sample-documents-download/sample-doc-download/";
				//"https://templates.office.com/en-us/Loan-calculator-TM03986985";
		// binary
		//https://www.hdfcbank.com/personal/form_centers/form_centers
		
		//http://kb.mozillazine.org/Firefox_:_FAQs_:_About:config_Entries
		
		////a[@href='http://www.hdfcbank.com/assets/pdf/Combined_Address_Change_Form.pdf']
		
		
		
		//options.setBinary("C:/Users/Ramkar/AppData/Local/Mozilla Firefox/firefox.exe");
		//options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		

		
		FirefoxProfile profile = new FirefoxProfile();
	

	profile.setPreference("browser.download.folderList", 2);
//	profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/csv, text/csv");
	//https://www.freeformatter.com/mime-types-list.html
		
	
	/*profile.setPreference("browser.download.manager.showWhenStarting", false);
	profile.setPreference("browser.download.manager.showAlertOnComplete", false);

	profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/octet-stream, application/vnd.openxmlformats-officedocument.spreadsheetml.template, application/x-unknown, application/javascript"); 
			//"application/msword");
	profile.setPreference("browser.download.dir", System.getProperty("user.dir") + File.separator + "externalFiles");*/
	
	/*profile.setPreference("browser.helperApps.alwaysAsk.force", false);
	profile.setPreference("browser.download.manager.showWhenStarting",false);*/
	FirefoxOptions options = new FirefoxOptions();
	//options.setProfile(profile);
	//options.addPreference(key, value)
	
	options.addPreference("browser.download.folderList", 2);
	options.addPreference("browser.download.dir", System.getProperty("user.dir") + File.separator + "externalFiles");
	options.addPreference("browser.download.useDownloadDir", true);
	options.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/octet-stream");
//	options.addPreference("pdfjs.disabled", true);

		
		 // options.addPreference("browser.startup.page", 1);
		//  options.addPreference("browser.startup.homepage", "https://www.rediff.com");
/*
	File pathToBinary = new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
	FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
	options.setBinary(ffBinary);
		//a[text()='Download sample DOC file'][1]
		
		
		WebDriver driver = new FirefoxDriver(options);	
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 300);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		driver.get(baseUrl);		
		
		
		
		//WebElement downloadElement = driver.findElement(By.xpath("//a[text()='Download sample DOC file'][1]"));
		
		
		
		WebElement downloadElement = driver.findElement(By.xpath("//a[@data-app='Excel']"));
		
		downloadElement.click();
		*/
	
	}
	
	private static void downLoadchrome() throws InterruptedException {
		String baseUrl ="https://templates.office.com/en-us/Loan-calculator-TM03986985";	
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();

			// Setting new download directory path
			Map<String, Object> prefs = new HashMap<String, Object>();

			// Use File.separator as it will work on any OS
			prefs.put("download.default_directory", System.getProperty("user.dir") + File.separator + "externalFiles");

			ops.setExperimentalOption("prefs", prefs);

			WebDriver driver = new ChromeDriver(ops);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(baseUrl);

		
			WebElement downloadElement = driver.findElement(By.xpath("//a[@data-app='Excel']"));
			
			downloadElement.click();
	
	}
}
	