package seleniumfiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;*/

public class makemytrip {
	public static void main(String[] args) {
	String path = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver= new ChromeDriver();
		
		EventFiringWebDriver eventHandler = new EventFiringWebDriver(driver); 
			MyListener eCapture = new MyListener(); 
			//Registering with EventFiringWebDriver
			 //Register method allows to register our implementation of WebDriverEventListner to listen to the WebDriver events
			eventHandler.register(eCapture); 
			driver= eventHandler;	
			
			
			
			
			
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000l, TimeUnit.SECONDS);
		driver.get("https://flights.makemytrip.com/makemytrip/search/R/R/E/1/0/0/S/V0/BLR_BOM_20-03-2019,BOM_BLR_27-04-2019?contains=false&remove=");
		WebElement Slider= driver.findElement(By.xpath("//a[@class='ui-slider-handle ui-state-default ui-corner-all']"));
		Actions action =new  Actions(driver);
		action.moveToElement(Slider).clickAndHold().moveByOffset(-50, 0).release().build().perform();
	
	
	
	
	
	}

}
