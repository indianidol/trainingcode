package testNGexamples;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class Test2 {
	  @Test(groups = { "functest", "checkintest" })
	  public void testMethod21(Method m) {
		  
		  System.out.println(m);
	  }
	 
	  @Test(groups = {"functest", "checkintest"} )
	  public void testMethod22(Method m) {
		  
		  System.out.println(m);
	  }
	 
	  @Test(groups = { "functest" })
	  public void testMethod23(Method m) {
		  
		  System.out.println(m);
	  }
	}
