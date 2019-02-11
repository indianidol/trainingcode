package seleniumfiles;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
 
public class WaitForNewWindowTest {
 
    @org.testng.annotations.Test
    public void testApp() {
 
        WebDriver driver = new FirefoxDriver();
 
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 
        driver.get("http://automate-apps.com/contents/");
 
        driver.findElement(By.id("why-selenium")).click();
 
        //Verify new window is opened or not
        Assert.assertTrue(waitForNewWindow(driver,10), "New window is not opened");
 
        System.out.println("New window has been opened");
 
        driver.quit();
    }
 
    public boolean waitForNewWindow(WebDriver driver, int timeout){
          boolean flag = false;
          int counter = 0;
          while(!flag){
              try {
                  Set<String> winId = driver.getWindowHandles();
                  if(winId.size() > 1){
                      flag = true;
                      return flag;
                  }
                  Thread.sleep(1000);
                  counter++;
                  if(counter > timeout){
                      return flag;
                  }
              } catch (Exception e) {
                  System.out.println(e.getMessage());
                  return false;
              }
          }
          return flag;
      }
   
    public static String waitForNewWindowWithGivenTitleSwitchToIt(WebDriver driver,  Set<String> allpreviousWindowHandles, String expectedtitle) throws InterruptedException {
        String cHandle = driver.getWindowHandle();
        String newWindowHandle = null;
 
        
        Set<String> allWindowHandles= driver.getWindowHandles();
        
        setDifference(allWindowHandles,allpreviousWindowHandles);
        //Wait for 20 seconds for the new window and throw exception if not found
        for (int i = 0; i < 20; i++) {
        	
        	   if(setDifference(allWindowHandles,allpreviousWindowHandles).size()>0){
        		   
        		   switchToWindow(driver,expectedtitle);
        		   break;
        		   
        		 /*  for(String s:setDifference(allWindowHandles,allpreviousWindowHandles)){
        			   driver.switchTo().window(s);
        			   String title=driver.getTitle();
        			   if(title.equals(expectedtitle)){
        				   driver.switchTo().window(s);
        				   newWindowHandle=s;
        			   }
        		   }*/
        	   }
            
        	    else {
        	    	 Thread.sleep(1000);
        	    	allWindowHandles= driver.getWindowHandles();
               
            }
        }
        if (setDifference(allWindowHandles,allpreviousWindowHandles).size()==0) {
            throw new RuntimeException(
                    "Time out - No window found");
        }
        return newWindowHandle;
    }

    public static String waitForNewWindowWithGivenTitleSwitchToIt(WebDriver driver, int previouswindowcount, Set<String> allpreviousWindowHandles, String expectedtitle) throws InterruptedException {
        String cHandle = driver.getWindowHandle();
        String newWindowHandle = null;
        
        
        Set<String> allWindowHandles= driver.getWindowHandles();
        
        setDifference(allWindowHandles,allpreviousWindowHandles);
        //Wait for 20 seconds for the new window and throw exception if not found
        for (int i = 0; i < 20; i++) {
        	
        	   if(setDifference(allWindowHandles,allpreviousWindowHandles).size()>0){
        		   
        		   switchToWindow(driver,expectedtitle);
        		   
        		 /*  for(String s:setDifference(allWindowHandles,allpreviousWindowHandles)){
        			   driver.switchTo().window(s);
        			   String title=driver.getTitle();
        			   if(title.equals(expectedtitle)){
        				   driver.switchTo().window(s);
        				   newWindowHandle=s;
        			   }
        		   }*/
        	   }
            
        	    else {
                Thread.sleep(1000);
            }
        }
        if (setDifference(allWindowHandles,allpreviousWindowHandles).size()==0) {
            throw new RuntimeException(
                    "Time out - No window found");
        }
        return newWindowHandle;
    }
    public static Boolean switchToWindow(WebDriver driver,String title) {
        String Parent_window = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        for(String handle : handles) {
            driver.switchTo().window(handle);
            if (driver.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        driver.switchTo().window(Parent_window);
        return false;
    }
    
    public static Set<String> setDifference(final Set<String> set1, final Set<String> set2){
    	Set<String> retSet;
        final Set<String> larger = set1.size() > set2.size() ? set1 : set2;
        final Set<String> smaller = larger.equals(set1) ? set2 : set1;
        retSet=larger.stream().filter(n -> !smaller.contains(n)).collect(Collectors.toSet());
        return retSet;
    }
}

