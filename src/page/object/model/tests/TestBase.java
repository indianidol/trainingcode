package page.object.model.tests;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import page.object.model.commons.BrowserManger;
import page.object.model.commons.CommonVariables;
import page.object.model.commons.ExtentManager;
import page.object.model.commons.Readprop;
import poiApiReader.Xls_Reader;
import seleniumfiles.MyListener;


public class TestBase extends CommonVariables {

	@BeforeSuite
	public void initSuite() {
		rp = new Readprop();
		rp.getproperties();
		xls = new Xls_Reader(xlspath);
	}
	
	

	@BeforeMethod
	public void initTest(Method method) {		
		bM = new BrowserManger();
		currentTestCase= method.getName();
		
		rep = ExtentManager.getInstance(reportpath);
		test = rep.createTest(currentTestCase);
		
		
	}

	//@AfterMethod
	public void quit() throws IOException {
		driver.quit();
		Runtime.getRuntime().exec("taskkill /im chromedriver.exe /f");
		

	}
	@DataProvider(name = "getDatafromexcel")
	public static Object[][] getDatafrom(){
	return	getDatafromexcel(xls,testDataSheet);
		
	}
	
	
	
	public static Object[][] getDatafromexcel(Xls_Reader xls , String testCaseName){
		// if the sheet is not present
		if(! xls.isSheetExist(testCaseName)){
			xls=null;
			return new Object[1][0];
		}
		
		
		int rows=xls.getRowCount(testCaseName);
		int cols=xls.getColumnCount(testCaseName);
		//System.out.println("Rows are -- "+ rows);
		//System.out.println("Cols are -- "+ cols);
		
	    Object[][] data =new Object[rows-1][cols];
	    
	    
		for(int rowNum=2;rowNum<=rows;rowNum++){
			for(int colNum=0;colNum<cols;colNum++){
				System.out.print(xls.getCellData(testCaseName, colNum, rowNum) + " -- ");
				data[rowNum-2][colNum] = xls.getCellData(testCaseName, colNum, rowNum);
			}
			//System.out.println();
		}
		return data;
		
	}

}
