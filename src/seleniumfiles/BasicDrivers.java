package seleniumfiles;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;
// automation -  stable projects - functional phase

public class BasicDrivers {
	/*public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
	//	System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");

		
		ChromeDriver cd = new ChromeDriver();
	}*/
	
	@Test
	public void launchSite() throws InterruptedException{	
		String url = "https://www.rediff.com";
		
	/*	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		//System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		
		
		ChromeDriver driver = new ChromeDriver();
	//	cd.get(url);	
		driver.manage().window().maximize();
//		driver.manage().window().fullscreen();
		driver.navigate().to(url);
		
		
	List<WebElement> wes= new ArrayList<WebElement>(); 	
	
	wes=driver.findElements(By.xpath("//a[@href]"));
	
	
	
	System.out.println(wes.size());
	*/
	
	
	
		
//	WebElement maleradio=driver.findElement(By.xpath("//input[@type='radio']//parent::*"));
	
//	String value =maleradio.getAttribute("value");
	
	//String text = maleradio.getText();
	
	//System.out.println(text);
			
	
	
		
		/*String account_xpath="//span[@class='top-nav-account']";
		
		driver.findElementByXPath(account_xpath).click();
		driver.findElementByXPath("//input[@name='username']").sendKeys("kartikraman@gmail.com");
		
		ChromeDriver cd = new ChromeDriver();
		cd.get("http://yahoo.com");
		cd.quit();
		*/
		
		
		//********************************************************************************************		
			
		
		
	//https://ftp.mozilla.org/pub/firefox/releases/
	// timeout 45000 -  binary of firefox not found
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
		File pathToBinary = new File("C:/Users/Ramkar/AppData/Local/Mozilla Firefox/firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();   
		
		
		 FirefoxOptions options = new FirefoxOptions()
			      .addPreference("browser.startup.page", 1)
			      .addPreference("browser.startup.homepage", "https://www.rediff.com").setBinary(ffBinary)
			      ;	
		 
		 
		WebDriver driver = new FirefoxDriver(options);	
		
	//	FirefoxDriver driver = new FirefoxDriver();
		
		
/*		
	driver.get("http://www.popuptest.com");		
	String firsthandle=	driver.getWindowHandle();	
	System.out.println(firsthandle);		
	driver.findElement(By.xpath("//a[@href='popuptest1.html']")).click();		
		Thread.sleep(5000l);		
	Set<String> windowHndles=	driver.getWindowHandles();	
	Iterator<String> i = windowHndles.iterator();
	while (i.hasNext()) {
		System.out.println(i.next());
		
//		driver.switchTo().window("6442450995");
		break;	
	}		
	driver.switchTo().defaultContent();
	
	driver.switchTo().window(firsthandle);
		
	driver.quit();
				
	*/
	
	
		
	//********************************************************************************************
		
	/*	
		// IE
		// zoom level 100%
		// protected mode turned off and level to least positions
		// security setting - allow active content
		// 32 or 64
	
			
		String url = "https://www.google.com";
		System.setProperty("webdriver.ie.driver",  System.getProperty("user.dir")+"\\drivers\\IEDriverServer.exe");
		//System.setProperty(InternetExplorerDriverService.IE_DRIVER_EXE_PROPERTY, "D:\\Common\\drivers\\IEDriverServer.exe");
		InternetExplorerDriver ie = new InternetExplorerDriver();
		ie.get(url);
		String xpath="//input[@name='q']";
	//	String account_xpath="//a[@class='js-load-dynamicmenu top-nav-account']";
		
	//	Thread.sleep(3000l);
		
		ie.findElementByXPath(xpath).click();
		ie.findElementByXPath(xpath).sendKeys("hello");;
		
	//	ie.findElementByXPath(xpath).sendKeys(Keys.ENTER);
		
		ie.findElementByXPath(xpath).sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);*/
		
		//********************************************************************************************
		
		
		//driver.quit();// closes exe.. browser.. selenium session
	//driver.close();
		
		
		
		
		/*
		// Edge
		// careful about version of exe
		//System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\drivers\\MicrosoftWebDriver.exe");
	//	EdgeDriver ed = new EdgeDriver();
	//	ed.get("http://yahoo.com");
	//	driver.quit();
*/		
		
		
		
	}

}
