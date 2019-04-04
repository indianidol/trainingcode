package seleniumfiles;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test extends commonv{
	@Test
	public void zgetdata() {
		System.out.println("Driver "+(driver).getWindowHandle());
	
	}

}
