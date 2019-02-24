package seleniumfiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
*/
public class highlightjs {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		String path = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		 driver= new ChromeDriver();	
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	     driver.get("https://www.chewy.com/");
	     String xpath= "//a[@class='cw-logo']";
	     By by= By.xpath(xpath);
		
		findElement(by);
	}

	public static WebElement findElement(By by) {
		/*String path = System.getProperty("user.dir")+"\\src\\resources\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver= new ChromeDriver();	
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);*/
	    WebElement elem = driver.findElement(by);
	    // draw a border around the found element
	    if (driver instanceof JavascriptExecutor) {
	        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid green'", elem);
	    }
	    
	    /*WebElement element = driver.findElement(By.id("id_of_element"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	    */

	    return elem;
	}	
	}
