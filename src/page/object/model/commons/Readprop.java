package page.object.model.commons;

import java.io.FileInputStream;
import java.util.Properties;



public class Readprop extends CommonVariables{
	
	public static void getproperties() {
		configProp = new Properties();
		// TODO Auto-generated method stub
		try {
			FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"//pomResources//testconfig.properties");
			configProp.load(fs);// init env.properties
			System.out.println(configProp.getProperty("url"));		
			
			currentUrl= configProp.getProperty("url");
			browser= configProp.getProperty("browser");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
