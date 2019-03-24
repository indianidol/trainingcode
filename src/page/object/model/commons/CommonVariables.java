package page.object.model.commons;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import poiApiReader.Xls_Reader;
import seleniumfiles.MyListener;

public class CommonVariables {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Properties configProp;
	public static String currentUrl;
	public static String browser;
	public Readprop rp;

	public BrowserManger bM;
	public static String xlspath;
	public static Xls_Reader xls;	
	public static String testDataSheet;
	
	public static String currentTestCase;
	
	
	EventFiringWebDriver eventHandler;
	MyListener eCapture;
	
	public static String reportpath;
	public static String screenshotFolderPath;
	
	 public static ExtentReports extent;
	public ExtentTest test;
}
