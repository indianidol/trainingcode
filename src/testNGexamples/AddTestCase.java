package testNGexamples;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddTestCase {
	//prop
	static String url="uat.chewy.com";
	
	//datasheets
	static String username="kartik";
	static	String password="password";
	
	static String data= "aquarium";

	
	//db
	static	int Count ; 
	
/*	
	public static void main(String[] args) {
		AddTestCase adt= new AddTestCase();
		
		adt.navigatetourl(url);
		adt.logintihusernameandpassword(username,password);
		adt.serachaquarim(data);
		adt.verifyreults(Count);
		
		adt.logout();
	}*/
	
	
	
@BeforeTest

public void beforeTes() {
	 System.out.println("connect db and get results");
}

	 @BeforeMethod
	    public void beforeMethod() {
	    // 
		/* connect to db >> username/[password]

				 run the query 

				 get results*/
		 

		 Count =36;
		 
	//	 System.out.println("connect db");
	

	 }

	 @AfterTest
	    public void afterTest() {
	    // 
		/* dis copnnect connect to db >> username/[password]

				 run the query 

				 get results*/

		 System.out.println("Disconnect db");
	    }
	
	@AfterMethod
	    public void afterMethod() {
	    // 
		/* dis copnnect connect to db >> username/[password]

				 run the query 

				 get results*/

//		 System.out.println("Disconnect db");
	    }
	
		
	
	//methods
	@Test
	public void anavigatetourl1() {
		
	//	Goto chewy.com  // launch the browser and navigate to chewy.com
		
		System.out.println("Navigate to chewy.com " + url);
	
	}
	
	@Test
	public void blogintihusernameandpassword2() {
		
		System.out.println("Logged in with user "+ username + " and password "+ password);
		//2.     Login// user un, pass acnd click on login
		//System.out.println("Im in add department test case");
	}
	
	@Test
	public void cserachaquarim3() {
		System.out.println("searching for "+ data);
		
		//3.     Search for aquarium //in the search option type aquarium hit enter
	}
	
@Test
	public void dverifyreults4() {
		
		System.out.println("Verification");
		
		//4.     Count no of results returned in the suggestions and print // count the reults and match with stor the result
	}
	@Test
	public void elogout5() {
		
		System.out.println("Logout");
	}
}