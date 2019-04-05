package seleniumfiles;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testiedownload {
	public static void main(String[] args) throws InterruptedException, AWTException {
	String	url = "http://www.landxmlproject.org/file-cabinet";
		System.setProperty("webdriver.ie.driver",  System.getProperty("user.dir")+"\\drivers\\IEDriverServer.exe");
		//System.setProperty(InternetExplorerDriverService.IE_DRIVER_EXE_PROPERTY, "D:\\Common\\drivers\\IEDriverServer.exe");
		WebDriver ie = new InternetExplorerDriver();
		ie.get(url);
		String xpath="//*[@id=\"JOT_FILECAB_container_wuid:gx:1f8dedbad3c5e490\"]/td[3]/span[2]/a[2]";
	//	String account_xpath="//a[@class='js-load-dynamicmenu top-nav-account']";
		
	//	Thread.sleep(3000l);
		WebElement we = ie.findElement(By.xpath(xpath));
	//	System.out.println(ie.getWindowHandle());
		
		we.click();
		
	/*Set<String> hnd= ie.getWindowHandles();
	for(String s: hnd) {
		System.out.println(s);
	}*/
		ie.switchTo().defaultContent();
	/*	Thread.sleep(3000l);
		we.sendKeys(Keys.chord(Keys.ALT+"n"));*/
		
		  Robot robot = new Robot();  // Robot class throws AWT Exception	
          Thread.sleep(2000); 
        
          robot.keyPress(KeyEvent.VK_ALT);	
          //Thread.sleep(2000);	
          robot.keyPress(KeyEvent.VK_N);	
          //Thread.sleep(2000);	
          robot.keyRelease(KeyEvent.VK_ALT);	
          //Thread.sleep(2000);	
          robot.keyRelease(KeyEvent.VK_N);	
          //Thread.sleep(2000);	
          robot.keyPress(KeyEvent.VK_TAB);	
          //Thread.sleep(2000);	
          robot.keyPress(KeyEvent.VK_ENTER);	
          //Thread.sleep(2000);	
  /*        
          xpath="//*[@id=\"JOT_FILECAB_container_wuid:gx:2fdfdf8b6e1c3f12\"]/td[3]/span[2]/a[2]";
          
          we = ie.findElement(By.xpath(xpath));
  		System.out.println(ie.getWindowHandle());
  		
  		we.click();
  	  
      Thread.sleep(2000); // Thread.sleep throws InterruptedException  
    
      robot.keyPress(KeyEvent.VK_ALT);	
      Thread.sleep(2000);	
      robot.keyPress(KeyEvent.VK_N);	
      Thread.sleep(2000);	
      robot.keyRelease(KeyEvent.VK_ALT);	
      Thread.sleep(2000);	
      robot.keyRelease(KeyEvent.VK_N);	
      Thread.sleep(2000);	
      robot.keyPress(KeyEvent.VK_TAB);	
      Thread.sleep(2000);	
      robot.keyPress(KeyEvent.VK_ENTER);	
      Thread.sleep(2000);	*/
      
         
		
	}

}
