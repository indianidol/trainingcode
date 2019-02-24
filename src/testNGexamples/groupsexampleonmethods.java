package testNGexamples;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class groupsexampleonmethods {

	
@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite()");
	}
@BeforeTest
public void beforetest() {
	System.out.println("@BeforeTest()");
}
@BeforeMethod
public void beforemethod() {
	System.out.println("@beforemethod()");
}
@BeforeClass
public void beforeclass() {
	System.out.println("@beforeclass()");
}


	@BeforeGroups("database")
	public void setupDB() {
		System.out.println("setupDB()");
	}
	
	@AfterGroups("database")
	public void cleanDB() {
		System.out.println("cleanDB()");
	}
	
	@Test(groups= "selenium-test")
	public void runSelenium() {
		System.out.println("group runSelenium");
	}

	@Test(groups= "selenium-test")
	public void runSelenium1() {
		System.out.println("runSelenium()1");
	}
	
	@Test(groups = "database")
	public void testConnectOracle() {
		System.out.println("testConnectOracle()");
	}

	@Test(groups = "database")
	public void testConnectMsSQL() {
		System.out.println("testConnectMsSQL");
	}
	
	@Test(dependsOnGroups = {"database","selenium-test"})
	public void runFinal() {
		System.out.println("runFinal");
	}
	
}