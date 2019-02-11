package seleniumfiles;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class popup {
public static void main(String[] args) throws InterruptedException {
	String path = System.getProperty("user.dir")+"\\src\\resources\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	WebDriver driver= new ChromeDriver();	
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
     //driver.navigate().back();
     
     /*\
      //Pop up Window
     String parenthandle =driver.getWindowHandle();
     System.out.println("Parent handle is :" + parenthandle);
     driver.get("http://www.popuptest.com/");
     
     System.out.println("Parent URL is "+driver.getCurrentUrl());
     System.out.println("Parent title is "+driver.getTitle());
      
     
     Set<String> beforehandles = driver.getWindowHandles();		
     for(String s:beforehandles){
    	 System.out.println(s);
     }
     
     driver.findElement(By.xpath("//a[text()='Multi-PopUp Test #2']")).click();
     Thread.sleep(3000);
     Set<String> afterhandles = driver.getWindowHandles();		
     for(String s:afterhandles){
    	 System.out.println(s);
    	 
    	 driver.switchTo().window(s);
    	  System.out.println("Current URL is "+driver.getCurrentUrl());
    	     System.out.println("Current title is "+driver.getTitle());
    	     //driver.manage().window().maximize();
    	 
    	     Thread.sleep(2000);
    	     driver.switchTo().window(parenthandle);
    	     //driver.switchTo().defaultContent();
    	      
    	      driver.close();
    	       
    */ 
    /*	    
     // JavaScript Popup
       driver.get("http://only-testing-blog.blogspot.com/2013/09/test.html");
     
    	//     driver.findElement(By.xpath("//input[@id='submitButton']")).click();
    	     
    	     driver.findElement(By.xpath("//button[text()='Get Confirmation']")).click();
    	     WebDriverWait wait = new WebDriverWait(driver, 10);
    	     //wait.until(ExpectedConditions.alertIsPresent());
    	  //   driver.switchTo().alert().accept();
    	     driver.switchTo().alert().dismiss();
    	     */
     
     //frame
     driver.get("http://only-testing-blog.blogspot.com/2013/09/test.html");
     System.out.println(driver.findElements(By.tagName("iframe")).size());
     driver.switchTo().frame(0);

 //    driver.switchTo().frame("I0_1545065751690");
     driver.findElement(By.xpath("//a[contains(@href,'plus.google.com/share?app=110')]//div[@id='button']")).click();
     
     
}
	
	
}
