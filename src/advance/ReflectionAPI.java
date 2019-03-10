package advance;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// calling method whose name we store in a variable
public class ReflectionAPI {
	
	public static void main(String[] args) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		//sampleTest("xxxXX");
			String x="sampleTest";
			//String meth=read name from xls file
			Class myclass= advance.ReflectionAPI.class;
			Method method= myclass.getMethod(x, String.class);
			
			method.invoke(method, "hello");
			
			
	        System.out.println("end");
		}
		
		public static void sampleTest(String x){
			

			String name = new Object(){}.getClass().getEnclosingMethod().getName();
			
			
			//LOG.INFO("CURRENTLY EXECUTONG ": name))
			System.out.println("in sample test-- "+x);
		}

	}

