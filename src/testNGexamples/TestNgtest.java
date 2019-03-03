package testNGexamples;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgtest {
	String fname="kartik";
	@BeforeTest
	  public void beforetest() {
		    /*    long id = Thread.currentThread().getId();
		        System.out.println("Before test-method. Thread id is: " + id);*/			 
			 
			 //fname= "Hello test";
		
		System.out.println();
			 
			 
		    }
	
	 @BeforeMethod
	    public void beforeMethod() {
	    /*    long id = Thread.currentThread().getId();
	        System.out.println("Before test-method. Thread id is: " + id);*/
		 
		 
	//	 fname= "Hello";
		 
	    }
	 
	    @Test(dataProvider="getdata")
	    //, dependsOnMethods = {"testMethodsTwo" }, description = "This test will test this functionality ", groups = { "smoke",	"regression" }, invocationCount = 1)
	    public void testMethodsOne(Object c1, Object c2, Object c3 ) {
	    	
	    //	System.out.println(fname);
	    	
	    			System.out.println(c1 +" "+ c2+" "+c3 );
	   /* 	
	        long id = Thread.currentThread().getId();
	        System.out.println("Simple test-method One. Thread id is: " + id);*/
	    
	    	}
	    
	    
	
	    @Test
	    public void testMethodsTwo() {
	    	
	    	System.out.println(fname);
	     /*   long id = Thread.currentThread().getId();
	        System.out.println("Simple test-method Two. Thread id is: " + id);*/
	    }
	 
	    @AfterMethod
	    public void afterMethod() {
	      /*  long id = Thread.currentThread().getId();
	        System.out.println("After test-method. Thread id is: " + id);*/
	    }
	    
	    @DataProvider
	    public Object[][] getdata() {
	       Object[][] data= new Object[2][3];
	       
	       	data[0][0]= "1st roow, 1col";
	       	data[0][1]= "1st row  2col";
	       	data[0][2]= "1st row 3col";

	       	data[1][0]= "2nd roow, 1col";
	       	data[1][1]= "2nd row  2col";
	       	data[1][2]= "2nd row 3col";
	       	
	       	
	       	return data;
	    	
	    }	
}
		