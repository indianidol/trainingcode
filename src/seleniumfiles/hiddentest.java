package seleniumfiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddentest {
	
	static WebDriver driver;

	public static void main(String[] args) {
		String path = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		 driver= new ChromeDriver();	
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	     driver.get(System.getProperty("user.dir")+"\\resources\\a.html");
	     
	     WebElement elem = driver.findElement(By.id("iskpiFilterAction"));
	     
	     if (driver instanceof JavascriptExecutor) {
		        ((JavascriptExecutor)driver).executeScript("arguments[0].type = 'button';", elem);
		    }
	     
	     System.out.println(driver.getPageSource());
		    
	     
	     

}
}