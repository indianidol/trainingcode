package downloadshttp;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Downloading_File {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.ie.driver",  System.getProperty("user.dir")+"\\drivers\\IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();
		driver.get("http://qtpselenium.com/test/testdownload.php");
		FileDownloader file = new FileDownloader(driver,"C:\\testDownload\\");
		WebElement downloadLink =  driver.findElement(By.xpath("//a[text()='Word Doc']"));

		String downloadedFileAbsoluteLocation = file.downloader(downloadLink.getAttribute("href"));
		System.out.println(downloadedFileAbsoluteLocation);
	 

	}
	


}
