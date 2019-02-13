package seleniumfiles;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Firefox_OptionsExample {

	public static void main(String[] args) {
		// pre requisites - 1,2 versions back, turn off automatic updates
		// logs
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, System.getProperty("user.dir")+"\\logs\\firefox.log");
		// binary
		FirefoxOptions options = new FirefoxOptions();
		//options.setBinary("C:/Users/Ramkar/AppData/Local/Mozilla Firefox/firefox.exe");
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
		File pathToBinary = new File("C:/Users/Ramkar/AppData/Local/Mozilla Firefox/firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
	//	FirefoxProfile firefoxProfile = new FirefoxProfile();   
		
		
		  options.addPreference("browser.startup.page", 1);
		  options.addPreference("browser.startup.homepage", "https://www.rediff.com");
		  options.setBinary(ffBinary);
			      
		 
		 
		
		
		
		// Profiling--firefox.exe -p profilemanager
		// tell selenium to launch mod -11
		/*ProfilesIni allProf = new ProfilesIni();// all profiles on pc
		FirefoxProfile prof = allProf.getProfile("Mod11");
		// notifications
		prof.setPreference("dom.webnotifications.enabled", false);// turn off
		// certificate
		prof.setAcceptUntrustedCertificates(true);
		prof.setAssumeUntrustedCertificateIssuer(false);*/
		
		//proxy servers
/*		prof.setPreference("network.proxy.type", 1);
		prof.setPreference("network.proxy.socks", "83.209.94.87");
		prof.setPreference("network.proxy.socks_port", 35923);
		
		options.setProfile(prof);*/
	    
	    
		WebDriver driver = new FirefoxDriver(options);// launching browser
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");// going to site
		//driver.findElement(By.id("login1")).sendKeys("hello");// typing
		
	}

}
