package testNGexamples;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import poiApiReader.Xls_Reader;



public class testngDataExcel {

	//STM
	static Xls_Reader xls;
	@BeforeMethod
	public void Beforemethod() {
//		System.out.println(browser);
		System.out.println("Beforemethod");	
	}

	@BeforeSuite
	public void Beforesuite() {
		System.out.println("Beforesuite");
		
		String xlspath = System.getProperty("user.dir") + "\\resources\\data.xlsx";

		 xls = new Xls_Reader(xlspath);
	}

	@BeforeTest
	public void Beforetest() {
		System.out.println("BeforeTest");
	//	System.out.println("Iam going to do all steps before testing");
	}
/*
	@Test
	public void login() {
		System.out.println("Login");
	}

	@Test
	public void verifyemail() {
		System.out.println("Verifyemail");
	}

	@Test
	public void logout() {
		System.out.println("Logout");
	}
*/
	@AfterTest
	public void aftertestisdone() {
		System.out.println("Verifyemail");
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("Aftermethod");
	}

	@AfterSuite
	public void aftersuite() {
		System.out.println("aftersuite");
		
		
	}
	@DataProvider(name = "test1")
	public Object[][] createData1() {
	 return new Object[][] {
	   { "Cedric", new Integer(36) },
	   { "Anne", new Integer(37)},
	 };
	}
	 
	//This test method declares that its data should be supplied by the Data Provider
	//named "test1"
	@Test(dataProvider = "getDatafromexcel")
	public void verifyData1(String username,String password ) {
		
		
		System.out.println("User name "+ username +" pass "+ password);
	 
	}
	
	@DataProvider(name = "getDatafromexcel")
	public static Object[][] getDatafrom(){
	return	getDatafromexcel(xls,"TestData");
		
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
