package seleniumfiles;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class SetDownloadPath {

    Robot r;

    @Test
    public void setPath() {

        System.setProperty("webdriver.ie.driver",
                "C:\\Users\\drivers\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
        capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        capabilities.setCapability("requireWindowFocus", true);
        capabilities.setCapability("nativeEvents", false);
        capabilities.setCapability("unexpectedAlertBehaviour", "accept");
        capabilities.setCapability("ignoreProtectedModeSetting", true);
        capabilities.setCapability("disable-popup-blocking", true);
        capabilities.setCapability("enablePersistentHover", true);
        capabilities.setCapability("ignoreZoomSetting", true);
        capabilities.setCapability("EnableNativeEvents", false);
        capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
        capabilities.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);

        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.get("file:///C:\\Users\\ToBeSaved.pdf");
        String defaultPath = "C:\\Users\\DefaultSavedLocation";
        StringSelection stringSelection = new StringSelection(defaultPath);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, stringSelection);

        try {
            Thread.sleep(4000);
             r = new Robot();

            // Open the Pop Up
            r.keyPress(KeyEvent.VK_CONTROL);
            r.keyPress(KeyEvent.VK_SHIFT);
            r.keyPress(KeyEvent.VK_S);
            r.keyRelease(KeyEvent.VK_S);
            r.keyRelease(KeyEvent.VK_SHIFT);
            r.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(4000);
            // Reach to the URL bar
            for (int i = 0; i < 6; i++) {
                r.keyPress(KeyEvent.VK_TAB);
                r.keyRelease(KeyEvent.VK_TAB);
            }
            // Paste the copied default ULR
            r.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(4000);
            r.keyPress(KeyEvent.VK_CONTROL);
            r.keyPress(KeyEvent.VK_V);
            r.keyRelease(KeyEvent.VK_V);
            r.keyRelease(KeyEvent.VK_CONTROL);
            // Save the file
            for (int i = 0; i < 5; i++) {
                Thread.sleep(2000);
                r.keyPress(KeyEvent.VK_ENTER);
            }

        } catch (AWTException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
     //   modifyregistryfordownloadpath();
    }

	private void modifyregistryfordownloadpath() {
		String path = "\"C:\\Test\"";
        String cmd1 = "REG ADD \"HKEY_CURRENT_USER\\Software\\Microsoft\\Internet Explorer\\Main\" /F /V \"Default Download Directory\" /T REG_SZ /D "+ path;

        try {
            Runtime.getRuntime().exec(cmd1);
        } catch (Exception e) {
            System.out.println("Coulnd't change the registry for default directory for IE");
        }
	}
}