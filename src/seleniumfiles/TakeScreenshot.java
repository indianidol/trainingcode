package seleniumfiles;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class TakeScreenshot {

    @Test

    public void TakeScreenShot() throws Exception{

	
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
		File pathToBinary = new File("C:/Users/Ramkar/AppData/Local/Mozilla Firefox/firefox.exe");
		 FirefoxOptions options = new FirefoxOptions();
			FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		 options.setBinary(ffBinary);
		WebDriver driver = new FirefoxDriver(options);	
        //goto url

        driver.get("https://www.chewy.com");

        //Call take screenshot function

        this.takeSnapShot(driver, System.getProperty("user.dir")+"//screenshots/test.png") ;     

    }

    /**

     * This function will take screenshot

     * @param webdriver	
	
     * @param fileWithPath

     * @throws Exception

     */

    public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

    }

}