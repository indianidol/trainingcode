package advance;

import java.io.FileInputStream;
import java.util.Properties;



public class readprop {
	public static Properties envProp;
	public static Properties prop;// env.properties

	public String testName;
	

	
	public static void main(String[] args) {
		prop = new Properties();
		envProp = new Properties();	
		
		// TODO Auto-generated method stub
		try {
			FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"//resources//env.properties");
			prop.load(fs);// init env.properties
			System.out.println(prop.getProperty("env"));
			String env=prop.getProperty("env");
			
			
			fs = new FileInputStream(System.getProperty("user.dir")+"//resources//"+env+".properties");
			envProp.load(fs);
			System.out.println(envProp.getProperty("url"));
			
			System.out.println(envProp.getProperty("adminusername"));
			
			System.out.println(envProp.getProperty("adminpassword"));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
